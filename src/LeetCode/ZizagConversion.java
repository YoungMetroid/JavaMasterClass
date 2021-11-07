package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZizagConversion {


    public String convertOld(String s, int numRows)
    {
        if(numRows == 1) return s;
        List<String> stringList = new ArrayList<>();

        String column = "";
        boolean zizag = false;
        int zizagIndex = 0;
        int updown = 1;


        for(int index = 0; index < s.length(); index++)
        {

            if(zizagIndex == numRows-1 )
            {
                zizag = true;
                updown *=-1;
                stringList.add(column + s.charAt(index));
            }
            else if(!zizag)
            {
                column += s.charAt(index);
                if(index == s.length()-1)
                {
                    stringList.add(column);
                }

            }
            else
            {
                if(zizagIndex == 0)
                {
                    column = "";
                    column += s.charAt(index);
                    zizag = false;
                    updown *=-1;
                    if(index == s.length()-1)
                    {
                        stringList.add(column);
                    }
                }
                else
                {
                    column = "";
                    char [] chars = new char[numRows];
                    Arrays.fill(chars,' ');
                    chars[zizagIndex] = s.charAt(index);
                    stringList.add(new String(chars));
                }

            }
            zizagIndex = zizagIndex + updown;
        }

        String output = "";
        for(int row = 0; row < numRows; row++)
        {
            for(String str:stringList)
            {
                if(row < str.length())
                output += str.charAt(row);
            }
        }
        return output.replaceAll("\\s","");
    }

    public String convertOptimized(String s,int numRows)
    {
        if(numRows == 1) return s;

        int zizagIndex = 0;
        boolean upDown = false;

        List<StringBuilder> stringBuilderList = new ArrayList<>();

        for(int index = 0; index < numRows; index++)
        {
            stringBuilderList.add(new StringBuilder());
        }

        for(char character:s.toCharArray())
        {
            stringBuilderList.get(zizagIndex).append(character);

            if(zizagIndex ==0 || zizagIndex == numRows - 1) upDown = !upDown;
            zizagIndex += upDown? 1:-1;

        }

        StringBuilder newStringBuilder = new StringBuilder();
        for(StringBuilder row: stringBuilderList)
        {
            newStringBuilder.append(row);
        }

       return newStringBuilder.toString();
    }
}
