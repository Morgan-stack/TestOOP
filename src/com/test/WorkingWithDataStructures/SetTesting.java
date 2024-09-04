package com.test.WorkingWithDataStructures;

import com.test.PolymorphismModel.Person;

import java.util.HashSet;
import java.util.Set;


// Set cannot have duplicate, and have NO ORDER!
public class SetTesting {

    public static void main(String[] args) {

        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("Sam"));
        personSet.add(new Person("Chee Han"));
        personSet.forEach(System.out::println);

    }
}
