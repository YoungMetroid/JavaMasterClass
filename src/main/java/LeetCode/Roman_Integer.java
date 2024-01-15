package LeetCode;

public class Roman_Integer {



    public int romanToInt(String roman)
    {
///XXVII
        int sum = 0;
        char last = ' ';
        for(char number:roman.toCharArray())
        {

            switch (number)
            {
                case 'I':
                    sum = sum + 1;
                    break;
                case 'V':
                    if(last == 'I')
                    { sum = sum + 3;}
                    else sum = sum + 5;
                    break;
                case 'X':
                    if(last == 'I')
                    { sum = sum + 8;}
                    else sum = sum + 10;
                    break;
                case 'L':
                    if(last == 'X')
                    { sum = sum + 30;}
                    else sum = sum + 50;
                    break;
                case 'C':
                    if(last == 'X')
                    { sum = sum + 80;}
                    else sum = sum + 100;
                    break;
                case 'D':
                    if(last == 'C')
                    { sum = sum + 300;}
                    else sum = sum + 500;
                    break;
                case 'M':
                    if(last == 'I')
                    { sum = sum + 800;}
                    else sum = sum + 1000;
                    break;
            }
            last = number;
        }

        return sum;
    }
}
