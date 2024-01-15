package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] SumTwo(int[] numbers, int target)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int count= 0; count < numbers.length; count++)
        {
            map.put(numbers[count], count);
        }

        for(int count = 0; count< numbers.length; count++)
        {
            int complement = target - numbers[count];

            if(map.containsKey(complement) && map.get(complement) != count)
            {
                return new int[]{ count, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No Two sum solution");
    }

    public int[] SumTwo2(int[] numbers,int target)
    {
        for(int firstIndex = 0; firstIndex < numbers.length; firstIndex++)
        {
            for(int secondIndex = firstIndex+1; secondIndex < numbers.length; secondIndex++)
            {
                if(numbers[firstIndex] + numbers[secondIndex] == target)
                    return new int[]{firstIndex,secondIndex};
            }
        }
        return null;
    }
}
