package com.kajal.code.DSA.Multithreading;


class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running using Thread class");
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // start() will call run() internally
    }
}
