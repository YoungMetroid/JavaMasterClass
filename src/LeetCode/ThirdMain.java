package LeetCode;

public class ThirdMain
{

    public static void main(String[] args)
    {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(100);
        ListNode l4 = new ListNode(100);
        ListNode l5 = new ListNode(1);
        ListNode l6 = new ListNode(2);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        System.out.println( palindromeLinkedList.isPalindrome(l1));
        PalindromeNumber palindromeNumber = new PalindromeNumber();

        palindromeNumber.isPalindrome(1221);
        palindromeNumber.isPalindrome(12121);
        palindromeNumber.isPalindrome(126521);
        palindromeNumber.isPalindrome(01221);
    }
}
