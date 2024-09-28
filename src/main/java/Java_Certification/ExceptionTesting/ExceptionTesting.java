package Java_Certification.ExceptionTesting;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTesting {

    public static void main(String ... args){

        ExceptionTesting exceptionTesting = new ExceptionTesting();

        try {
            exceptionTesting.print();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public void print() throws IOException {
        throw new IOException("Throwing IOException");
    }

    public void convert(String s){
          // File file = new File("")
    }
}
