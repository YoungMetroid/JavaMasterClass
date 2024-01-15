package LeetCode;

public class Integer_Roman {


    public String int_to_Roman(int number)
    {
        if(number <=0 ) return "";
        if(number > 3999) return "";
        StringBuilder roman = new StringBuilder();

        int thousands = 0;
        int hundreds = 0;
        int tens = 0;
        int ones = 0;
        if(number/ 1000 > 0)
        {
            thousands = number / 1000;
        }
        if((number % 1000) > 0)
        {
            number = number % 1000;
            hundreds = number / 100;
        }
        if((number % 100) > 0)
        {
            number = number % 100;
            tens = number / 10;
        }
        if((number % 10) > 0)
        {
            number = number % 10;
            ones = number;
        }

        convertThousands(roman,thousands);
        convertHundreds(roman,hundreds);
        convertTens(roman,tens);
        convertOnes(roman,ones);
        return roman.toString();
    }


    public void convertThousands(StringBuilder roman, int number)
    {
        for(int i = 0; i < number; i++) {
            roman.append("M");
        }
    }
    public void convertHundreds(StringBuilder roman, int number)
    {
        if(number == 4)
        {
            roman.append("CD");
        }
        else if(number == 9)
        {
            roman.append("CM");
        }
        else if(number <=3)
        {
            for(int i = 0; i < number; i++) {
                roman.append("C");
            }
        }
        else
        {
            roman.append("D");
            for(int i = 5; i < number; i++) {
                roman.append("C");
            }
        }

    }
    public void convertTens(StringBuilder roman, int number)
    {
        if(number == 4)
        {
            roman.append("XL");
        }
        else if(number == 9)
        {
            roman.append("XC");
        }
        else if(number <=3)
        {
            for(int i = 0; i < number; i++) {
                roman.append("X");
            }
        }
        else
        {
            roman.append("L");
            for(int i = 5; i < number; i++) {
                roman.append("X");
            }
        }
    }
    public void convertOnes(StringBuilder roman, int number)
    {
        if(number == 4)
        {
            roman.append("IV");
        }
        else if(number == 9)
        {
            roman.append("IX");
        }
        else if(number <=3)
        {
            for(int i = 0; i < number; i++) {
                roman.append("I");
            }
        }
        else
        {
            roman.append("V");
            for(int i = 5; i < number; i++) {
                roman.append("I");
            }
        }
    }

}
