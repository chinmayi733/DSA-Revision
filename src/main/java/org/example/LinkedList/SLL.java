package org.example.LinkedList;

public class SLL {

    private Node head;

    //Node
    class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }


    //insertion at beginning
    private void insertAtBeginning(int data) {
        if (head == null) {
            head = new Node(data, null);
        } else {
            Node n = new Node(data, head);
            head = n;
        }
    }

// insert at end
    public void insertAtEnd(int data) {
        if (head == null) {
            head = new Node(data, null);
            return;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node n = new Node(data, null);
            temp.next = n;
        }
    }

    //insertion at position
    public void insertAtPos(int pos,int data)
    {
        if(pos==0)
            insertAtBeginning(data);
        else {
            Node temp = head;
            for(int i=0;i<pos-1;i++)
            {
                temp=temp.next;
            }
            Node n = new Node(data,temp.next);
            temp.next=n;
        }
    }

    //deletion at beginning

    private void deleteAtBeginning()
    {
        if(head==null)
            return;
        else {
            head = head.next;
        }
    }

    private void deleteAtEnd() {
        if (head == null)
            return;
        else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next=null;
        }
    }

    private void deleteAtPos(int pos)
    {
        if(pos==0)
        {
            deleteAtBeginning();
            return;
        }
        else {
            Node temp = head;
           for(int i=0;i<pos-1;i++) {
               {
                   temp = temp.next;
               }
           }
                if (temp.next != null) {
                    temp.next = temp.next.next;
                } else {
                    System.out.println("Position out of bounds");
                }

        }
    }

    private void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.insertAtBeginning(10);
        sll.insertAtBeginning(20);
        sll.insertAtEnd(30);
        sll.insertAtPos(1, 25);
        sll.display(); // Output: 20 25 10 30

        sll.deleteAtBeginning();
        sll.display(); // Output: 25 10 30

        sll.deleteAtEnd();
        sll.display(); // Output: 25 10

        sll.deleteAtPos(1);
        sll.display(); // Output: 25
    }


}
