package practice.src.DSA.Questions;


import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the sequence: ");
        int n = sc.nextInt();
        int  arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int  result= getConsecutiveSequence(arr);
        System.out.println("The longest consecutive sequence is: "+ result);

    }

    private static int getConsecutiveSequence(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int maxLength = 0;

        for (int num : arr) {
            set.add(num);
        }

        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                maxLength = Math.max(maxLength, count);
            }
        }
        return maxLength;
    }
}
