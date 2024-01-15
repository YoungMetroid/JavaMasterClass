package section4;

public class CalcFeetInchesCentimeters {

    public static void main (String args[])
    {
        System.out.println(calcFeetAndInchesToCentimeters(2,2));
        System.out.println(calcFeetAndInchesToCentimeters(35));
    }
    public static double calcFeetAndInchesToCentimeters(int feet, int inches)
    {
        if(feet >= 0 && inches >= 0 && inches <=12)
        {
            return ((feet * 12) * 2.54) + (inches * 2.54);
        }
        return -1;
    }
    public static double calcFeetAndInchesToCentimeters(int inches)
    {

        if(inches >= 0)
        {
            int feet = Math.round(inches / 12);
            inches = inches % 12;
            return calcFeetAndInchesToCentimeters(feet,inches);
        }
        return -1;
    }
}
