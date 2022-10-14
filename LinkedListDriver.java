//package com.grivera64.datastructure.linkedlist;

public class LinkedListDriver {
    public static void main(String[] args) {
        List<Integer> lst = new LinkedList<>();
        System.out.println(lst);                    // [head -> null]

        lst.add(0, 10);
        System.out.println(lst);                    // [head -> 10 -> null]

        lst.add(0, 20);
        System.out.println(lst);                    // [head -> 20 -> 10 -> null]

        lst.add(0, 30);
        System.out.println(lst);                    // [head -> 30 -> 20 -> 10 -> null]

        lst.add(1, 99);
        System.out.println(lst);                    // [head -> 30 -> 99 -> 20 -> 10 -> null]

        lst.add(2, 55);
        System.out.println(lst);                    // [head -> 30 -> 99 -> 55 -> 20 -> 10 -> null]

        lst.remove(0);
        System.out.println(lst);                    // [head -> 99 -> 55 -> 20 -> 10 -> null]

        lst.remove(1);
        System.out.println(lst);                    // [head -> 99 -> 20 -> 10 -> null]

        System.out.printf("The size of the list is: %d\n", lst.size());
        System.out.printf("The last element is: %d\n", lst.get(lst.size() - 1));

        lst.set(lst.size() - 1, Integer.MAX_VALUE);
        System.out.println(lst);                    // [head -> 99 -> 20 -> 2147483647 -> null]

        lst.remove(lst.size() - 1);
        System.out.println(lst);                    // [head -> 99 -> 20 -> null]

        lst.add(lst.size(), -1);
        System.out.println(lst);                    // [head -> 99 -> 20 -> -1 -> null]

    }
}
