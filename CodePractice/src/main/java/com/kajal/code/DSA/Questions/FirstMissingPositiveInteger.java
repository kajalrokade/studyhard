package com.kajal.code.DSA.Questions;

/**
 * {3,4,-1,1} =>  2
 * {1 2 5 4 6} => 3
 *
 * place an element at there index
 */
public class FirstMissingPositiveInteger {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println(FindFirstMissingPositiveNumber(arr));
    }

    private static int FindFirstMissingPositiveNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[arr[i] - 1]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return arr.length + 1;
    }
}
