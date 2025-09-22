package com.kajal.code.StriverDSASheet.Array.easy;

import java.util.Arrays;

/**
 * Input: arr[1,1,2,2,2,3,3]
 *
 * Output: arr[1,2,3,_,_,_,_]
 *
 * Explanation: Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.
 */
public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int [] arr= new int[] {1,1,2,2,2,3,3};
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        System.out.println(i+1);
    }
}
