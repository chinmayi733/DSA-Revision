package org.example;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class BlockingQ  {
    public static void main(String[] args) {

        BlockingQueue<Integer> blockingDeque = new ArrayBlockingQueue<>(4);

        Runnable r = () -> {
            try {
                while (true) {
                    blockingDeque.put(1);
                    System.out.println("Produced: 1");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        Thread t2 = new Thread(r);

        //producer thread
        new Thread(()->{
            try {
                while(true)
                {
                   blockingDeque.put(1);
                   System.out.println("Produced: 1");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();

//consumer
        new Thread(()->{
            try {
                while(true)
                {
                    blockingDeque.take();
                    System.out.println("Consumed: 1");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();
    }
}
