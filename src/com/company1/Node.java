package com.company1;

public class Node {
    public int value;
    public Node next;
    public int index = 0;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
