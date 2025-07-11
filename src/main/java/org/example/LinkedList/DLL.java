package org.example.LinkedList;

public class DLL {
    private Node head;

    //Node
    class Node {
        int data;
        Node next;
        Node prev;
        

        Node(int data, Node next,Node prev) {
            this.data = data;
            this.next = next;
            this.prev=prev;
        }
    }


    //insertion at beginning
    private void insertAtBeginning(int data) {
        if (head == null) {
            head = new Node(data, null,null);
        } else {
            Node n = new Node(data, head,null);
            head = n;
        }
    }

    // insert at end
    public void insertAtEnd(int data) {
        if (head == null) {
            head = new Node(data, null,null);
            return;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node n = new Node(data, null,temp);
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
            Node n = new Node(data,temp.next,temp);
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
                if(temp.next.prev!=null)
                    temp.next.prev=temp;
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
        DLL dll = new DLL();
        dll.insertAtBeginning(10);
        dll.insertAtBeginning(20);
        dll.insertAtEnd(30);
        dll.insertAtPos(1, 25);
        dll.display(); // Output: 20 25 10 30

        dll.deleteAtBeginning();
        dll.display(); // Output: 25 10 30

        dll.deleteAtEnd();
        dll.display(); // Output: 25 10

        dll.deleteAtPos(1);
        dll.display(); // Output: 25
    }
}
