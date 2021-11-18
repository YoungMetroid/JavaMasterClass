package LeetCode.Amazon;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class FreshPromo {

    public static void main(String[] args)
    {
        List<String> codeList = new ArrayList<>();
        for(String s: args)
        {
            codeList.add(s);
        }

        List<String> shopppingCart = new ArrayList<>();

        shopppingCart.add("orange");
        shopppingCart.add("apple");
        shopppingCart.add("apple");
        shopppingCart.add("banana");
        shopppingCart.add("orange");
        shopppingCart.add("orange");
        shopppingCart.add("apple");
        shopppingCart.add("banana");


        foo(codeList,shopppingCart);
    }
    public static int foo(List<String> codeList, List<String> shoppingCart)
    {
        List<List<String>> groupList = new ArrayList<>();
        for(String code: codeList)
        {
            List<String> group = new ArrayList<>();
            String[] codes = code.split(" ");
            for(String fruit: codes)
            {
                group.add(fruit);
            }
            groupList.add(group);
        }


        int cartIndex = 0;

        for(List<String> group:groupList)
        {

            String fruit = group.get(0);
            int groupIndex = 0;
            while(
                    cartIndex <= shoppingCart.size() &&
                    !shoppingCart.get(cartIndex).equals(fruit))
            {
                cartIndex++;
            }
            if(cartIndex == shoppingCart.size()) return 0;

            for(; cartIndex < shoppingCart.size(); cartIndex++,groupIndex++)
            {
                if(groupIndex < group.size())
                {
                    if(group.get(groupIndex).equals("anything")) continue;

                    if (!group.get(groupIndex).equals(shoppingCart.get(cartIndex)))
                    {
                        cartIndex = cartIndex - groupIndex;
                        groupIndex = -1;
                    }
                }
                else break;

            }
            if(groupIndex < group.size()) return 0;
        }


        return 1;

    }
}
