package section5;

public class NumberPalindrome {
    public static void main(String[]args) {

        System.out.println(isPalindrome(1441));
    }
    public static boolean isPalindrome(int number){
        if(number < 0) number = number *-1;
        int reverse = 0;
        int originalNumber = number;
        while(number> 0){

            int digit = number % 10;
            number /= 10;
            reverse = reverse * 10;
            reverse = reverse + digit;
        }
       if(originalNumber == reverse)return true;

       return false;
    }
}
