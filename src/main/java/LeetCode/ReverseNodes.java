package LeetCode;

public class ReverseNodes {

    public static void main(String []args){

        ListNode nodeList = new ListNode(7);
        ListNode temp = nodeList;
        temp.next = new ListNode(1);
        temp = temp.next;
        temp.next = new ListNode(2);
        temp = temp.next;
        temp.next = new ListNode(7);
        temp = temp.next;
        temp.next = new ListNode(3);
        temp = temp.next;
        temp.next = new ListNode(4);

        //temp = ReverseNodeList(nodeList);
        System.out.println("Ending");
        ListNode r = removeElements(nodeList,7);
    }

    public static ListNode ReverseNodeList(ListNode node){

        if (node == null || node.next == null)
        {
            return node;
        }

// reverse the rest (r) of the list and place
// the first element of the list at the last
        ListNode r = ReverseNodeList(node.next);
        node.next.next = node;
        node.next = null;
// fixing the head pointer
        return r;
    }
    public static ListNode removeElements(ListNode head, int val) {

        ListNode iteration = new ListNode(-1);
        iteration.next = head;
        ListNode temp  = iteration;

        while( iteration.next != null){
            if(iteration.next.val == val){
                iteration.next = iteration.next.next;
            }
            else{
                iteration = iteration.next;
            }
        }
        return temp.next;

    }
}
