package com.kajal.code.DSA.MergeIntervals;

import java.util.Arrays;

public class ErasetheOVerlappingIntervals {
    public static void main(String[] args) {
        int[][] nums = {{0,2},{1,4},{5,6},{6,8},{7,10},{8,9},{12,14}};
        System.out.println(eraseOverlapIntervals(nums));
    }
    public  static int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals , (a, b) -> a[0]-b[0]);

        int s1= intervals[0][0];
        int e1= intervals[0][1];
        int count=0;

        for(int i=1;i<intervals.length;i++){

            int s2=intervals[i][0];
            int e2= intervals[i][1];

            if(e1 >s2 ){
                count++;
                System.out.println(s1 + " " + e1 );
                e1=Math.min(e1,e2);

            }else{
                s1=s2;
                e1=e2;
            }
        }
        return count;

    }
}
