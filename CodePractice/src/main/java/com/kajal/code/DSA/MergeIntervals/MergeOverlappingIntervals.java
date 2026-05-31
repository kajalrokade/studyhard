package com.kajal.code.DSA.MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int[][] nums = {{0,2},{1,4},{5,6},{6,8},{7,10},{8,9},{12,14}};
        int[][] result = merge(nums);

        // Print result
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int s1= intervals[0][0];
        int e1= intervals[0][1];
        ArrayList<int[]> result= new ArrayList();
        for(int i=1;i<intervals.length;i++){

            int s2= intervals[i][0];
            int e2= intervals[i][1];

            if( e1 >= s2){
                e1=Math.max(e1,e2);
            }else{
                result.add(new int[]{s1,e1});
                s1=s2;
                e1=e2;
            }
        }
        result.add(new int[]{s1,e1});
        int[][] ans= new int[result.size()][2];
        for(int i=0;i<result.size();i++){
            int[] m= result.get(i);
            ans[i][0]=m[0];
            ans[i][1]=m[1];
        }
        return ans;
    }
}
