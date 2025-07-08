package practice.src.DSA.Array;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4 ,2};
        //ot =6

        int maxProd = arr[0];
        int minProd = arr[0];
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            if (curr < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(curr, maxProd * curr);
            minProd = Math.min(curr, minProd * curr);

            result = Math.max(result, maxProd);
        }
    }
}
