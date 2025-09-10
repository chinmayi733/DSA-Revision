package org.example.ThreadTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLocK {

    private Lock lock = new ReentrantLock();

    public void outerMethod()
    {
        lock.lock();
        try {
            System.out.println("Outer method executed");
            innerMethod();
        } finally {
            lock.unlock();
        }
    }

    private void innerMethod() {
        lock.lock();
        try {
            System.out.println("Inner method executed");
        } finally {
            lock.unlock();
        }
       
    }


    public static void main(String[] args) {
        ReentrantLocK obj = new ReentrantLocK();
        obj.outerMethod();
    }
}
