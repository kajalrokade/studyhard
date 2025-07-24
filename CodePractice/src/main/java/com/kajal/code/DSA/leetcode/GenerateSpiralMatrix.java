package com.kajal.code.DSA.leetcode;

import java.util.Arrays;

public class GenerateSpiralMatrix {
    public int[][] generateMatrix(int n) {
        int[][] result= new int[n][n];

        int num=1;
        int row=0;
        int col=0;
        for(int j=0;j<n;j++){
            result[row][j]=num;
            col=j;
            num++;
        }

        for(int i=row+1;i<n;i++){
            result[i][col]=num;
            num++;
            row=i;
        }

        for(int i=col-1;i>=0;i--){
            result[row][i]=num;
            num++;
            col=i;

        }
        for(int i=col;i<n-2;i++){
            result[row-1][col]=num;
            num++;
            col=i;
        }
        return result;
    }

    public static void main(String[] args) {
        GenerateSpiralMatrix gm = new GenerateSpiralMatrix();
        System.out.println(Arrays.deepToString(gm.generateMatrix(3)));
    }
}
