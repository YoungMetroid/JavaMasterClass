package section4;

public class daysCalculator {
    public static void main(String args[])
    {
        //printYearsAndDays(1440);
        printYearsAndDays(525600);
        //printYearsAndDays(0);
    }
    public static void printYearsAndDays(long minutes)
    {
        if(minutes >= 0)
        {
            long hours = Math.round(minutes / 60);
            long days = Math.round(hours / 24);
            long years = Math.round(days / 365);
            if(years > 0) days  = Math.round( days % 365);
            System.out.println(minutes + " min = " + years + " y and " + days + " d"  );
        }
        else System.out.println("Invalid Value");

    }
}
