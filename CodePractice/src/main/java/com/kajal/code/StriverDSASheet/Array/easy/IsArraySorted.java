package com.kajal.code.StriverDSASheet.Array.easy;
/**

 Example 1:
 Input: N = 5, array[] = {1,2,3,4,5}
 Output: True.
 Explanation: The given array is sorted i.e Every element in the array is smaller than or equals to its next values,
 So the answer is True.
 */
public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,5,5,5,5,5};
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] <=arr[i+1]){
                count++;
            }else {
                System.out.println(false);
            }
        }
        System.out.println(count);

    }
}
