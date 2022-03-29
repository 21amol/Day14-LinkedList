package com.bridgelabz;

public class Main {

    public static void main(String[] args) {
        // welcome to linkedlist program.

        LinkedList list = new LinkedList();
        list.add(70);
    //    list.add(30);
        list.add(56);
        list.insertAfter(30, 56);
        list.showList();
    }
}
