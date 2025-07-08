package src.DSA.LinkedList;


public class FindMiddleOfLinkedList {
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

        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

    }


}
