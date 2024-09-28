package Java_Certification.ArrayTesting;

import java.util.ArrayList;
import java.util.List;

import static  java.util.Arrays.sort;

public class ArrayTest2 {


    static int x = 10;
    static int y = x;
    static {
        int x= 1;
        y = x;
    }

    public static  void main (String []args)
    {

        List<Integer> list = new ArrayList<>();
       int  y = 10;
       int x = 10;
       if(x != 10 && y++==11);
       System.out.println(x);
       if(y==11 | ++x == 11)
           y+=10;

        System.out.println(y);


        StringBuilder s = new StringBuilder("Whis");
        s.append(
                "labs"
        );
        s.setLength(7);
        System.out.println(s);

        //These 2 array declarations are the same;
        //They have no array size declared and are empty.
        final int []farray = new int[0];

        //Regular initialization
        int[] arrRegular1 = new int[3];
        arrRegular1[0] = 10;
        //Reinitialize array with specified values using anonymous style
        arrRegular1 = new int[]{1,2,3};

        //Anonymous Arrays
        int [] arrAnonymous = new int[]{1,2,3};
        int [] arrAnonymous2;
        arrAnonymous2= new int[]{1,2,3};


        //Array constants this type of declaration only works when creating the array.
        int[] arrConsts1 = {1,2,3,4};



        int []farray2  = {1,2,3};
        sort(farray2);
        double[] d;

        final int [] farray3;
        farray3 = new int[2];
        farray3[0] = 1;


        //

        final int [][] fMultiArray = new int[2][];

        fMultiArray[0] = new int[]{1,2,3,4};

        //The amount of arrays is final in the multi dimensional array
        //But the size of each array can be changed and reassigned.
        final int fMultiArray2[][] = new int [2][3];

        fMultiArray2[0] = new int [5];


        //These are the same and since they are declared final
        //We cannot assigned anything to them.
        final int [] fMultiArray3[] = new int [][]{};
        final int [] fMultiArray4[] = new int [0][];



        for (int i:fMultiArray[0]) {
            System.out.printf(i + ",",i);
        }



        System.out.println("");
    }
}
