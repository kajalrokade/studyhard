package com.kajal.code.DSA.companies.Airtel;

public class FindElement2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int target = 9;
        int i=matrix.length-1;
        int j=0;

        while(i>=0&&j<matrix[0].length){
                if(matrix[i][j]==target){
                    System.out.println("true");
                    break;
                }else if(matrix[i][j]>target){
                    i--;
                }else if(matrix[i][j]<target){
                    j++;
                }
            }
        }
}
