package section5;

public class SharedDigit {
    public static void main (String[] String) {

        System.out.println(hasSharedDigit(9, 20));
    }
    public static boolean hasSharedDigit(int first, int second){
        if(first >= 10 && first <=99 && second >=10 && second <=99)
        {
            while(first >0){
                int digit = first % 10;
                if(numberExists(digit, second)) return true;
                first/=10;
            }
            return false;
        }
        else return false;
    }
    public static boolean numberExists(int searchNumber, int number){
        while(number > 0)
        {
            int digit = number %10;
            if(digit == searchNumber) return true;
            number /=10;
        }
        return false;
    }
}
