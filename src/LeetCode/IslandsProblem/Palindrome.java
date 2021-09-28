package LeetCode.IslandsProblem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Palindrome {

    int leftIndex;
    int rightIndex;
    List<String> list;
    public String longestPalindrome(String palindrome)
    {
        list = new ArrayList<>();
        int index = palindrome.length()/2;
        leftIndex = index;
        rightIndex = index;

        Object[] infoMiddle = findMiddeOfRepeatedCharacter(palindrome,index);

        int[] info;
        if((boolean) infoMiddle[1])
        {
            info = palindromeCheckEven(palindrome, (int)infoMiddle[0]);
        }
        else
        {
            info = palindromeCheckOdd(palindrome, (int)infoMiddle[0]);
        }
        leftIndex = info[0];
        rightIndex = info[1];

        list.add(palindrome.substring(0,1));
        while(leftIndex !=0 || rightIndex != palindrome.length())
        {
            Object[] leftMiddle = findMiddeOfRepeatedCharacter(palindrome,leftIndex);
            Object[] rightMiddle = findMiddeOfRepeatedCharacter(palindrome,rightIndex);
            if((boolean) leftMiddle[1])
            {
                info = palindromeCheckEven(palindrome, (int)leftMiddle[0]);
            }
            else
            {
                info = palindromeCheckOdd(palindrome,(int)leftMiddle[0]);
            }

            if(info[0] < leftIndex)
                leftIndex= info[0];
            if(info[1] > rightIndex)
                rightIndex = info[1];

            if((boolean) rightMiddle[1])
            {
                info = palindromeCheckEven(palindrome, (int)rightMiddle[0]);
            }
            else
            {
                info = palindromeCheckOdd(palindrome,(int)rightMiddle[0]);
            }

            if(info[0] < leftIndex)
                leftIndex= info[0];
            if(info[1] > rightIndex)
                rightIndex = info[1];
        }
        String longest =  list.stream().max(Comparator.comparingInt(String::length)).map(Object::toString).orElse("");
        return longest;
    }

    public int[] palindromeCheckEven(String palindrome,int index)
    {
        int leftEdge = index-1;
        int rightEdge = index;
        boolean inwhileLoop = false;
        if(rightEdge >=palindrome.length())
        {
            if(leftEdge < 0 )
                return new int[]{0,palindrome.length()};
            return new int[]{leftEdge, palindrome.length()};
        }
        if(leftEdge < 0 )
        {
            return new int[]{0,rightEdge};
        }



        while(leftEdge > 0 && rightEdge < palindrome.length())
        {
            inwhileLoop = true;
            leftEdge--;
            rightEdge++;

            if(rightEdge == palindrome.length())
            {
                leftEdge++;
                break;
            }

            if(leftEdge == -1)
            {
                leftEdge++;
                break;
            }

            if(palindrome.charAt(leftEdge) != palindrome.charAt(rightEdge))
            {
                leftEdge++;
                break;
            }
        }



        if(!inwhileLoop && palindrome.length() == 2)
        {
            if(palindrome.charAt(0) == palindrome.charAt(1))
            {
                list.add(palindrome.substring(0,palindrome.length()));
                return new int[]{ 0,palindrome.length()};
            }
        }
        if(leftEdge == 0 && rightEdge < palindrome.length())
        {
           rightEdge++;
        }
        list.add(palindrome.substring(leftEdge,rightEdge));

        if(leftEdge > 0)
        {
            return new int[]{leftEdge-1,rightEdge};
        }


        return new int[]{leftEdge == -1? 0:leftEdge,rightEdge};
    }

    public int[] palindromeCheckOdd(String palindrome,int index)
    {
        int leftEdge = index-1;
        int rightEdge = index+1;

        if(rightEdge >=palindrome.length())
        {
            if(leftEdge < 0 )
                return new int[]{0,palindrome.length()};
            return new int[]{leftEdge, palindrome.length()};
        }
        if(leftEdge < 0 )
        {
            return new int[]{0,rightEdge};
        }



        while(leftEdge >= 0 && rightEdge < palindrome.length())
        {

            if(palindrome.charAt(leftEdge) != palindrome.charAt(rightEdge))
            {
                break;
            }
            leftEdge--;
            rightEdge++;
        }
        list.add(palindrome.substring(leftEdge+1,rightEdge));
        return new int[]{leftEdge == -1? 0:leftEdge,rightEdge};
    }
    public Object[] findMiddeOfRepeatedCharacter(String palindrome, int index)
    {
        if(index == palindrome.length())
        {
            return new Object[]{index,false};
        }
        char indexChar = palindrome.charAt(index);
        int leftEdge = index;
        int rightEdge = index;
        boolean leftSame = true;

        int leftLimitSearch = -1;
        int rightLimitSearch = palindrome.length();
        while(leftEdge != leftLimitSearch || rightEdge != rightLimitSearch)
        {
            if(leftEdge > -1) {

                if (leftEdge != leftLimitSearch && palindrome.charAt(leftEdge) != indexChar) {
                    leftSame = false;
                    leftLimitSearch = leftEdge;
                } else if(leftSame){
                    leftEdge--;
                }
            }


            if(rightEdge < palindrome.length())
            {
                if (palindrome.charAt(rightEdge) != indexChar) {
                    rightLimitSearch = rightEdge;
                } else{
                    rightEdge++;
                }
            }

        }

        if(leftEdge> index)
            leftEdge=index;

        if(rightEdge < index )
            rightEdge= index;

        if(!leftSame)
            leftEdge++;

        if(leftEdge == -1)
            leftEdge++;


        double middleIndex = Math.ceil((rightEdge-leftEdge)/2);
        String subString = palindrome.substring(leftEdge,rightEdge);

        boolean even = subString.length()% 2 != 0;
        return new Object[]{(int)(middleIndex+leftEdge),!even};

    }
}
