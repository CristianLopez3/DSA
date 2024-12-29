package com.datastructures.doublyLinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    private static final int FIRST_VALUE = 1;
    private DoublyLinkedList doublyLinkedList;

    @BeforeEach
    void setUp() {
        doublyLinkedList = new DoublyLinkedList(FIRST_VALUE);
    }

    @Test
    void testAppendShouldIncrementTheLength(){
        doublyLinkedList.append(10);
        assertEquals(2, doublyLinkedList.length, "The length of the list should be 2");
        assertEquals(10, doublyLinkedList.tail.value, "The tail of the list should be 10");
    }

    @Test
    void testRemoveLastShouldReduceTheLength(){
        doublyLinkedList.append(10);
        doublyLinkedList.removeLast();
        assertEquals(FIRST_VALUE, doublyLinkedList.length, "The length of the list should be 1");
        assertEquals(FIRST_VALUE, doublyLinkedList.tail.value, "The tail of the list should be 1");
    }

    @Test
    void testRemoveLastShouldReturnNull(){
        var removedElement = doublyLinkedList.removeLast();
        assertEquals(FIRST_VALUE, removedElement.value, "The element value should be 1");
        assertEquals(0, doublyLinkedList.length, "The length of the list should be 0");
    }

    @Test
    void testRemoveFirstShouldReturnNull(){
        doublyLinkedList.removeLast(); // returns 1
        var removedElement = doublyLinkedList.removeLast(); // returns null because there is no node in the list
        assertNull(removedElement);
        assertEquals(0, doublyLinkedList.length, "The length of the list should be 0");
    }

}