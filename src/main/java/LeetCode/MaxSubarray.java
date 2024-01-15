package LeetCode;

public class MaxSubarray
{
    public int maxSubArray(int [] nums)
    {
        int maxSum = nums[0];

        int sumCounter = 0;


        for(int num : nums)
        {
            if(sumCounter < 0)
            {
                sumCounter =0;
            }
            sumCounter +=num;

            maxSum = Math.max(maxSum,sumCounter);
        }


        return maxSum;
    }
}
