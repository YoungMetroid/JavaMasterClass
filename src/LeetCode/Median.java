package LeetCode;

public class Median {

    public double findMedianSortedArrays(int[]nums1, int[]nums2)
    {

        int [] combinedNumbers = new int[nums1.length + nums2.length];
        int number1Index = 0;
        int number2Index = 0;
        for(int counter = 0; counter < combinedNumbers.length; counter++)
        {
            if(number1Index == nums1.length && number2Index  <nums2.length)
            {
                combinedNumbers[counter] = nums2[number2Index];
                number2Index++;
                continue;
            }
            else if(number2Index == nums2.length && number1Index < nums1.length)
            {
                combinedNumbers[counter] = nums1[number1Index];
                number1Index++;
                continue;
            }
            if(nums1[number1Index] < nums2[number2Index])
            {
                combinedNumbers[counter] = nums1[number1Index];
                number1Index++;
            }

            else if(nums1[number1Index] > nums2[number2Index])
            {
                combinedNumbers[counter] = nums2[number2Index];
                number2Index++;
            }
            else
            {
                combinedNumbers[counter] = nums1[number1Index];
                number1Index++;
            }
        }


        if(combinedNumbers.length % 2 == 0)
        {
            int half  = combinedNumbers.length /2;

            return (double)(combinedNumbers[half] + combinedNumbers[half-1]) / 2;
        }
        int half  = combinedNumbers.length/2;
        return combinedNumbers[half];

    }

}
