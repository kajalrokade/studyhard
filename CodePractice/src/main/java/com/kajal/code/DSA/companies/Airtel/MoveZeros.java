package com.kajal.code.DSA.companies.Airtel;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int i=0;
        int j= i+1;

        int[]  a = new int[]{0,0,1,1,0,0,2,3,4,0,0,0};
        while(j<a.length){
            if(a[i]==0 && a[j]!=0){
                a[i]=a[j];
                a[j]=0;
                i++;j++;
            }else if( a[j]==0){
                j++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
