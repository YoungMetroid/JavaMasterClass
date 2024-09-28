package Java_Certification.Initialization;

import java.util.Arrays;

public class NullOrDefault {

    //Non Static values are all null
    //int
    int []array = new int[3];
    int []array2;
    int [][] mArray = new int[3][];
    int [][] mArray2 = new int[3][3];
    int i;

    //String
    String s;
    String [][]strMultiArray = new String[3][];
    String [][]strMultiArray2 = new String[3][3];



    //All static objected are initialized to default values.
    //Anything object related like String or wrapper classes
    //are set to null.

    //All primitive values are set to 0.

    //When working with arrays all values are to default value.
    //So a string array with size of 3 would have 3 null strings
    //A int array with size of 3 would have each value set to 0.

    //When working with multi arrays if the array is set with [3][]
    //Each array is created but it would be empty meaning its null.

    //If the array is set with [3][3]
    //We now know the length of each array so all the contents would
    //be set to the default value like a regular array.

    //So a string array with size of [3][3] would have 3 arrays of length 3
    //And every string would be null
    //The same with wrapper classes since they are also a subclass of Object

    //Of the multiArray is a primitive like int with [3][3] then the default value
    //would be 0 for every int in the multiArray;


    //Static String
    static String s2;
    static String[][] staticMultiArray = new String[3][];
    static String[][] staticMultiArray2 = new String[3][3];


    //Static int
    static int []sarray = new int[3];
    static int [][] multiArray = new int[3][];
    static int [][] multiArray2=  new int[3][3];


    //Static Wrapper Integer

    static Integer [][] wrpIntMultiArray = new Integer[3][];
    static Integer [][] wrpIntMultiArray2 = new Integer[3][3];


    public static void main(String []args)
    {

        int []array3 = new int[3];

        Arrays.stream(array3).forEach(System.out::println);

        int [][]mArray3 = new int[3][];

        int [][]mArray4 = new int[3][3];
        System.out.println(mArray4[0][0]);

        String [][]strMultiArray3 = new String[3][];
        String [][]strMultiArray4 = new String[3][3];


        System.out.println("");


        for (Integer []i : wrpIntMultiArray2){
            for(Integer j: i){
                System.out.println(j);
            }
        }


        NullOrDefault nullOrDefault = new NullOrDefault();


    }
}
