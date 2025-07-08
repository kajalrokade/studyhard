package src.DSA.LinkedList;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.insertData(2);
        head.insertData(21);
        head.insertData(22);
        head.insertData(23);
        head.insertData(24);
        head.insertData(25);
        head.insertData(26);
        head.insertData(27);
        head.insertData(28);
        head.insertData(29);
        head.insertData(30);

        ListNode reverseList = reverseLinkedlist(head);
        while (reverseList != null) {
            System.out.print(reverseList.data + " ");
            reverseList = reverseList.next;
        }



    }

    private static ListNode reverseLinkedlist(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
