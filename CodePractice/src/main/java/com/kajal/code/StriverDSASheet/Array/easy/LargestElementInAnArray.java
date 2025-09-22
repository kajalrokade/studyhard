package com.kajal.code.StriverDSASheet.Array.easy;

/**
 * Example 1:
 * Input: arr[] = {2,5,1,3,0};
 * Output: 5
 * Explanation: 5 is the largest element in the array.
 *
 * Example2:
 * Input: arr[] = {8,10,5,7,9};
 * Output: 10
 * Explanation: 10 is the largest element in the array.
 */
public class LargestElementInAnArray {
    public static void main(String[] args) {
        int[] arr= new int[] {2,5,1,3,0};

        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
