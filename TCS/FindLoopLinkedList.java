/**
 * Find Loop In the Linked List.
 */

import java.util.LinkedList;

public class FindLoopLinkedList {

    static boolean findLoop(ListNode head){
        if(head == null || head.next == null){
            return false;
        }

        ListNode fast = head;
        ListNode slow = head;
        while(fast != slow){
            if(fast == null || fast.next == null){
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

    }
}