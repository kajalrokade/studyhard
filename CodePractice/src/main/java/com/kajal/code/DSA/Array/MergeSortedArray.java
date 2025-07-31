package com.kajal.code.DSA.Array;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                i++;
            } else if(nums2[j]< nums1[i]){
                int temp= nums1[i];
                nums1[i] = nums2[j];
                nums2[j]=temp;
                Arrays.sort(nums2); // if the scond array is smaller than the first array then it will an issue in ordered so sort the array after the swaping.
            }
        }
        while (i < m+n && j < n ) {
            nums1[i] = nums2[j];
            i++;
            j++;
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int m=1;
        int n=0;
        int [] nums1 = new int[m+n];
        nums1[0]=4;
        nums1[1]=5;
        nums1[2]=6;
//        nums1[3]=4;
//        nums1[4]=5;

        int  [] nums2 = {1,2,3};
        mergeSortedArray.merge(nums1,m,nums2,n);

    }
}
