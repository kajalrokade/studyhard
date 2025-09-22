package com.kajal.code.DSA.LinkedList;

public class RemoveDuplicateFromSortedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(1,null);



        ListNode newlist = deleteDuplicates(l1);
        System.out.println(newlist);
        while (newlist != null) {
            System.out.println(newlist.data);
            newlist = newlist.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        } else {
            ListNode temp = head;
            while (temp!=null && temp.next != null) {
                if (temp.data == temp.next.data) {
                    temp.next = temp.next.next;
//                    temp=temp.next;
                }else{
                    temp = temp.next;
                }

            }
        }
        return head;

    }

}
