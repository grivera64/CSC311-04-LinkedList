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

        /* Verify the index is valid */
        if (index < 0 || this.size < index) {
            throw new IllegalArgumentException("Invalid Index!");
        }

        /* Find the node at a certain index */
        Node<E> curr = this.head;
        for (int i = 0; i < index && curr != null; i++) {
            curr = curr.next;
        }

        /* Returns the node before the index you are looking for */
        return curr;
    }

    private void addAfter(Node<E> node, E element) {
        node.next = new Node<>(element, node.next);     // Add element after the node provided
        this.size++;
    }

    @Override
    public E remove(int index) {

        /* Verify the index is valid */
        if (index < 0 || this.size <= index) {
            throw new IllegalArgumentException("Invalid Index!");
        }

        if (index == 0) {
            return this.removeFirst();
        }

        Node<E> node = this.getNode(index);
        return this.removeAfter(node);
    }

    private E removeFirst() {

        return this.removeAfter(this.head);
    }

    private E removeAfter(Node<E> node) {

        /* Stop if the head is null */
        if (this.head == null) {
            throw new IllegalStateException("Cannot remove from an empty list!");
        }

        /* Remove the head and return the data from the head */
        Node<E> tmp = node.next;
        node.next = tmp.next;
        this.size--;
        return tmp.data;
    }

    @Override
    public E get(int index) {

        /* Verify the index is valid */
        if (index < 0 || this.size <= index) {
            throw new IllegalArgumentException("Invalid Index!");
        }

        /* Return the data from the node found */
        return this.getNode(index + 1).data;
    }

    @Override
    public E set(int index, E element) {

        /* Verify the index is valid */
        if (index < 0 || this.size <= index) {
            throw new IllegalArgumentException("Invalid Index!");
        }

        /* Return the data previously at the index and set it to element */
        Node<E> node = this.getNode(index + 1);
        E tmp = node.data;
        node.data = element;
        return tmp;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        if (this.size < 1) {
            return "[null]";
        }

        StringBuilder s = new StringBuilder("[");
        Node<E> curr = this.head.next;
        while (curr != null) {
            s.append(curr.data);
            s.append(" -> ");
            curr = curr.next;
        }

        s.append("null]");
        return s.toString();
    }
}
