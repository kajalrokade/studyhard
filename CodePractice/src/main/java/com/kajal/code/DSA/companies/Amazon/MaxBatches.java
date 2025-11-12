package com.kajal.code.DSA.companies.Amazon;


import java.util.*;

/**
 * In Amazon's massive warehouse inventory, there are n different types of products. You are given an array products of size n, where products[i] represents the number of items of product type i (where i ranges from 0 to n-1). These products need to be packed into batches for shipment.
 *
 * Batch Packing Conditions:
 *
 * Distinct Product Types per Batch:
 * No two items in the same batch can be of the same product type.
 * (In other words, each batch must consist of distinct types of products.)
 * Increasing Batch Size:
 * The number of items packed in the current batch must be strictly greater than the number of items packed in the previous batch.
 * Additional Notes:
 *
 * Each item can be packed only once.
 * Not every item in the inventory is required to be packed into a batch.
 * Your task is to determine the maximum number of batches that can be prepared for shipment, adhering to the above constraints.
 * Input Details:
 * The product types are numbered from 0 to n-1.
 * The array products[i] gives the number of items of product type i for each product type.
 *
 * Example:
 * Input:
 * n = 5
 * products = [2, 3, 1, 4, 2]
 * Result: Maximum number of batches = 4.
 */
public class MaxBatches {
    public static int maxBatches(int[] products) {
        Arrays.sort(products); // Step 1: Sort products array

        int batches = 0;
        int prevBatchSize = 0; // Step 2: Track previous batch size

        for (int items : products) {
            if (items > prevBatchSize) { // Step 3: Ensure increasing batch size
                batches++;
                prevBatchSize++; // Step 4: Increase required batch size for next batch
            }
        }

        return batches; // Step 5: Return max batch count
    }

    public static void main(String[] args) {
        int[] products = {1,2,7};
        System.out.println("Max Batches: " + maxBatches(products)); // Output: 4
    }
}
