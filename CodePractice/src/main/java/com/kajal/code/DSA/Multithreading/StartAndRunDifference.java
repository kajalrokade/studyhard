package com.kajal.code.DSA.Multithreading;


class ThreadClassImpl extends Thread {
    public void run() {
        System.out.println("Running in thread: " + Thread.currentThread().getName());
    }
}

public class StartAndRunDifference {

    public static void main(String[] args) {
        ThreadClassImpl t1 = new ThreadClassImpl();

        t1.run();// This runs on the main thread
        t1.start();


    }
}
