package section4;

public class leapYear {
    public static void main(String[] args)
    {
        System.out.println(isLeapYear(2100));
        System.out.println(isLeapYear(1804));
        System.out.println(isLeapYear(1808));
        System.out.println(isLeapYear(1812));
    }
    static boolean isLeapYear(int year)
    {
        if(year < 1 || year > 9999)
            return false;

        if((year % 4) == 0 && (year % 100) == 0 && (year % 400) == 0)
        {
            return true;
        }
        else if((year % 4) != 0) return false;
        else if ((year % 100) != 0) return true;
        else if ((year % 400) != 0) return false;
        return false;

    }


}
