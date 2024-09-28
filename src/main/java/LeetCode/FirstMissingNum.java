package LeetCode;

public class FirstMissingNum {

    public static void main(String ... args){
        int nums[] = new int[]{7,8,9,5,12};

        FirstMissingNum firstMissingNum = new FirstMissingNum();
        int answer = firstMissingNum.firstMissingPositive(nums);
        System.out.println(answer);
    }
    public int firstMissingPositive(int[] nums) {
        boolean[] x = new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0&& nums[i]<=nums.length){
                x[nums[i]]= true;
            }
        }

        for(int i=1;i<=nums.length;i++){
            if(!x[i]){
                return i;
            }
        }
        return nums.length+1;
    }
}
