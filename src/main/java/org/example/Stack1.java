package org.example;


//stack using Arrays
public class Stack1<T> {

    public T[] elements ;
    int top = -1;
    int size=0;

    Stack1(int size){
        this.size=size;
        this.elements = (T[]) new Object[size];
    }

    public void push(T data)
    {
        if(top==size)
        {
            //overflow
            System.out.println("Stack is full");
        }
        else {
            elements[++top]=data;
        }
    }

    public T pop()
    {
        if(top==-1)
        {

            System.out.println("Stack is empty");
            return null;
        }
        else
        {
            T data = elements[top];
            top--;
            return data;
        }
    }

    public T peek()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return null;
        }
        else
        {
            return elements[top];
        }
    }

    public static void main(String[] args) {
        Stack1<Integer> s1 = new Stack1<>(10);

        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println(s1.peek()); // 30
        System.out.println(s1.pop()); // 30
        System.out.println(s1.peek()); // 20
        s1.push(40);
        System.out.println(s1.peek()); // 40
    }
}



