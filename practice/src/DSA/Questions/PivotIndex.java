package practice.src.DSA.Questions;

import java.util.Scanner;

public class PivotIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(pivotIndex(arr));
    }

    public static int pivotIndex(int[] nums) {
        int totalSum = 0, leftSum = 0;

        // 1️⃣ Step 1: Calculate total sum of array
        for (int num : nums) {
            totalSum += num;
        }

        // 2️⃣ Step 2: Check pivot index
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i; // ✅ Correct pivot index
            }
            leftSum += nums[i]; // Update left sum
        }

        return -1; // No pivot index found
    }

}
