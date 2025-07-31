package com.kajal.code.DSA.Questions;

public class MinCostOfStairs {
    public static void main(String[] args) {
        int[] costOfStairs = new int[3];
        costOfStairs[0] = 10;
        costOfStairs[1] = 20;
        costOfStairs[2] = 30;
        int n = costOfStairs.length;

        System.out.println( minCost(n-1,costOfStairs));
    }
    private static int minCost(int n,int[] costOfStairs) {
        if(n==0 || n==1)
            return costOfStairs[n];
        return Math.min(costOfStairs[n - 1], costOfStairs[n-2]) + costOfStairs[n];
    }
}
