package Java_Certification.ArrayTesting;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class ArrayTesting {

    static Integer integer;
    int width;
    public static void main(String [] args)
    {
        boolean bb = false;

            if(bb = true)
            {
                System.out.println(true);
            }
        int height;
        System.out.println((10)%(-3));
        int []array1 ={1,2,3};
        int array2[][] = {{1,2},{3,4}};
        for(int x = 0; x < array2.length; x++)
        {
            for(int y: array2[x])
            {
                System.out.println(y);
            }
        }
        for(int x = 0; ++x < array1.length; x++)
        {
            System.out.print(array1[x]);
        }
        int []arr = {1,2,3,4,5,6};
        int ia = arr.length-1;

        while(ia >= 0)
        {
            System.out.print(arr[ia]);
            ia--;
        }
        //sb = sb.append("lab");
     //   sb.append('s');
     //   sb.delete(7,28);
     //   sb.setLength(7);
    //    System.out.println(sb);

        char cc[] = new char[4];
        int a[] = new int[4];

        a[3] = (a[0] +a[1])/a[2];
        System.out.println(a[3]);
        int array[] = {1,2,3};


        int index4 = 0;
        short index5 = 0;
        byte index6 = 0;
        Integer i = 0;
        Short s = 0;
        Byte b = 0;
        System.out.println(array[index4]);
        System.out.println(array[index5]);
        System.out.println(array[index6]);
        System.out.println(array[i]);
        System.out.println(array[s]);
        System.out.println(array[b]);


        int []x = new int[3];
        sort(x);
        Arrays.fill(x,1);
        for (int aa:x
             ) {
            System.out.println(aa);
        }
    }
}
