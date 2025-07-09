package com.kajal.code.DSA.Tree;

import java.util.Scanner;

public class InorderTraverse {
    public static void main(String[] args) {
        System.out.println("Inorder Traverse");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the tree");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the tree");
        int[] arr = new int[n];
        System.out.println("Enter the elements in the tree");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
class Node {
    int data;
    Node left, right;
    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
