package LeetCode;

import java.util.Arrays;

public class NextPremutation {

    public static void main(String []args){
        int [] arr = new int[]{4,2,0,2,3,2,0};
        NextPremutation.nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void nextPermutation(int[] nums) {
        int firstValue = 0;
        int secondValue = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j <nums.length; j++){
                //Find Lowest value
                if(nums[i] <  nums[j] ){
                    firstValue = i;
                    secondValue = j;
                }
            }
        }
        //swap here
        if(firstValue != secondValue) {
            swap(nums, firstValue, secondValue);
            //and order from position j+1
            Arrays.sort(nums, firstValue+1, nums.length);
            return;
        }
        Arrays.sort(nums,0,nums.length);
    }
    public static void swap(int[] arr, int a, int b){
        int c = arr[a];
        arr[a] = arr[b];
        arr[b]= c;
    }
}
