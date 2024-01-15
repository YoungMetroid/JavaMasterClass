package section4;

public class speedConverter {

        public static void main(String args[])
        {
            printConversion(1);
            printConversion(6);
            printConversion(7);
            printConversion(-1);
        }
        public static void printConversion(double kilometersPerHour)
        {
            long miles = toMilesPerHour(kilometersPerHour);
            if(miles != -1)
                System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
            else
                System.out.println("Invalid Value");
        }
        public static long toMilesPerHour(double kilometersPerHour)
        {
            if(kilometersPerHour < 0)
                return -1;
            return Math.round(kilometersPerHour/1.609);
        }
}
