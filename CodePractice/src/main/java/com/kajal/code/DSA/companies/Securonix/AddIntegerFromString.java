package com.kajal.code.DSA.companies.Securonix;

public class AddIntegerFromString {
    public static void main(String[] args) {
        String s= "1#@#@##4@$@$@9";

        int i=0;
        int n= s.length();
        int sum=0;
        while(i<n){
            String num="0";
            while( i< n && isNumber(s.charAt(i))){
                num+=s.charAt(i);
                i++;
            }
            sum+=Integer.parseInt(num);
            i++;
        }
        System.out.println(sum);

    }
    public static boolean isNumber(char ch){
        if(ch >= '0' && ch <= '9'){
            return true;
        }else {
            return false;
        }
    }
}
