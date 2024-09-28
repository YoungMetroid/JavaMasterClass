package LeetCode;

public class SwapNodes {
    public static void main(String [] args){
        ListNode a = new ListNode(1);
        ListNode temp = a;
        temp.next = new ListNode(2);
        temp = temp.next;
        temp.next = new ListNode(3);


        ListNode swapped  = swapPairs(a);

    }
    public static ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null)
            return head;
        head = swapPairs(head, false);
        return head;
    }

    public static ListNode swapPairs(ListNode node, boolean isPair){

        if(node != null) {
            node.next = swapPairs(node.next, !isPair);
        } else return null;

        if(!isPair && node.next !=null){
            //Do Swapping here
            ListNode first = node.next; //4
            ListNode second = node.next.next; //null
            node.next = second; // 3 point to empty
            first.next = node; // 4 point to 3
            return first;
        }

        return node;
    }




}
