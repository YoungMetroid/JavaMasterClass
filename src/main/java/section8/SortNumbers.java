package section8;

import java.util.Scanner;

public class SortNumbers {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String []args){

        int []myIntegers = getIntegers(5);
        myIntegers = sortIntegers(myIntegers);
        printIntegers(myIntegers);

    }

    public static void printIntegers(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static int[] getIntegers(int capacity){
        int []array = new int [capacity];
        System.out.println("Enter " + capacity + " integer values:\r");

        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers(int [] array){
        boolean flag = true;
       while(flag){
           flag = false;
            for(int j = 0; j < array.length-1; j++){
                if(array[j] < array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }
}
