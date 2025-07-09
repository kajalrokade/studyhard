package com.kajal.code.DSA.Questions;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        int a[]= {10,20,30,40,50,2,1,5,6,7,3,7,3,1};
        int firstMax=-1;
        int secondMax=-1;
            for(int i=0;i<a.length;i++){
                if(a[i] > firstMax){
                    secondMax=firstMax;
                    firstMax=a[i];
                }else if(a[i]> secondMax && a[i] < firstMax){
                    secondMax=a[i];
                }
            }
        System.out.println(secondMax);
    }
}
