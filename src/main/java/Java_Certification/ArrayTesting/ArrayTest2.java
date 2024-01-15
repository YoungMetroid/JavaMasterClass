package Java_Certification.ArrayTesting;

public class ArrayTest2 {

    public static  void main (String []args)
    {

        //These 2 array declarations are the same;
        //They have no array size delcared and are empty.
        final int []farray = new int[0];
        final int []farray2 = new int[]{};


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
