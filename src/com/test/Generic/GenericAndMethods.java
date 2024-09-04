package com.test.Generic;

public class GenericAndMethods {

    public static void main(String[] args) {

        String[] names = {"sam", "jc"};
        Character[] letters = {'a','b','c'};
        print1(names);
        // In Generics, not allowed to use the usual small letter primitives,
        // i.e., int, char
        // Need to use wrapper class (object version) instead.
        // i.e. Character, Integer, etc.
        print2(letters);
    }

    // This "print1" class can print array for strings,
    // what to do if you want to print any array with other data types??
    // Refer to "print2" class
    static void print1(String[] array){
        for (String e : array){
            System.out.println(
                    e.getClass().getName() + "-" + e
            );
        }
    }

    static <T> void print2(T[] array){
        for (T e: array){
            System.out.println(
                    e.getClass().getName()
            );
        }
    }
}
