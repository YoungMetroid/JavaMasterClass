package Java_Certification.Numbers;

import java.util.HashMap;
import java.util.Map;

public class Hexadecimal {

    static Map<Integer,String> decToHex = new HashMap<Integer,String>(){{
        put(0,"0");
        put(1,"1");
        put(2,"2");
        put(3,"3");
        put(4,"4");
        put(5,"5");
        put(6,"6");
        put(7,"7");
        put(8,"8");
        put(9,"9");
        put(10,"A");
        put(11,"B");
        put(12,"C");
        put(13,"D");
        put(14,"E");
        put(15,"F");
    }};

    static public void decimalToHexdecimal(int decimal)
    {

        StringBuilder sb = new StringBuilder();
        while(decimal/16 > 0)
        {
            sb.append(decToHex.get(decimal%16));
            decimal = decimal / 16;
        }
        sb.append(decToHex.get(decimal%16));
        System.out.println(sb.reverse());
    }
    void print(){
        System.out.println("Hola");
    }

}
