package com.kajal.code.DSA.LinkedList;

public class RemoveElementFromList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(8);
        l1.next.next = new ListNode(7);
        l1.next.next.next = new ListNode(7);
        l1.next.next.next.next = new ListNode(7);

        ListNode listNode = removeElements(l1, 7);
        while (listNode != null) {
            System.out.println(listNode.data);
            listNode = listNode.next;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {

        ListNode temp = head;
        // the head node is the target
        // target is other than head node
        ListNode prev = null;
        while (temp != null) {
            if(temp.data == val){
                temp = temp.next;
                prev=temp;
            }else{
                prev.next = temp;
            }
        }


        return prev;

    }
}
