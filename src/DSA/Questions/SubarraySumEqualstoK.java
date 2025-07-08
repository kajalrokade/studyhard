package src.DSA.Questions;

public class SubarraySumEqualstoK {
    public static void main(String[] args) {
        int[] a = {1, 4, 20, 3, 10, 5};
        int k = 33;
        int sum = 0;
        int start = 0;
        for (int end = 0; end < a.length; end++) {
            sum += a[end];
            while (sum > k  && start <= end) {
                sum -= a[start];
                start++;
            }
            if (sum == k ) {
                for (int i = start; i <= end; i++) {
                    System.out.println(" " + a[i]);
                }
                return;
            }
        }
    }
}
