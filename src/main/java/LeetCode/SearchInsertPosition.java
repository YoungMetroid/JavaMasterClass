package LeetCode;

public class SearchInsertPosition {

    public static void main(String []args){

        int position = searchInsert(new int[] {3,4,5,6,7,8},6);
    }
    public static int searchInsert(int[] nums, int target) {

        int leftIndex = 0;
        int rightIndex= nums.length-1;
        if(target < nums[leftIndex])
            return 0;

        if(target > nums[rightIndex])
            return rightIndex + 1;

        while(leftIndex <= rightIndex){
            int mid = leftIndex + (rightIndex-leftIndex)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                //num[m-1] < target < nums[m]
                if(mid-1 >=0  && nums[mid-1] < target && target < nums[mid])
                    return mid;
                else rightIndex = mid-1;
            }
            else {
                if(mid+1 < nums.length && nums[mid] < target && target < nums[mid+1])
                    return mid+1;
                else leftIndex = mid+1;
            }
        }
        return -1;
    }
}
