package com.kajal.code.DSA.Array;

import java.util.ArrayList;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr= {{1,4},{4,5}};
        System.out.println(merge(arr));
    }
    public static ArrayList<ArrayList<Integer>> merge(int[][] intervals) {
        ArrayList<ArrayList<Integer>> result= new ArrayList();

        for(int i=1;i<intervals.length;i++){
            int start;
            int end;
            ArrayList<Integer> pair= new ArrayList();
            if(intervals[i][0] < intervals[i-1][1]) {
                start=  intervals[i-1][0];
                end=intervals[i][1];
                pair.add(start);
                pair.add(end);
                result.add(pair);

            }else if(intervals[i][0] == intervals[i-1][1]) {
                start=intervals[i-1][0];
                end=intervals[i-1][1];
                pair.add(start);
                pair.add(end);
                result.add(pair);
                start=intervals[i][0];
                end=intervals[i][1];
                pair.add(start);
                pair.add(end);
                result.add(pair);
            }else{
                start=intervals[i][0];
                end=intervals[i][1];
                pair.add(start);
                pair.add(end);
                result.add(pair);
            }
        }
        return  result;
    }
}
