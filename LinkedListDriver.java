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

        lst.remove(0);
        System.out.println(lst);

        lst.remove(1);
        System.out.println(lst);

        /* TODO: FIX LATER */
        System.out.printf("The size of the list is: %d\n", lst.size());
        System.out.printf("The last element is: %d\n", lst.get(lst.size()));

        lst.set(lst.size(), 1234567);
        System.out.println(lst);

    }
}
