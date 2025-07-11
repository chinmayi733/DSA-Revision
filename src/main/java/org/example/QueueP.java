package org.example;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class QueueP {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>(4);

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        Iterator e = queue.iterator();
        while(e.hasNext())
        {
            System.out.println(e.next());
        }
        queue.poll();
        System.out.println("After poll:");
        e = queue.iterator();
        while(e.hasNext())
        {
            System.out.println(e.next());
        }


        //Queue<Integer> q1 = new LinkedList<>();

    }
}
