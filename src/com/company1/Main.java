package com.company1;

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

        list1.print();

        System.out.println("Size = " + list1.size());

        list1.delete(100);
        list1.delete(8);

        list1.print();

        if(list1.contains(99)){
            System.out.println("Число есть в массиве");
        }else{
            System.out.println("Числа нет в массиве");
        }

    }
}