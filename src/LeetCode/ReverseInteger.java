package LeetCode;

public class ReverseInteger
{

    public int reverse(int x)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(x);
        if("-".equals(stringBuilder.substring(0,1)))
        {
            {
           String subString = stringBuilder.substring(1);
           stringBuilder.setLength(0);
           stringBuilder.append(subString);
           stringBuilder.reverse();
           stringBuilder.insert(0,"-");
        }
        }
        else stringBuilder.reverse();

        try {
            int reverse = Integer.parseInt(stringBuilder.toString());
            return reverse;
        }
        catch (NumberFormatException ex)
        {
            System.out.println(ex);
        }
        return 0;


    }
}
