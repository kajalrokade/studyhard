package com.kajal.code.DSA.LinkedList;

public class ListNode {
    int data;
    ListNode next;
    int size = 0;

    public ListNode(int data) {
        this.data = data;
        size = 1;
        this.next = null;
    }
    public ListNode(int data,ListNode next) {
        this.data = data;
        size = 1;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public ListNode insertData(int data) {
        ListNode newNode = new ListNode(data);
        ListNode current = this;
        while (current != null && current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        size++;
        return this;
    }

}
