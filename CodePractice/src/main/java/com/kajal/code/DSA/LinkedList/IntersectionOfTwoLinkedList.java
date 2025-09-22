package com.kajal.code.DSA.LinkedList;

public class IntersectionOfTwoLinkedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(8);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);

        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(1);
        l2.next.next = new ListNode(8);
        l2.next.next.next = new ListNode(4);
        l2.next.next.next.next = new ListNode(5);

        System.out.println(getIntersectionNode(l1,l2));
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode temp1= headA;
        ListNode temp2 = headB;
        int tlength1=0;
        int tlength2=0;
        while(temp1!=null){
            tlength1++;
            temp1 = temp1.next;
        }
        while(temp2!=null ){
            tlength2++;
            temp2=temp2.next;
        }
        temp1=headA;
        temp2= headB;

        if(tlength1 > tlength2){
            int diff=tlength1-tlength2;
            while(diff>0){
                temp1=temp1.next;
                diff--;
            }
        }else{
            int diff=tlength2-tlength1;
            while(diff>0){
                temp2=temp2.next;
                diff--;
            }
        }

        while(temp1 !=null && temp2 !=null){
            if(temp1==temp2){
                return temp1;
            }else{
                temp1=temp1.next;
                temp2=temp2.next;
            }
        }

        return null;

    }
}
