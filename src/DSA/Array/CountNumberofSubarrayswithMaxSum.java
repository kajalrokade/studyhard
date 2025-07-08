package src.DSA.Array;

public class CountNumberofSubarrayswithMaxSum {
    public static void main(String[] args) {
        int[] a={};


        int sum=0;
        int max=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum>max){
                max=sum;
            }
            if(sum < 0){
                sum=0;
            }
        }
        System.out.println(max);
    }
}
