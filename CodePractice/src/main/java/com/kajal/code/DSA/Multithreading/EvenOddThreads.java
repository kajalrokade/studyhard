package com.kajal.code.DSA.Multithreading;

class PrintNumbers {
    private int num = 1;
    private int max;

    public PrintNumbers(int max) {
        this.max = max;
    }

    public synchronized void printOdd() {
        while (num < max) {
            while (num % 2 == 0) { // Wait if it's even
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Odd: " + num);
            num++;
            notify(); // Notify the even thread
        }
    }

    public synchronized void printEven() {
        while (num <= max) {
            while (num % 2 != 0) { // Wait if it's odd
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Even: " + num);
            num++;
            notify(); // Notify the odd thread
        }
    }
}

public class EvenOddThreads {
    public static void main(String[] args) {
        int max = 10; // Set the max limit
        PrintNumbers printer = new PrintNumbers(max);

        Thread t1 = new Thread(printer::printOdd);
        Thread t2 = new Thread(printer::printEven);

        t1.start();
        t2.start();
    }
}
