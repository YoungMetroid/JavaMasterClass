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
    public static void main(String args[]){


        int j;
        if(new Wrapper().go(10))j=5;
        //System.out.println(j);
        System.out.println(i);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("aAaA");
        Comparable s1 = "Abc";
        Comparable s2 = new String("Abc");
        char [] chars = {'1','Z','0','-','8','1'};
        sb.append(chars,0,chars.length-1);
        sb2.insert(sb2.lastIndexOf("A"),true);

        String[] s3 = {"a","b"};
        String s4 = "";
        s4.join("");
        s4.length();
        ArrayList<String> sList = new ArrayList<>();
        sList.size();

        System.out.println(sb2);
        s = "IZ";
        s.concat("0");
        System.out.println(s1.equals(s2));

        Double a = 10.0;
        System.out.println(a.BYTES);
        Integer b = 100;
        Integer c = new Integer(200);
        Integer d = new Integer(200);


        int  e = 10;
        Integer wi = 10;
        System.out.println(e == wi);
        System.out.println(a == e);
        Double d1 = 0.0/0.0;
        System.out.println(Double.isNaN(1.0));
        System.out.println(d1.isInfinite());


        System.out.println(a > b);
        System.out.println(c == d);
        System.out.println(c >= d);

        System.out.println((char) (65+32));

        Character ch = new Character('3');


        int arr[] = new int[0];
        System.out.println(arr);
        System.out.println(arr.length);
        Wrapper wrapper = new Wrapper();
        wrapper.print();
        System.out.println(ii);
        System.out.println(i);
        System.out.println(d);
        System.out.println(f);
        System.out.println(s);

        LocalDate date = LocalDate.ofYearDay(2015,363);
        date.plusWeeks(2);
        System.out.println(date.lengthOfMonth());
        System.out.println(date);
    }

    public void print()
    {
        System.out.println("Printing iii: " + iii);
    }
    public boolean go(int y)
    {
        if(y > 5) return true;
        else return false;
    }
}
