package LeetCode;

import LeetCode.IslandsProblem.MicrosoftTest;
import LeetCode.IslandsProblem.islandsSearchAlgorithm;

import java.util.Arrays;

public class LeetCodeMain {

    public static void main(String[]args)
    {

        //islandsSearchAlgorithm islands = new islandsSearchAlgorithm(10,10);
        //TwoSum twoSum = new TwoSum();

        MatrixTraversal matrixTraversal = new MatrixTraversal();
        matrixTraversal.TraversalUpDown(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        TestingStaticProperties testingStaticProperties = new TestingStaticProperties();

        TestingStaticProperties.lastName= "Elizalde";
        testingStaticProperties.printInfo();

        testingStaticProperties.setName("Felipe");

        testingStaticProperties.printInfo();


        TestingStaticProperties.lastName= "Loera";



        TestingStaticProperties testingStaticProperties2 = new TestingStaticProperties();

        testingStaticProperties2.printInfo();


        testingStaticProperties2.setName("Brian");
        TestingStaticProperties.lastName ="Elizalde";

        testingStaticProperties2.printInfo();


        TestingStaticProperties testingStaticProperties3 = new TestingStaticProperties();
        testingStaticProperties.printInfo();




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
