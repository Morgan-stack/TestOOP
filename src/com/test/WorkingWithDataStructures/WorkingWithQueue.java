package com.test.WorkingWithDataStructures;

import com.test.PolymorphismModel.Person;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {
    public static void main(String[] args) {

        // Queue is FIFO, the methods are similar to Stacks


        Queue<Person> superMarket = new LinkedList<>();
        superMarket.add(new Person("Sam"));
        superMarket.add(new Person("ZK"));
        superMarket.add(new Person("Yap"));

        System.out.println(superMarket.peek());
        System.out.println(superMarket.poll());
        System.out.println(superMarket.peek());




    }
}
