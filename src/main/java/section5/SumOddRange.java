package section5;

public class SumOddRange {

    public static void main(String[] args)
    {
        System.out.println(sumOdd(1, 10));
    }
    public static boolean isOdd(int number){
        if(number > 0 )
        {
            if(number % 2 == 0) return false;
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end)
    {
        int sum = 0;
        if(start <= 0 || end <=0 || start > end) return -1;

        for(; start <= end; start++)
        {
            if(isOdd(start)) sum+=start;
        }
        return sum;
    }
}
