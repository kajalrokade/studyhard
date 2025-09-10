package com.kajal.code.DSA.Multithreading;

import java.util.concurrent.*;

/**
 * Write a Java program that:
 * <p>
 * Uses ExecutorService to run 3 tasks using Callable
 * <p>
 * Each task should return the square of a given number
 * <p>
 * Collect and print all 3 results using Future
 */
public class SquareOfNumber {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 2; i <= 4; i++) {
            int finalI = i;
            Callable<Integer> task = () -> finalI * finalI;

            Future<Integer> future = executorService.submit(task);

            try {
                System.out.println("Square of " + finalI + " is: " + future.get());
            } catch (ExecutionException | InterruptedException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();
    }
}
