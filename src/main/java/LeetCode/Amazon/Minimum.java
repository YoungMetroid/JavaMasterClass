package LeetCode.Amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Minimum
{
    public static void main(String ...args)
    {
        long getMinimumCost = getMinimumCost(
                new ArrayList<Integer>(){{
            add(1);
            add(3);
            add(2);
        }},
                new ArrayList<Integer>() {{
            add(2);
            add(1);
            add(3);
        }},5);
        System.out.println(getMinimumCost);
    }

    public static long getMinimumCost(List<Integer> a, List<Integer>b, int m)
    {

        List<Integer> minimumCost = new ArrayList<>();

        for(int j = 1; j <= m; j++)
        {
            for (int i = 0; i < a.size(); i++)
            {

                int newResult = a.get(i) + (j - 1) * b.get(i);
                System.out.println(newResult);
                    minimumCost.add(newResult);
            }
        }
        Collections.sort(minimumCost);
        int result = 0;
        for(int i = 0; i < m; i++)
        {
            result += minimumCost.get(i);
        }
        return result;
    }

}
