package com.company1;

import java.util.ArrayList;

public class TestStream {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        arrayList.stream()
                .skip(1)
                .map(x -> x + 1)
                .forEach(System.out::println);
    }
}
