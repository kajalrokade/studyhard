package com.kajal.code.DSA.companies.Securonix;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr= new int[]{1,1,1,2,3,3,4,4,5,6,6,7,7,8,9};
        // {1,2,3,4,5,6,7,8,9,.....}
        int i=1;
        for(int j=1;j<arr.length-1;j++){
            if(arr[j]!=arr[j-1]){
                arr[i]=arr[j];
                i++;
            }
        }
        System.out.println(i+1);


    }
}
