package LeetCode;

public class Container_With_Most_Water
{

    public int maxArea(int [] height)
    {
        int leftEdge = 0;
        int rightEdge = height.length-1;
        int max = 0;

        while(leftEdge < rightEdge)
        {
            int leftNum = height[leftEdge];
            int rightNum = height[rightEdge];
            int smallerNum = leftNum < rightNum ? leftNum : rightNum;
            int newMax = (rightEdge - leftEdge) * smallerNum;
            max = max < newMax ? newMax : max;

            if(leftNum < rightNum)
            {
                leftEdge++;
            }
            else
            {
                rightEdge--;
            }

        }

        return max;
    }
}
