package LeetCode.IslandsProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MicrosoftTest {

    public int solution(int N)
    {
        //I'll convert the input to a string so that i can split the number up and get the sum of the digits.
        //The sumOfInput will be used to store the sum of every digit in the inputted number;

        String number = String.valueOf(N);
        int sumOfInput = 0;
        for(int count = 0; count < number.length(); count++)
        {
            sumOfInput = sumOfInput + Integer.parseInt(String.valueOf(number.charAt(count)));
        }

        //I'll calculate the double of the sumOfInput
        int twiceSumOfInput = sumOfInput * 2;

        //The program will now searching for the value whose digits sum is twice the sum the inputted number.
        //The program will start searching using N+1 and go all the way to 500 since thats the indicated range.
        //Like in the previous for loop, i'll convert the value to a string and add up the digits. The sum of the digits
        //Will be stored in the sumOfInput. Once done adding up the digits i'll compare the sumOfInput to twiceSumOfInput
        //If the comparison is true, we'll return the value found. If not we'll go on to the next value.
        //(If the value is not found then the program will return 0.)

        for(int startingValue = N+1 ; startingValue <=100000; startingValue++)
        {
            sumOfInput = 0;
            String searchNumber = String.valueOf(startingValue);
            for(int count = 0; count < searchNumber.length(); count++)
            {
                sumOfInput = sumOfInput +  Integer.parseInt(String.valueOf(searchNumber.charAt(count)));
            }

            if(twiceSumOfInput == sumOfInput)
            {
                return startingValue;
            }

        }

        return 0;
    }

    public int solution(String s)
    {


        //Using a HashMap to store the each character as a key and the value will indicate
        //how many times its repeated.
        Map<Character,Integer> map = new HashMap<>();

        for(int count = 0; count < s.length(); count++)
        {
            //Check if the key exist, if it does exist i'll get the value that is stored
            //i'll add one to that value
            //and then i'll update the key with the new value.
            //Since Hashmap have unique keys, the put function just overwrites the old value
            if(map.containsKey(s.charAt(count)))
            {
                int value = map.get(s.charAt(count));
                value++;
                map.put(s.charAt(count),value);
            }

            // If the key does not exist i put the key in the map and assign it the value one since its
            // the first appearance of that character.
            else map.put(s.charAt(count),1);
        }



        //I will now iterate through the map, and use the modulus to get the remainder
        // by dividing the value of each key by 2. If the remainder is different to zero. Then this means
        // That the value is odd and it has to be removed. So the oddsToRemove is incremented.
        // Once done iterating the oddsToRemove will be returned.
        int oddsToRemove = 0;
        for(Map.Entry<Character,Integer> uniqueKey: map.entrySet())
        {
            if(uniqueKey.getValue() % 2 != 0 )
            {
                oddsToRemove++;
            }
        }
        return oddsToRemove;
    }

    public int[]solution(String[] cars)
    {


        int results[] = new int[cars.length];
        for(int counter = 0; counter< cars.length; counter++)
        {
            int firstValue = Integer.parseInt(cars[counter],2);
           for(int innerCounter = 0; innerCounter < cars.length; innerCounter++)
           {
               if(innerCounter == counter)
                   continue;
               int secondValue = Integer.parseInt(cars[innerCounter],2);

               int bitWiseresult = firstValue ^ secondValue;

               System.out.println(bitWiseresult);

               String binaryResult = Integer.toBinaryString(bitWiseresult);
               binaryResult = binaryResult.replaceAll("0","");

                if(binaryResult.length() <= 1)
                results[counter]++;

           }
        }

      return results;

    }
}
