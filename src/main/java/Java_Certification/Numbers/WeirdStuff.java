package Java_Certification.Numbers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WeirdStuff {

    enum Day{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;
    }
    public static void main(String args[]) {

        for(Day var_1: Day.values()){
            System.out.println(var_1);
        }

        System.out.println(true | (false ^ true));
        System.out.println((true | false ^ true));
        System.out.println(true | false ^ true);
        System.out.println((true | false) ^ true);

        double d1 = 100.012345;
        double d2 = 100.012345;


        if (d1 == d2)
        {
            System.out.println("Same");
        }
        else System.out.println("Different");


        double a = 1, b = 0, c = 2;
        double mod1 = a % b;
        double mod2 = b % c;
        double result = mod1 > mod2 ? mod1 : mod2;
        System.out.println(result);

        try{
            method();
        }

        catch (IOException ioe)
        {
            System.out.println("IO");
        }

        try{
            print();
        }
        catch (Exception ex)
        {

        }

       Integer []arr = new Integer[2];
        int [] arr2 = new int[2];
        arr2[1] = 10;
        for(int I: arr2)
        {
            System.out.println(I);
        }
        arr[1] = 10;
        for(Integer I: arr)
        {
            System.out.println(I);
        }

    }
    public WeirdStuff method2()
    {
        return new WeirdStuff();
    }

   public static void method() throws IOException{
        throw new FileNotFoundException();
   }
   public static void print()
   {
       final int x = 0;
       try{
           throw new NullPointerException();

       }
       catch (ClassCastException ex)
       {
           System.out.println("Class cast");
       }
       finally {
           System.out.println("Final");
       }
       System.out.println("OCAJP");
   }
}
