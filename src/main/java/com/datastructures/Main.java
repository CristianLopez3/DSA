package com.datastructures;


import java.util.HashMap;


public class Main {
    public static void main(String[] args) {

        String array[] = {"Pan", "Arroz", "Pan", "Arroz", "Colada", "Torta"};
        var result = sumario(array);
        result.keySet().forEach(r -> {
            System.out.println(r + "= " + result.get(r));
        });

    }

    static HashMap<String, Integer> sumario(String[] palabras){
        var sumario = new HashMap<String, Integer>();
        for (String palabra : palabras) {
            if(sumario.get(palabra) == null) {
                sumario.put(palabra, 1);
            } else {
                sumario.compute(palabra, (k, value) -> value + 1);
            }
        }
        return sumario;
    }

    static String reverseWord(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = word.length();

        for (int i = length - 1; i >= 0; i--) {
            stringBuilder.append(word.charAt(i));
        }

        return  stringBuilder.toString();
    }

}