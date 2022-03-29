package com.bridgelabz;

public class Main {

    public static void main(String[] args) {
        // welcome to linked list program.

        LinkedList list = new LinkedList();
        list.add(70);
        list.add(30);
        list.add(56);
        //list.insertAfter(30, 40);
        // list.pop();
        // list.popLast();
        list.showList();
        list.search(30);
        list.insertAfter(40, 30);
        list.showList();
    }
}
