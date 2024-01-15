package Java_Certification.Examples;

public class SwitchExamples {


    public static void main(String ...args)
    {

        //Example 1 the cases are const values, they are hardcoded
        int days = Integer.valueOf(args[0]);
        String dayofWeek;

        switch(days)
        {
            case 1: System.out.println(1);
            default:
                System.out.println(0);
            case 2:  System.out.println(2);
            break;
        }


        //Using const
        final int num1 = 1;
        final int num2 = 2;
        final int num3 = 3;

        switch (days)
        {
            default:
                System.out.println(0);
            case num1:
                System.out.println(1);

            case num2:
                System.out.println(2);

            case num3:
                System.out.println(3);
                break;

        }

    }
}
