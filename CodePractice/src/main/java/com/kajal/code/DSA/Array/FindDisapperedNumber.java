package com.kajal.code.DSA.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Example 1:
 *
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 * Example 2:
 *
 * Input: nums = [1,1]
 * Output: [2]
 */
public class FindDisapperedNumber {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> hs= new HashSet();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        List<Integer> result= new ArrayList();
        int k=1;
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(k)){
                result.add(k);
            }
            k++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }
}
