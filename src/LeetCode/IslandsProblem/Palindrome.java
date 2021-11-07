package LeetCode.IslandsProblem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Palindrome
{
  public String longestPalindrome(String palindrome)
  {
     String longest = palindrome.substring(0,1);
    for(int currentIndex = 0; currentIndex < palindrome.length(); currentIndex++)
    {

      //palindrome length is odd
      String palindromeOdd = palindromeSearch(palindrome,currentIndex-1,currentIndex+1);

      //palindrome length is even
      String palindromeEven = "";
      if(currentIndex+1 < palindrome.length() && palindrome.charAt(currentIndex) == palindrome.charAt(currentIndex+1))
       palindromeEven = palindromeSearch(palindrome,currentIndex,currentIndex+1);

     if(palindromeOdd.length() >= palindromeEven.length())
     {
       if(palindromeOdd.length() > longest.length())
       {
         longest = palindromeOdd;
       }
     }
     else if(palindromeEven .length()> longest.length())
     {
       longest = palindromeEven;
     }

    }
    return longest;
  }

  public String palindromeSearch(String palindrome, int leftIndex, int rightIndex)
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

    return palindrome.substring(leftIndex,rightIndex+1);
  }
}
