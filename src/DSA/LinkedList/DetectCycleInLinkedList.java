package src.DSA.LinkedList;

public class DetectCycleInLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.insertData(2);
        head.insertData(3);
        head.insertData(4);
        head.insertData(5);

        head.next.next.next.next = head.next.next;

        System.out.println(detectCycle(head));

    }
    static boolean detectCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;
        }

        return false;
    }

}
