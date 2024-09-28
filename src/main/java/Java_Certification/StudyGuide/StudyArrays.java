package Java_Certification.StudyGuide;

import java.util.Arrays;

public class StudyArrays {

    int[] arr;
    final static int[] arr3 ={1,2,3};
    final int[] arr4;
    public static void main(String []args){


        StudyArrays studyArrays = new StudyArrays();
        System.out.println(studyArrays.arr.length);

        final int [][]arr5 = new int [3][3];
        final int val = 50;
        arr5[0] = arr3;
        arr3[0] = 100;
        arr5[0][1] = val;
        arr5[0][1] = 52;

        Arrays.stream(arr5).forEach(x-> Arrays.stream(x).forEach(System.out::println));
        Arrays.stream(arr5).flatMapToInt(Arrays::stream).forEach(x -> System.out.print(x + " "));

    }

    public StudyArrays(){
        arr4 = new int[]{1,2,3};
        arr = new int[3];
    }

    public void print(){
        final int[] arr2;

        System.out.println(arr);
        arr2 = new int[]{1,2,3};
    }
}
