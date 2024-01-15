package LeetCode;

import org.w3c.dom.Node;

public class PalindromeLinkedList
{
    ListNode currentNode;
    public boolean isPalindrome(ListNode head)
    {
        if (head == null || head.next == null) { // 0 or 1 node
            return true;
        }

        if (head.next.next == null) { // only 2 nodes
            return head.val == head.next.val;
        }
        currentNode = head;
        return recursive(head);
    }

    public boolean recursive(ListNode node)
    {
        if(node.next != null)
        {
            if(recursive(node.next))
            {
                if (node.val == currentNode.val) {
                    currentNode = currentNode.next;
                    return true;
                } else return false;
            }
            return false;
        }
        else if (node.val == currentNode.val)
        {
            currentNode = currentNode.next;
            return true;
        }
        return false;
    }
}
