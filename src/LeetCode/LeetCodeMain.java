package LeetCode;

import LeetCode.IslandsProblem.Anagram;
import LeetCode.IslandsProblem.MicrosoftTest;
import LeetCode.IslandsProblem.Palindrome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

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




        //Median median = new Median();
        //System.out.println(median.findMedianSortedArrays(new int[]{1,2,3}, new int[] {1,2,3}));
        //System.out.println(median.findMedianSortedArrays(new int[]{1,2,3}, new int[] {1,2,3,4}));
        //System.out.println(median.findMedianSortedArrays(new int[]{50,60,70}, new int[] {10,12,23}));
        //System.out.println(median.findMedianSortedArrays(new int[]{50,60,70}, new int[] {10,12,23,30}));

        Anagram anagram = new Anagram();
        Collection<List<String>> collection = anagram.anagramCollection(new ArrayList<>(Arrays.asList("aae","eaa","eaa","bbb","bba","c","bba","abb","bab","aae")));


        Palindrome palindrome = new Palindrome();
       // palindrome.longestPalindrome("bb");
        //palindrome.longestPalindrome("a");
        //palindrome.longestPalindrome("cbbd");
        palindrome.longestPalindrome("babadada");
        palindrome.longestPalindrome("ccd");
        palindrome.longestPalindrome("ccc");
        palindrome.longestPalindrome("abaaaaaaa");
        palindrome.longestPalindrome("baaaaaaaa");
        palindrome.longestPalindrome("aaaaaaaab");
        palindrome.longestPalindrome("baaaaaaaab");
        palindrome.longestPalindrome("aaaaaaaa");
        palindrome.longestPalindrome("bbbbbaaaaabbbbbcccctttttaaaaggggssstttaaababababababababaabaaaaabaccccbbbbbbbbbcccc");
        palindrome.findMiddeOfRepeatedCharacter("abaaaaabaccccbbbbbbbbbcccc",2);
        palindrome.findMiddeOfRepeatedCharacter("baaaaaaaa",2);
        palindrome.findMiddeOfRepeatedCharacter("abaaaaaaa",2);
        palindrome.findMiddeOfRepeatedCharacter("aaaaaaaab",2);
        palindrome.findMiddeOfRepeatedCharacter("aaaaaaaba",2);
        palindrome.findMiddeOfRepeatedCharacter("baaaaaaaab",2);
        palindrome.findMiddeOfRepeatedCharacter("abaaaaaaba",2);
        palindrome.findMiddeOfRepeatedCharacter("aaaaaaaa",2);
        palindrome.findMiddeOfRepeatedCharacter("aaaaaaaa",1);
        palindrome.findMiddeOfRepeatedCharacter("aaaaaaaaa",1);
        palindrome.findMiddeOfRepeatedCharacter("aaaaaaaaa",2);

        palindrome.findMiddeOfRepeatedCharacter("aaaaaaaa",6);
        palindrome.findMiddeOfRepeatedCharacter("aaaaaaaa",5);
        palindrome.findMiddeOfRepeatedCharacter("aaaaaaaaa",6);
        palindrome.findMiddeOfRepeatedCharacter("aaaaaaaaa",5);

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
