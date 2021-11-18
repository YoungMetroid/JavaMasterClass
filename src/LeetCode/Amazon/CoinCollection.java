package LeetCode.Amazon;

import java.util.ArrayList;
import java.util.List;

public class CoinCollection
{
    public static int minimumCoinFlips(String coins)
    {

        if(coins.isEmpty()) return 0;
        String str = "";

        List<String> groups = new ArrayList<>();
        char previous = ' ';
        for(char side:coins.toCharArray())
        {
            if( previous != ' ' && previous != side)
            {
                groups.add( str);
                str = "";
            }
            previous = side;
            str += side;

        }
        if(!str.isEmpty()) groups.add(str);


        if(groups.size() == 2)
        {
            if(groups.get(0).contains("H")) return 0;
            else
            {
                if(groups.get(0).length() <= groups.get(1).length())
                {
                    return groups.get(0).length();
                }
                return groups.get(1).length();
            }
        }
        if(groups.size() == 3)
        {
            if(groups.get(0).contains("T"))
            {
                if(groups.get(0).length() <= groups.get(1).length())
                {
                    return groups.get(0).length();
                }
            }
            else
            {
                if(groups.get(1).length() <= groups.get(2).length())
                {
                    return groups.get(1).length();
                }
                else return groups.get(2).length();
            }
        }

        int left = groups.get(0).length();
        int coinsFlipped = 0;
        for(int index = 1; index < groups.size()-1; index++)
        {
           if(groups.get(index).length() > left + groups.get(index+1).length())
           {     groups.get(index+1).length();
               left += groups.get(index).length() + groups.get(index+1).length();
               index += 2;
           }
           else
           {
               coinsFlipped += groups.get(index).length();
               left += groups.get(index).length() + groups.get(index+1).length();
               index ++;
           }
        }
        return coinsFlipped;
    }

    public static void main(String []args)
    {
        System.out.println(minimumCoinFlips("HHTHTT"));
        System.out.println(minimumCoinFlips("HHTHTTHHHTTTTHHHTTTTTT"));
        System.out.println(minimumCoinFlips("HHTHTTHHH"));
        System.out.println(minimumCoinFlips("HHTHTTHHHHHHTTHTH"));
        System.out.println(minimumCoinFlips("HHTHTTHTHTHTHTTHHH"));
    }

}
