package com.datastructures.doublyLinkedList;

public class DoublyLinkedList {

    Node head;
    Node tail;
    int length;

    public DoublyLinkedList(int value) {
        Node temp = new Node(value);
        head = temp;
        tail = temp;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        length++;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        }

        Node temp = tail;

        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = temp.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;

        return temp;
    }


    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d -> ", temp.value);
            temp = temp.next;
        }
    }

    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    public void getHead() {
        System.out.println(head.value);
    }

    public void getTail() {
        System.out.println(tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

}
