package com.kajal.code.DSA.Multithreading;

import java.util.ArrayList;
import java.util.List;

class ProducerConsumer {
    private final List<Integer> buffer = new ArrayList<>();
    private final int LIMIT = 1;

    public synchronized void publish() {
        for (int i = 1; i <= 5; i++) {
            while (buffer.size() == LIMIT) {
                try {
                    wait(); // wait if buffer is full
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            buffer.add(i);
            System.out.println("Produced: " + i);
            notify(); // notify the consumer
        }
    }

    public synchronized void consume() {
        for (int i = 1; i <= 5; i++) {
            while (buffer.isEmpty()) {
                try {
                    wait(); // wait if buffer is empty
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int value = buffer.remove(0);
            System.out.println("Consumed: " + value);
            notify(); // notify the producer
        }
    }
}

public class ProducerConsumerApp {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        Thread producer = new Thread(pc::publish);
        Thread consumer = new Thread(pc::consume);

        producer.start();
        consumer.start();
    }
}
