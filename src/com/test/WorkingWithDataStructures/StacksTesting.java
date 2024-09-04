package com.test.WorkingWithDataStructures;

import java.util.Stack;

public class StacksTesting {

    public static void testWater(){
        //Last in, first out (LIFO)
        //synchronized, multithreading safe.

        Stack<Integer> stackTest = new Stack<>();
        stackTest.push(1);
        stackTest.push(2);
        stackTest.push(3);

        // peeks the top element
        stackTest.peek();



    }

}
