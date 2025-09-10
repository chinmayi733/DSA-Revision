package org.example.ThreadTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWrite {


    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    private int counter = 0;
    private Lock readLock = lock.readLock();
    private Lock writeLock =  lock.writeLock();

    public void increment() {
        writeLock.lock();
        try {
            counter++;
            System.out.println("Counter incremented to: " + counter);
        } finally {
            writeLock.unlock();
        }
    }

    public void getCounter() {
        readLock.lock();
        try {
            System.out.println("Counter: " + counter);
        } finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantReadWrite obj = new ReentrantReadWrite();

        // Create threads to increment the counter
        Thread writer1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                obj.increment();
            }
        });

        Thread writer2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                obj.increment();
            }
        });

        // Create threads to read the counter
        Thread reader1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                obj.getCounter();
            }
        });

        Thread reader2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                obj.getCounter();
            }
        });

        // Start the threads
        writer1.start();
        writer2.start();
        reader1.start();
        reader2.start();

        // Wait for writers to finish
        try {
            writer1.join();
            writer2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final read of the counter
        obj.getCounter();
    }
}
