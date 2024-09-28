package Java_Certification.WrapperTypes;

import java.nio.channels.WritePendingException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Wrapper {
    static Integer i;
    static Double d;
    static Float f;
    static String s;
    static int ii;
    static int iii;


    Wrapper()
    {
        super();

    }
    public static void main(String args[]) {

        int i = 10;
        double d = 10.0;
        short s = 10;
        long l = 10;
        float f1 = 1.0000f;
        double d1 = 1.00000;

        float f2 = 1.2f;
        double d2 = 1.2d;

        Integer ii = 10;
        Double  dd = 10d;

        if(dd == d){
            System.out.println("dd == d");
        }
        if(d2 == i){
            System.out.println("dd == i");
        }
/*
This will give you a compile time error
        if(dd == ii){
            System.out.println("dd == d");
        }

 */
        if(d1 == f1){
            System.out.println("d1 == f1");
        }
        if(d2 == f2){
            System.out.println("d2 == f2");
        }

        if(dd.equals(d)){
            System.out.println("dd.equals(d)");
        }

        if(dd.equals(i)){
            System.out.println("dd.equals(i)");
        }
        if(dd.equals(ii)){
            System.out.println("dd.equals(ii)");
        }

        if(s == d && s == i && d == l ){
            System.out.println("s == d && s == i && d == l");
        }
    }
}
