package org.example;

public class QueueUsingArray {

    int[] arr = new int[4];
    int front;
    int rear;
    int data;
    int size;

    QueueUsingArray() {
        front = -1;
        rear = -1;
        data=0;
        size=4;
    }

    public void add(int data)
    {
        if(front==-1 && rear==-1)
        {
            rear++;
            front++;
            arr[front]=data;
        }
        else
        {
            rear= (rear+1)%size;
            if(rear==front)
            {
                System.out.println("Queue is full");
            }
            else {
                arr[rear] = data;
            }
        }
    }

    public int remove()
    {
        if(front==-1 && rear==-1)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        else if(front==rear)
        {
            int data = arr[front];
            front = -1;
            rear = -1;
            return data;
        }
        else
        {
            int data = arr[front];
            front = (front+1)%size;
            return data;
        }
    }

    public int peek()
    {
        if(front==-1 && rear==-1)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        else
        {
            return arr[front];
        }
    }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println(queue.peek()); // 10

        System.out.println(queue.remove()); // 10
        System.out.println(queue.remove()); // 20

        queue.add(50);

        System.out.println(queue.peek()); // 30
        System.out.println(queue.remove()); // 30
    }
}
