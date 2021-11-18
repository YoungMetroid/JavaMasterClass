package LeetCode;

public class PalindromeNumber
{
    public boolean isPalindrome(int num)
    {
        int revereNum = 0;

        while(num > revereNum)
        {
            revereNum = revereNum *10 + num%10;

            num = num/10;
        }

        return num == revereNum || num == revereNum/10;
    }
}
