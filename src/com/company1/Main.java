package com.company1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        MyArrayList list1 = new MyArrayList();

        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);
        list1.add(99,11);

        list1.delete(5);

        list1.print();
    }
}