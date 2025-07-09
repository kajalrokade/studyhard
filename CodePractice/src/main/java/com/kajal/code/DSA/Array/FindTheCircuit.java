package com.kajal.code.DSA.Array;

import java.util.Scanner;

public class FindTheCircuit {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] gas = new int[n];
        for (int i = 0; i < n; i++) {
            gas[i] = sc.nextInt();
        }
        int[] cost = new int[n];
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }
        System.out.println( findCircuit(gas,cost));
    }

    private static int findCircuit(int[] gas, int[] cost) {
        int start=0;
        for(int i=0;i<gas.length;i++){
            if(gas[i]>=cost[i]){
                start=i;
                break;

            }
        }
        int balance=0;
        for(int i=start+1;i<gas.length;i++){
            if(gas[i]>=cost[i]){
                balance= balance+gas[i]-cost[i];
                if(balance<0){
                    start=i;
                }
            }
        }
        if(balance>=0){
            return start;
        }else
            return -1;

    }
}
