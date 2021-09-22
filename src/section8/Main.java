package section8;

import java.util.List;

public class Main {

    public static void main (String[] args){
        int[] myIntArray = new int[10];

        myIntArray[0] = 20;
        myIntArray[1] = 30;

        myIntArray[2] = myIntArray[0] + myIntArray[1];

        myIntArray[5] = myIntArray[2]*2;


        for(int i = 0; i < myIntArray.length; i++){
            System.out.println(myIntArray[i]);
        }


        int []secondArray = {1,2,3,4,5,6,7};

        for(int i = 0; i < secondArray.length; i++){
            System.out.println(secondArray[i]);
        }


        int myvalue= 0;
        testReference(myvalue);
        System.out.println(myvalue);
        StringBuilder test = new StringBuilder("Before");
        testReference(test);
        System.out.println(test);
    }

    public static void testReference(int value){
        value++;
    }
    public static void testReference(StringBuilder value){
        value.append("test");
    }
}
