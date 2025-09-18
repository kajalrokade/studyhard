package com.kajal.code.DSA.Array;

public class FindMedianSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] ans = new int[m + n];
        int k = 0, i = 0, j = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                ans[k] = nums1[i];
                k++;
                i++;

            } else {
                ans[k++] = nums2[j];
                j++;
            }
        }
        while (i < m) {
            ans[k++] = nums1[i++];
        }
        while (j < n) {
            ans[k++] = nums2[j++];
        }

        double median = 0;
        if (ans.length % 2 == 0) {
            int even = ans.length / 2;
            median = ans[even] + ans[even - 1];
            median= median/2;
        } else {
            int odd = ans.length / 2;
            median = ans[odd];

        }

        return median ;
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3,4})); // 2.5
        System.out.println(findMedianSortedArrays(new int[]{1, 3}, new int[]{2})); // 2
    }
}
