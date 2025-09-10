package org.example.ThreadTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessTest {

    private static final Lock lock = new ReentrantLock(true); // Fair lock (to ensure FIFO order)

    public void accessResource()
    {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquired the lock.");
            // Simulate some work with the shared resource
            try {
                Thread.sleep(100); // Simulate work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        } finally {
            System.out.println(Thread.currentThread().getName() + " released the lock.");
            lock.unlock();
        }
    }


    public static void main(String[] args) {
        FairnessTest fairnessTest = new FairnessTest();

        Runnable task = () -> {
                fairnessTest.accessResource();
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
