package section3;


public class primitivesTypes
{
    public static void main(String[] args)
    {
        /*
        intType();
        System.out.println();
        byteType();
        System.out.println();
        shortType();
        System.out.println();
        longType();
        System.out.println();
        challenge();
        System.out.println();
        floatType();
        System.out.println();
        doubleType();
        System.out.println();
        System.out.println("10 Pounds is equal to " + convertPoundsToKilograms(200d) + " kilograms");

        System.out.println();
        charType();
        System.out.println();
        booleanType();

        stringType();
        */
        operatorChallenge();

    }

    public static void intType()
    {
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;

        System.out.println("The integer Minimum value = " + minValue);
        System.out.println("The integer Maximum value = " + maxValue);
    }
    public static void byteType()
    {
        byte minBtyeValue = Byte.MIN_VALUE;
        byte maxBtyeValue = Byte.MAX_VALUE;

        System.out.println("Byte min value: " + minBtyeValue);
        System.out.println("Byte max value: " + maxBtyeValue);

        byte newByte = (byte)(minBtyeValue / 2);
        System.out.println("New Byte value: " + newByte);
    }
    public static void shortType()
    {
        Short minShortValue = Short.MIN_VALUE;
        Short maxShortValue = Short.MAX_VALUE;

        System.out.println("Short min value: " + minShortValue);
        System.out.println("Short max value: " + maxShortValue);


    }
    public static void longType()
    {
        long minlongValue = Long.MIN_VALUE;
        long maxlongValue = Long.MAX_VALUE;
        long biglongLiteral = 2_147_483_647_234L;
        System.out.println("long min value: " + minlongValue);
        System.out.println("long max value: " + maxlongValue);
        System.out.println("long literal value: " + biglongLiteral);

    }
    public static void challenge()
    {
        byte byteValue = 1;
        short shortValue = 2;
        int intValue = 4;
        long longValue = (50000 + (10*(byteValue + shortValue + intValue)));
        System.out.println(longValue);
    }
    public static Double convertPoundsToKilograms(Double pounds)
    {
        Double  kilograms = 0.45359237d;
        return pounds * kilograms;
    }
    public static void operatorChallenge()
    {
        Double double_var1 = 20.00d;
        Double double_var2 = 71.00d;
        Double result = (double_var1 + double_var2) * 100;
        System.out.println(result);

        Double remainder = result % 40.00d;
        System.out.println("The remainder is: " + remainder);

        boolean doesNotHaveRemainder = (remainder == 0) ? true : false;
        if(!doesNotHaveRemainder)
        {
            System.out.println("We do have a remainder");
        }
        else
        {
            System.out.println("We dont have a remainder");
        }
    }
    public static void floatType()
    {
        float minfloatValue = Float.MIN_VALUE;
        float maxfloatValue = Float.MAX_VALUE;

        System.out.println("float min value: " + minfloatValue);
        System.out.println("float max value: " + maxfloatValue);
    }
    public static void doubleType()
    {
        double mindoubleValue = Double.MIN_VALUE;
        double maxdoubleValue = Double.MAX_VALUE;

        System.out.println("double min value: " + mindoubleValue);
        System.out.println("double max value: " + maxdoubleValue);
    }
    public static void charType()
    {
        char charValue = '1';
        char uniCode = '\u0044';
        char copyRightChar = '\u00A9';
        System.out.println(uniCode);
        System.out.println(copyRightChar);
    }
    public static void booleanType()
    {
        boolean trueValue = true;
        boolean falseValue = false;
        System.out.println("True Value: " + trueValue);
        System.out.println("False Value: " + falseValue);
    }
    public static void stringType()
    {
        String myString = "Felipe";
        myString = myString + " Elizalde";
        myString = myString + 1994;
        System.out.println(myString);

    }
}
