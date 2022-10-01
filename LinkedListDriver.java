package com.grivera64.datastructure.linkedlist;

public class LinkedListDriver {
    public static void main(String[] args) {
        List<Integer> lst = new LinkedList<>();
        System.out.println(lst);

        lst.add(0, 10);
        System.out.println(lst);

        lst.add(0, 20);
        System.out.println(lst);

        lst.add(0, 30);
        System.out.println(lst);

        lst.add(1, 99);
        System.out.println(lst);

        lst.add(2, 55);
        System.out.println(lst);

    }
}
