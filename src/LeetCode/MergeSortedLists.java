package LeetCode;

public class MergeSortedLists
{

    public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        if(l1 == null && l2 == null)
            return null;

        if(l1 == null) return l2;

        if(l2 == null) return l1;

        ListNode lMerged = new ListNode();
        ListNode lTemp = lMerged;

        while(l1 != null || l2!= null)
        {
            if(l1 == null)
            {
                lMerged.val = l2.val;
                lMerged.next =l2.next;
                break;
            }
            if(l2 == null)
            {
                lMerged.val = l1.val;
                lMerged.next =l1.next;
                break;
            }
            if(l1.val <= l2.val)
            {
                lMerged.val = l1.val;
                lMerged.next = new ListNode();
                lMerged = lMerged.next;
                l1 = l1.next;
            }
            else
            {
                lMerged.val = l2.val;
                lMerged.next = new ListNode();
                lMerged = lMerged.next;
                l2 = l2.next;
            }


        }


        return lTemp;
    }
}
