package com.kajal.code.StriverDSASheet.Array.Medium;

public class PaintersPartition {
    public static void main(String[] args) {
        int[] partitions= new int[]{5,5,5,5};
        int k = 2;

        int sum= 0;
        for(int j=0;j<partitions.length;j++){
            sum+=partitions[j];
        }
        int minTime=0;
        int prevSum=0;
        for(int j=0;j<partitions.length;j++){
            minTime= Math.max(prevSum,sum-partitions[j]);
            prevSum+=partitions[j];

        }
        System.out.println(minTime);
    }
}
