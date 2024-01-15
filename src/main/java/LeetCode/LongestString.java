package LeetCode;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class LongestString {
    public static void main (String[]args)
    {
        String string ="sssabcsad";
        //"sssabcsad";

       // int index = string.indexOf('b');
       // String subString = string.substring(index);
        System.out.println(lengthOfLongestSubstring(string));

    }

    public static String lengthOfLongestSubstring(String s)
    {
        String copyS = s;
        Map<String, Integer> map = new HashMap<>();
        String longestString = "";
        String tempString = "";
        for(int count = 0; count < s.length(); count++)
        {
            if(!map.containsKey(Character.toString(s.charAt(count))))
            {
                map.put(Character.toString(s.charAt(count)), count);
                tempString = tempString.concat(Character.toString(s.charAt(count)));
                //copyS = copyS.substring(1);
            }
            else
            {
                int index = tempString.indexOf(Character.toString(s.charAt(count)));
                tempString = tempString.substring(index+1);
                tempString = tempString.concat(Character.toString(s.charAt(count)));
            }
            if(tempString.length() > longestString.length())
            {
                longestString = tempString;
            }
        }
        return longestString;
    }
}
