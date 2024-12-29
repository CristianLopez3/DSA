package com.datastructures.bigO;


/**
 * Big O always take the worst case scenario of your algorithm.
 * **As it grows** it's the correct way to read the complexity of an algorithm.
 */
public class BigO {


    /**
     * It doesn't matter which value has n, it always take one operation to complete so it is O(1)
     * @param n
     * @return
     */
    private static int constant(int n){
        return n + n;
    }

    /**
     * It is n complexity because it takes n steps to complete its task.
     * @param n
     */
    private static void nComplexity(int n){
        for(int i = 0; i < n; i++){
            System.out.println(i);
        }
    }


    /**
     * It is n^2 because each for loop takes n steps, so the result would be
     * n * n = n^2
     * @param n
     */
    private static void nSquareComplexity(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; i < n; i++){
                System.out.printf("%d %d %d%n", i, j, (i*j));
            }
        }
    }

    /**
     * O(log n) it is when in each step we divide it for (n) times. Some examples are quick sort and merge sort
     * O(Log n) it's like 2 ^ ? = 8 -> log 2 of 8 = 3 -> 2 ^3 = 8
     * @param n
     */
    private static void logComplexity(int n){
        // todo
    }

    /**
     * different inputs can affect the result of our complexity, for that we always can
     * add, log, multiply the inputs to give something like: O(a + b) or O(a * b)
     * @param a
     */
    private static void nFromDifferentInputs(int a, int b){
        for(int i = 0; i < a; i++){ // it takes n operations
            System.out.println(i);
        }

        for(int i = 0; i < b; i++){ // it takes n operations
            System.out.println(i);
        }

        // above we can see and O(a+b) complexity algorithm, but here we are going to see and O(a*b) complexity
        for(int i = 0; i < a; i++){ // it takes n operations
            for(int j = 0; i < b; i++){ // it takes n operations
                System.out.println(i);
            }
        }

    }

}
