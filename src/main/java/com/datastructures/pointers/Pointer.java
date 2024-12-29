package com.datastructures.pointers;

import java.util.HashMap;

public class Pointer {

    /**
     * Java does not provide a pointers way to manipulate things with primitives
     * but we can use wrappers to pointer to a memory reference (shallow copy)
     */
    static void withoutPointer(){
        int num1 = 11;
        int num2 = num1;

        System.out.println(num1); // 11
        System.out.println(num2); // 11

        num1 = 33;

        System.out.println(num1); // 33
        System.out.println(num2); // 11
    }

    /**
     * Pointers simulation
     */
    static void withPointer(){
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("value", 1);
        map2 = map1;

        map1.put("value", 2);

        System.out.println(map1); // value = 2
        System.out.println(map2); // value = 2

    }

    public static void main(String[] args) {
//        withoutPointer();
        withPointer();
    }

}
