package com.kajal.code.DSA.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};

        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                System.out.println(Arrays.toString(digits));
                return;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        System.out.println(Arrays.toString(newNumber));


    }
}
