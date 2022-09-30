package com.grivera64.datastructure.linkedlist;

/*
 * Name: Giovanni Rivera
 * Instructor: Dr. Chatterjee
 * Course: CSC 311-04
 * Creation Date: 9/30/2022
 * Due Date: 10/6/2022
 * File Name: ArrayList.java
 * Description: Implements the LinkedList ADT methods from our "bare-bones" List interface
 */

public class LinkedList<E> implements List<E> {

    /* Nodes are the basic unit for a LinkedList */
    private class Node<T> {

        private T data;                         // Element in the node
        private Node<T> next;                   // Link to the next node

        public Node(T data) {
            this(data, null);
        }

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<E> head;
    private int size;

    public LinkedList() {
        this.head = new Node<E>(null);      // Dummy node
        this.size = 0;
    }

    @Override
    public void add(int index, E element) {

        /* Throw an exception if the index is negative or too big */
        if (index < 0 || this.size < index) {
            throw new IllegalArgumentException("Invalid Index!");
            }

        if (index == 0) {
            this.addFirst(element);
            return;
        }

        Node<E> node = this.getNode(index);
        this.addAfter(node, element);
    }

    private void addFirst(E element) {
        this.head.next = new Node<>(element, this.head.next);       // Updating the new head of the list
        this.size++;
    }

    private Node<E> getNode(int index) {
        return null;
    }

    private void addAfter(Node<E> node, E element) {
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
