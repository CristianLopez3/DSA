package com.datastructures.doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.append(2);
        dll.append(3);

        dll.printList();
        System.out.println();
        dll.getLength();
    }
}
