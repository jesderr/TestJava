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

        System.out.println("Size = " + list1.size());

        list1.delete(3);

        list1.print();
    }
}