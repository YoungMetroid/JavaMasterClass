package Java_Certification.City;

import Java_Certification.School.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;

import static java.lang.Math.*;
public class School {

    void School(String s)
    {

    }
    public final static void main(int p[])
    {
        System.out.println("Main 1");
        Classroom room = new Classroom(101, "''Mrs. Anderson");
        Room r = room;
        int t = 1_0 ;
        System.out.println(PI);

        Float f = 1.0f;
        Double d = 10.0;
        Long l = 1l;

try
{
    int x = Integer.parseInt("one");
}
catch (IllegalArgumentException ex)
{
    System.out.println(ex.getMessage());

}
catch (ExceptionInInitializerError ex)
{
    System.out.println(ex.getMessage());
}
catch (ClassCastException ex)
{
    System.out.println(ex.getMessage());
}

        System.out.println(r.seats);
    }
    public final static void main(String... c)
    {


        double a =1, b = 0, d = 2;
        double mod1 = a % b, mod2 = b%d;

        double result = mod1 > mod2 ? mod1:mod2;
        System.out.println(result);
        System.out.println(mod1);
        System.out.println(mod2);

        StringBuilder sb = new StringBuilder("IZ0");
        StringBuilder sb1 = new StringBuilder("IZ0");

        System.out.println(sb.equals(sb1));
        System.out.println(sb.toString().equals(sb.toString()));

        System.out.println("Main2");
    String s;
        L1:for(int i = 5, j= 0; i >0;i--)
            L2:for(;j<5;j++)
            {
                System.out.print(i + "" + j + "");
                if(j ==0) break L1;
            }

        Move.print();
    }
    public final static void main(String c)
    {
        System.out.println("Main3");
    }


    public static IOException method()
    {
        try
        {
            return new IOException();
        }
        catch (IllegalArgumentException e)
        {
            return new FileNotFoundException();
        }finally {

        }
    }


}
interface Move{
    public static void main(String... args)
    {
        System.out.println("Move");
    }
    public static void print(){}
}