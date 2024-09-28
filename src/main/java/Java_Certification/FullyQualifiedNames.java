package Java_Certification;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.*;


//Fully qualified names that you can use have can not have "Date.*"
//Make the name be exact.
//So that you can use is like the following example
public class FullyQualifiedNames extends Date{

    public static void main(String[] args){
        FullyQualifiedNames fullyQualifiedNames = new FullyQualifiedNames();

        System.out.println(fullyQualifiedNames.getTime()/60);
        SecondQualifiedName s = fullyQualifiedNames.new SecondQualifiedName(new byte[]{1, 2});
        LocalDate localDate = LocalDate.now();
        int i = 0;

        if(++i == 1){
            System.out.println(i);
        }
        i+=2;
        int a = (--i) + i-- + i++ + ++i;
        System.out.println(a);
        System.out.println(i);

    }
    class SecondQualifiedName extends java.math.BigInteger{
        public SecondQualifiedName(byte[] val) {
            super(val);

        }
    }
}
