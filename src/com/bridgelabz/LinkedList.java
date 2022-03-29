package com.bridgelabz;

public class LinkedList {
    Node head;
    Node tail;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            //   System.out.println("Linked list is Empty");
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void showList() {
        if (head == null) {
            System.out.println("Linked list is Empty.");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }
    }

    public void insertAfter(int newData, int data) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            Node nextNode;
            while (temp != null) {
                nextNode = temp.next;
                if (temp.data == data) {
                    temp.next = newNode;
                    newNode.next = nextNode;
                }
                temp = temp.next;
            }
        }
    }

    public void pop() {
        head = head.next;
    }

    public void popLast() {
        Node temp = head;

        while (temp != null) {
            if (temp.next == null) {
                temp = null;
            } else {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }
    }

    public void search(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                System.out.println("");
                System.out.println("Data found: " + temp.data);
                break;
            } else {
                temp = temp.next;
            }
        }

    }

    public void searchAndDelete(int data) {
        Node temp = head;
        while (temp != null) {
            //  if (temp.data == data) {
            //    System.out.println("");
            //  System.out.println("Data found: " + temp.data);

            if (temp.next.data == data) {
                Node prevNode = temp;
                prevNode.next = temp.next.next;
                System.out.println("");
          //      System.out.println(temp.data + "->");
                break;
            } else {
                temp = temp.next;
            }
        }
        int count = 0;
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
            count = count + 1;
        }
        System.out.println("");
        System.out.println("Number of elements in Linked list: " + count);
    }
}


