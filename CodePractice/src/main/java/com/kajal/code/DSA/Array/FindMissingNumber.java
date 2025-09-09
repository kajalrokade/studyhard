package com.kajal.code.DSA.Array;

import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int a[]= {1,2,5};

        System.out.println("Missing Numbers in Array Using BruteForce Approach");
        System.out.println(missingNumberBruteForce(a));
        System.out.println("Missing Numbers in Array Using Optimal Approach");
        System.out.println(missingNumberOptimize(a));
    }
    public static int missingNumberOptimize(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return  expectedSum-actualSum;
    }
    public static int missingNumberBruteForce(int[] a) {
        Arrays.sort(a);
        int min =a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i] !=i){
                return i;
            }
        }
        return a.length;
    }
}
