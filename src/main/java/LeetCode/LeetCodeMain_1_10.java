package LeetCode;

public class LeetCodeMain_1_10
{
    public static void main(String[]args)
    {

        Regular_Expression_Matching rem = new Regular_Expression_Matching();
        System.out.println(rem.isMatch("aaaabbbccd", "a*bb.*cd"));
        Container_With_Most_Water cwmw = new Container_With_Most_Water();
        Integer_Roman ir = new Integer_Roman();
        System.out.println(ir.int_to_Roman(2858));
        System.out.println();
        System.out.println(cwmw.maxArea(new int []{1,1,1,1,7,1,1,1,8,1,1,1,1}));
        System.out.println();

        Roman_Integer roman_integer = new Roman_Integer();
        System.out.println(roman_integer.romanToInt("III"));
        System.out.println(roman_integer.romanToInt("XX"));
        System.out.println(roman_integer.romanToInt("CC"));
        System.out.println(roman_integer.romanToInt("X"));

        System.out.println(roman_integer.romanToInt("XCIX"));


        System.out.println(roman_integer.romanToInt("IX"));
        System.out.println(roman_integer.romanToInt("IV"));




        MaxSubarray maxSubarray = new MaxSubarray();
        maxSubarray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        containsDuplicate.containsDuplicate(new int[]{1,2,3,1});
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(10);
        ListNode l4 = new ListNode(70);
        ListNode l5 = new ListNode(75);
        ListNode l6 = new ListNode(100);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;



        ListNode l7 = new ListNode(2);
        ListNode l8 = new ListNode(5);
        ListNode l9 = new ListNode(10);
        ListNode l10 = new ListNode(60);
        ListNode l11 = new ListNode(75);
        ListNode l12 = new ListNode(111);
        ListNode l13 = new ListNode(111);

        l7.next = l8;
        l8.next = l9;
        l9.next = l10;
        l10.next = l11;
        l11.next = l12;
        l12.next = l13;

        MergeSortedLists mergeTwoLists = new MergeSortedLists();
        mergeTwoLists.mergeTwoLists(l1,l7);

    }

}
