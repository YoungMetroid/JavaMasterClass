package LeetCode;

import java.math.BigInteger;

public class DivideTwoIntegers {
    public static void main(String []args){


        int dividend = 1234;
        int divsor = 2;
        int multiple = 1;
        divsor <<= 1;
        multiple <<= 1;
        multiple <<= 1;
        multiple <<= 1;


        System.out.println( divide(-2147483648,1));
        System.out.println( divide(10,3));
        System.out.println( divide(7,-3));
    }

    public static int divide(int dividend, int divisor) {
        //Check is result will be positive or negative
        boolean positive = false;
        if(dividend < 0 && divisor < 0 )
            positive = true;
        else if(dividend >= 0 && divisor >=0 )
            positive = true;

        if(dividend == -2147483648 && divisor ==1 ){
            return -2147483648;
        }
        if(dividend == -2147483648 && divisor == -1 ){
            return 2147483647;
        }
        BigInteger bigIntegerDividend = BigInteger.valueOf(dividend);
        BigInteger bigIntegerDivisor  = BigInteger.valueOf(divisor);
        bigIntegerDividend = bigIntegerDividend.abs();
        bigIntegerDivisor= bigIntegerDivisor.abs();
        int times = 0;
        BigInteger total = BigInteger.valueOf(0);

        while(total.compareTo(bigIntegerDividend) <= 0 && bigIntegerDivisor.compareTo(BigInteger.valueOf(1)) != 0){
            times++;
            total = total.add(bigIntegerDivisor);
            if(total.compareTo(bigIntegerDividend) > 0){times--;}
        }

        if(bigIntegerDivisor.compareTo(BigInteger.valueOf(1)) == 0){
            times = bigIntegerDividend.intValue();
        }
        if(!positive){
            String minus = "-" + times;
            times = Integer.parseInt(minus) ;
        }
        return times;
    }
}
