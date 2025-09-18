package com.kajal.code.DSA.Array;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] heights= new int[]{3,4,1,2,2,4,1,3,2};
        int left=0;
        int right=heights.length-1;
        int currentMAx= 0;
        while(left<right){
            int width= right-left;
            int height= Math.min(heights[left],heights[right]);
            int currentArea= width*height;
            currentMAx= Math.max(currentMAx,currentArea);
            if(heights[right]<heights[left])
                right--;
            else
                left++;

        }
        System.out.println(currentMAx);
    }
}
