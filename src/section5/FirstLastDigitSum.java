package section5;

public class FirstLastDigitSum {

    public static void main(String[]args){
        System.out.println(sumFirstAndLastDigit(12389));
    }
    public static int sumFirstAndLastDigit(int number){
        if(number < 0) return -1;

        if(number == 0) return 0;

        boolean first = false;
        int firstDigit = 0;
        int digit = 0;
        while (number > 0) {
            digit = number % 10;
            if(first == false)
            {
                firstDigit = digit;
                first = true;
            }
            number /=10;
        }
        return (firstDigit + digit);
    }
}
