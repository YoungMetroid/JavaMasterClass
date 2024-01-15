package section5;

public class DigitSum {
    public static void main(String[] args)
    {
        System.out.println(DigitSums(125));
    }
    public static int DigitSums(int number)
    {
        if(number <10 ) return -1;
        int sum = 0;
        while(number > 0)
        {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
