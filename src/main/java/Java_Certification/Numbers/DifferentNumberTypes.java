package Java_Certification.Numbers;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DifferentNumberTypes {


    static int si;
    static String ss;
    static double sd;
    static char sc;


    {
        System.out.print("");
    }
    static {
        System.out.println("1");
    }

    static void print()
    {
        System.out.println("p");
    }

    public void print2()
    {
        print();
    }

    public static void main(String... args)
    {

        sc = 130;
        System.out.println((int)sc);
        Boolean b;
        float fminus = -10.0f;
        final int fx;
        fx =10;

       // DifferentNumberTypes dnt = new DifferentNumberTypes();
        Hexadecimal.decimalToHexdecimal(260);
        Hexadecimal.decimalToHexdecimal(100);
        Hexadecimal.decimalToHexdecimal(4000);
        Hexadecimal.decimalToHexdecimal(32);
        Hexadecimal.decimalToHexdecimal(16);
        Hexadecimal.decimalToHexdecimal(2);
        Hexadecimal hexadecimal = new Hexadecimal();
        hexadecimal.decimalToHexdecimal(4);
        hexadecimal.print();

        //Double all valid forms
        Double d = 10D;
        Double d1 = 10d;
        Double d2 = 10.0;
        Double d3 = 10.0d;
        Double d4 = 10.0D;
        Double d5 = 10.d;
        Double d6 = 10.D;
        Double d7 = .0;




        //double all valid forms
        double dd = 10D;
        double dd1 = 10d;
        double dd2 = 10;
        double dd3 = 10.0;
        double dd4 = 10.0d;
        double dd5 = 10.0D;
        double dd6 = 10.d;
        double dd7 = 10.D;
        double dd8 = .0;

        System.out.println(dd2);
        System.out.println(dd3);

        //Float all valid forms

        Float f  = 10f;
        Float f1 = 10f;
        Float f2 = 10.F;
        Float f3 = 10.f;
        Float f4 = 10.0F;
        Float f5 = 10.0f;
        Float f6 = 10.0F;
        Float f7 = .0F;
        Float f8 = .0f;

        float ff  = 10f;
        float ff1 = 10F;
        float ff2 = 10;
        float ff3 = 10.0f;
        float ff4 = 10.0F;
        float ff5 = .0F;
        float ff6 = .0f;
        float ff7 = 10.f;
        float ff8 = 10.F;


        int x = 0b1;
        int y = 0x1A;
        int z = 18;


        int xx = 012;
        System.out.println(xx);
        int xxx;
        //System.out.println(new DifferentNumberTypes().px);
        System.out.println( DifferentNumberTypes.si);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        new DifferentNumberTypes().divide(f);

        int array[] = {2,5,9,5,0,3};

        List<String> ints = new ArrayList<>();
        Arrays.sort(array,2,7);
        System.out.println(array);

        int aar [][][] =
                {
                        {
                            {1,2},{3,4}
                        },
                        {
                                {83,12,19},{26,51}
                        },
                        {
                                {0},{10}
                        }
                };
    }
    void divide(Number d)
    {
        System.out.println(d);
    }
    
}
