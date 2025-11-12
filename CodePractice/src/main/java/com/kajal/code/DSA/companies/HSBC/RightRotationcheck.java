package com.kajal.code.DSA.companies.HSBC;

import java.util.Scanner;

/**
 *
 * word1= sample, word2 = plesam
 * output = 1
 *
 * word1= sample ,word2 = maples
 * output -1
 *
 *
 *
 */
public class RightRotationcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        System.out.println(isRotated(word1, word2));
    }

    public static int isRotated(String word1, String word2) {
        if (word1 == null || word2 == null || word1.length() != word2.length()) {
            return -1;
        }
        String word3 = word1 + word1;

        if (word3.contains(word2)) {
            return 1;
        } else

            return -1;

    }
}
