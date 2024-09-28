package Java_Certification.ArrayTesting;

import Java8.Car;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class ArrayTesting {

    public static void main(String [] args)
    {
        float f = 1f;
        double d = 1.2D;
        ArrayTesting arrayTesting = new ArrayTesting();
        arrayTesting.testSortingWithNullValues();
        arrayTesting.testSortingWithARange(new int[]{100,6,4,10,2,1},1,4);
        arrayTesting.diferentWayToDeclareArray();
        Car2 car  = new ArrayTesting().new Car2(0,null,null,null,null,null,null,null,
                null,null,null,null,null,null,null,
                null);
        car.print();
    }
    public class Car2 extends Car{

        public Car2(int year, String make, String model, String trim, String body, String transmission, String vin, String state, String condition, String odometer, String color, String interior, String seller, String mmr, String sellingPricePoint, String saleDate) {
            super(year, make, model, trim, body, transmission, vin, state, condition, odometer, color, interior, seller, mmr, sellingPricePoint, saleDate);

        }
        protected void print(){
            super.print();
        }

    }
    public void testSortingWithNullValues(){
        try {
            int[][] ints = new int[2][];
            Arrays.sort(ints[1]);
        }
        catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void testSortingWithARange(int [] arr, int start, int end){
        Arrays.sort(arr,start,end);

        Arrays.stream(arr).forEach(x-> System.out.print(x + " "));
        System.out.println();
    }
    public void diferentWayToDeclareArray(){
        //Constant array initialization
        int [] arr = {100,6,3,4,6};
        Arrays.sort(arr);
        Arrays.stream(arr).forEach(x-> System.out.print(x + " "));
        System.out.println();

    }

    public void testingCopyingArray(){
        int [] arr = {1,2,3};
        int [] arr2  = Arrays.copyOf(arr,arr.length);
        
    }

}

