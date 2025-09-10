package org.example.ThreadTest;

public class Counter {

    private int count;

    public synchronized void increment()
    {
        count++;
    }

    int getCount()
    {
        return count;
    }
}
