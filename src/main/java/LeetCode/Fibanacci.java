package LeetCode;

import java.util.HashMap;

public class Fibanacci
{

    HashMap<Integer, Long> map = new HashMap<>();

    public static void main(String []args)
    {
        Fibanacci fib = new Fibanacci();
        System.out.println(fib.tribo(10));
        System.out.println(fib.fib(6));
    }


    long fib(int num)
    {
        if(num == 1 || num ==0)
            return num;

       Object value = map.get(num-1);
       long left = 0;
       long right = 0;
       if(value != null)
       {
           left = (int)value;
       }
       else
       {
           left = fib(num - 1);
       }

       value = map.get(num-2);
        if(value != null)
        {
            right = (long)value;
        }
        else
        {
            right = fib(num-2);
        }

        map.put(num,left+right);
        return left+right;

    }
    long tribo(int num)
    {
        if(num == 1 || num ==0)
            return 0;

        if(num == 2)
            return 1;
        if(map.containsKey(num))
            return map.get(num);

        long result = tribo(num-1) + tribo(num-2) + tribo(num-3);

        map.put(num,result);
        return result;

    }

}
