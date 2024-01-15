package LeetCode.IslandsProblem;

public class ShortestPalindrome
{
    private String nonePalindrome="";
    public String findShortestPalindromeLeftRight(String nonePalindrome)
    {
        this.nonePalindrome=nonePalindrome;

        int[] indexOfEdgePalindrome = longestPalindrome(nonePalindrome);

        if("".equals(nonePalindrome))
        {
            return  nonePalindrome;
        }
        if(indexOfEdgePalindrome == null)
        {
            String subString = nonePalindrome.substring(1);
            subString = reverseString(subString);
            return subString+nonePalindrome;
        }
        else if(indexOfEdgePalindrome[0] == 0 && nonePalindrome.length() == indexOfEdgePalindrome[1]+1)
        {
            return nonePalindrome.substring(0,1)+nonePalindrome;
        }
        else if (indexOfEdgePalindrome[0] == 0)
        {
            String subString = nonePalindrome.substring(indexOfEdgePalindrome[1]+1);
            subString = reverseString(subString);
            return subString+nonePalindrome;
        }
        else
        {
            String subString = nonePalindrome.substring(0,indexOfEdgePalindrome[0]);
            return nonePalindrome+subString;
        }
    }

    public String findShortestPalindrome(String nonePalindrome)
    {
        this.nonePalindrome = nonePalindrome;

        if("".equals(nonePalindrome))
        {
            return  nonePalindrome;
        }
        if(nonePalindrome.length() == 1)
        {
            return nonePalindrome;
        }
        if(nonePalindrome.length() == 2)
        {
            if(nonePalindrome.charAt(0) == nonePalindrome.charAt(1))
            {
                return nonePalindrome;
            }
            else
            {
                return nonePalindrome.substring(1) + nonePalindrome;
            }
        }

        int indexToStartSearch = findLastIndexOfFirstRepeatedCharacter();
        int rightEdge = longestPalindromeLeftOnly(indexToStartSearch);

        if(rightEdge == 0 )
        {
            String subString = nonePalindrome.substring(1);
            subString = reverseString(subString);
            return subString+nonePalindrome;
        }
        if(rightEdge == nonePalindrome.length())
        {
            return nonePalindrome;
        }
        else
        {
            String subString = nonePalindrome.substring(rightEdge);
            subString = reverseString(subString);
            return subString+nonePalindrome;
        }
    }



    public String reverseString(String subString)
    {
        StringBuilder stringBuilder = new StringBuilder(subString);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public int[] longestPalindrome(String palindrome)
    {

        int[]longestEdgePalindrome = null;
        int currentLength = 0;
        for(int currentIndex = 0; currentIndex < palindrome.length()/2; currentIndex++)
        {

            //palindrome length is odd
            int[] array1 = palindromeSearch(palindrome,currentIndex-1,currentIndex+1);

            //palindrome length is even
            int[] array2 = null;
            if(currentIndex+1 < palindrome.length() && palindrome.charAt(currentIndex) == palindrome.charAt(currentIndex+1))
                array2 = palindromeSearch(palindrome,currentIndex,currentIndex+1);

            int length1 = 0;
            int length2 = 0;
            if(array1 != null)
            {
               length1 = array1[1]- array1[0];
            }
            if(array2 != null)
            {
               length2 = array2[1]- array2[0];
            }

            if(length1 > length2)
            {
                if(currentLength < length1)
                {
                    currentLength = length1;
                    longestEdgePalindrome = array1;
                }
            }
            else if(currentLength < length2)
            {
                currentLength = length2;
                longestEdgePalindrome = array2;
            }


        }
        return longestEdgePalindrome;
    }

    public int[] palindromeSearch(String palindrome, int leftIndex, int rightIndex)
    {

        while(leftIndex >= 0 && rightIndex < palindrome.length())
        {
            if(palindrome.charAt(leftIndex) == palindrome.charAt(rightIndex))
            {
                leftIndex--;
                rightIndex++;
            }
            else
            {
                leftIndex++;
                rightIndex--;
                break;
            }
        }
        if(leftIndex == -1 || rightIndex == palindrome.length())
        {
            leftIndex++;
            rightIndex--;
        }

        //UnComment to find the shorest palindrome by adding either to the left or to the right
        //
        if(leftIndex==0 /*|| rightIndex == palindrome.length()-1*/)
            return new int[]{leftIndex,rightIndex};
        return null;
    }

    public int longestPalindromeLeftOnly(int indexStartSearch)
    {
        int endOfPalindromeIndex = indexStartSearch;
        for(int currentIndex = indexStartSearch; currentIndex <= nonePalindrome.length()/2; currentIndex++)
        {
            if(currentIndex <1)
                continue;

            String palindromeSubString = nonePalindrome.substring(0,currentIndex+1);

            StringBuilder stringBuilder = new StringBuilder(palindromeSubString);
            stringBuilder.reverse();
            palindromeSubString = stringBuilder.toString();

            if(checkIfPalindrome(palindromeSubString,currentIndex))
            {
                endOfPalindromeIndex = palindromeSubString.length() + palindromeSubString.length();
            }
            else if(checkIfPalindrome(palindromeSubString,currentIndex+1))
            {
                endOfPalindromeIndex = palindromeSubString.length() + palindromeSubString.length()+1;
            }

        }

        return endOfPalindromeIndex;
    }
    public int findLastIndexOfFirstRepeatedCharacter()
    {
        char firstCharacter = nonePalindrome.charAt(0);
        int lastSameIndex = 1;
        for(; lastSameIndex < nonePalindrome.length();lastSameIndex++)
        {
            if(firstCharacter != nonePalindrome.charAt(lastSameIndex))
            {
                break;
            }
        }

        lastSameIndex--;
        return lastSameIndex;
    }
    boolean checkIfPalindrome(String currentSubString,int index)
    {
        for(int subStringIndex = 0; subStringIndex < currentSubString.length();subStringIndex++)
        {

            if(currentSubString.charAt(subStringIndex) != nonePalindrome.charAt(index+subStringIndex))
            {
                return false;
            }
        }
        return true;
    }
}
