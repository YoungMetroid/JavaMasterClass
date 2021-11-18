package LeetCode;

public class StringToInteger
{

    public int myAtoi(String s)
    {
        s = s.trim();
        int index = 0;
        if(s.length() ==0) return 0;
        if(s.charAt(0) == '-' || s.charAt(0) == '+' )
        {
            index = 1;

        }
        if(s.length() == index) return 0;
        if(s.charAt(index) < 48 || s.charAt(index) > 57)
        {
            return 0;
        }
        for(; index < s.length(); index++)
        {
            if(s.charAt(index) < 48 ||   s.charAt(index) > 57)
                break;
        }
        s = s.substring(0,index);
        try
        {
            return Integer.parseInt(s);
        }
        catch(NumberFormatException ex)
        {

        }
        if(s.charAt(0) == '-')          return Integer.MIN_VALUE;
        else     return Integer.MAX_VALUE;



    }


}
