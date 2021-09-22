package LeetCode;

import LeetCode.IslandsProblem.MicrosoftTest;
import LeetCode.IslandsProblem.islandsSearchAlgorithm;

import java.util.Arrays;

public class LeetCodeMain {

    public static void main(String[]args)
    {

        //islandsSearchAlgorithm islands = new islandsSearchAlgorithm(10,10);
        //TwoSum twoSum = new TwoSum();
        MicrosoftTest microsoftTest = new MicrosoftTest();

        String t[] = new String[]{"0011","0111","0111","0110","0000"};
        System.out.println(Arrays.toString(microsoftTest.solution(t)));

        System.out.println(microsoftTest.solution(14));
        System.out.println(microsoftTest.solution(20));
        System.out.println(microsoftTest.solution(30));
        System.out.println(microsoftTest.solution(39));
        System.out.println(microsoftTest.solution(99));
        System.out.println(microsoftTest.solution(499));
        System.out.println(microsoftTest.solution("aaaa"));
        System.out.println(microsoftTest.solution("awawauwu"));

        //int[] match = twoSum.SumTwo(new int[]{15,7,14,16},30);
        //System.out.println(match[0]);
        //System.out.println(match[1]);

        //int[] match2 = twoSum.SumTwo(new int[]{1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,15,7,14,16},30);
        //System.out.println(match2[0]);
        //System.out.println(match2[1]);


    }
}
