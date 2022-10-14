//package com.grivera64.datastructure.linkedlist;

/*
 * Name: Giovanni Rivera
 * Instructor: Dr. Chatterjee
 * Course: CSC 311-04
 * Creation Date: 9/30/2022
 * Due Date: 10/13/2022
 * File Name: List.java
 * Description: Represents the "bare-bones" ADT of a Linked List
 */

public interface List<E> {
    void add(int index, E element);     // Add element to LinkedList at specified index
    E remove(int index);                // Remove element from LinkedList at specified index
    E get(int index);                   // Get element from LinkedList at index
    E set(int index, E element);        // Sets the element at the index to a new element
    int size();                         // Gets the size of the Linked List
}
