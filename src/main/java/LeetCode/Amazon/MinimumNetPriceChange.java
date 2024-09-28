package LeetCode.Amazon;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumNetPriceChange {

    public static void main(String []args){
        List<Integer> stockPrice = new ArrayList<>(Arrays.asList(1, 3, 2, 3));

        int month = locateEarliestMonth(stockPrice);
        System.out.println(month);
    }

    public static int locateEarliestMonth(List<Integer> stockPrice) {
        // Write your code here
        BigInteger netPriceChange = new BigInteger("1000000000000");
        BigInteger netPriceChange1 = BigInteger.valueOf(10000);
        BigInteger currentSum = new BigInteger("0");
        int lowestMonth = 0;

        BigInteger sumOfRemainingMonths = getSumOfRemainingMonths(stockPrice);
        System.out.println("Sum of Remaining: " + sumOfRemainingMonths);
        for(int i = 0; i < stockPrice.size()-1; i++){
            long divisor = i+1;
            currentSum = currentSum.add(BigInteger.valueOf(stockPrice.get(i)));
            BigInteger currentAverage = currentSum.divide(BigInteger.valueOf(divisor));
            sumOfRemainingMonths = sumOfRemainingMonths.subtract(BigInteger.valueOf(stockPrice.get(i)));

            System.out.println("Sum of Remaining: " + sumOfRemainingMonths + " divisor: " + divisor);

            BigInteger remainingAverage = sumOfRemainingMonths.divide(BigInteger.valueOf(stockPrice.size()-divisor));
            BigInteger currentNetPriceChange = currentAverage.subtract(remainingAverage);
            currentNetPriceChange = currentNetPriceChange.abs();
            if(currentNetPriceChange.compareTo(netPriceChange) < 0){
                netPriceChange = currentNetPriceChange;
                lowestMonth = i+1;
            }
        }

        return lowestMonth;

    }
    public static BigInteger getSumOfRemainingMonths(List<Integer> stockPrice){
        BigInteger averageStockPrice = new BigInteger("0");

        for(int i = 0; i < stockPrice.size(); i++){
            System.out.println(stockPrice.get(i));
            averageStockPrice = averageStockPrice.add(BigInteger.valueOf(stockPrice.get(i)));
        }
        return averageStockPrice;
    }

}
