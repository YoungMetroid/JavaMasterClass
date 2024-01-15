package LeetCode.IslandsProblem;

public class CreateShortestPalindromeFromLeft
{
    String nonePalindrome;
    public CreateShortestPalindromeFromLeft()
    {
        nonePalindrome = "";
    }

    public String shortestPalindrome(String nonePalindrome)
    {
        this.nonePalindrome = nonePalindrome;

        if(nonePalindrome.length() < 2 ) return nonePalindrome;


        int indexStart = findLastIndexOfFirstRepeatedCharacter();

        if(indexStart == nonePalindrome.length()-1) return nonePalindrome;

        int indexEnd = longestPalindromeLeftOnly(indexStart);

        if(indexEnd == nonePalindrome.length() -1) return nonePalindrome;

        String subString = nonePalindrome.substring(indexEnd+1);
        subString = reverseString(subString);
        return subString+nonePalindrome;

    }
    public String reverseString(String subString)
    {
        StringBuilder stringBuilder = new StringBuilder(subString);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
    public int longestPalindromeLeftOnly(int indexStart)
    {
        int indexEnd = indexStart;
        for(int currentIndex = indexStart; currentIndex<=nonePalindrome.length()/2; currentIndex++)
        {
            String palindromeSubString = nonePalindrome.substring(0,currentIndex+1);
            StringBuilder stringBuilder = new StringBuilder(palindromeSubString);
            stringBuilder.reverse();
            palindromeSubString = stringBuilder.toString();

            if(checkIfPalindrome(palindromeSubString,currentIndex))
            {
                indexEnd = palindromeSubString.length()-1 + palindromeSubString.length()-1;
            }
            else if(checkIfPalindrome(palindromeSubString,currentIndex+1))
            {
                indexEnd = palindromeSubString.length()-1 + palindromeSubString.length();
            }
        }
        return indexEnd;
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

            if( index+subStringIndex == nonePalindrome.length() ||
            currentSubString.charAt(subStringIndex) != nonePalindrome.charAt(index+subStringIndex))
            {
                return false;
            }
        }
        return true;
    }

}
