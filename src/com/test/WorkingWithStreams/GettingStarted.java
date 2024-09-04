package com.test.WorkingWithStreams;

import com.test.PolymorphismModel.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GettingStarted {

    public static void main(String[] args) {

    }
    public static void imperativeApproach() throws IOException {

        // 1. Find people aged less or equal 18
        // 2. Then change implementation to find first 10 people.

        List<Person2> youngPeople = new ArrayList<>();

        int count = 0;
        int limit = 1;

        List<Person2> people = List.of(
                new Person2("jessie",18),
                new Person2("low",18),
                new Person2("wong",16),
                new Person2("chen",21),
                new Person2("tan",21),
                new Person2("Sam",21),
                new Person2("yap",21)
        );

        for (Person2 person : people) {
            if(person.getAge() <= 18){
                youngPeople.add(person);
                count++;
            }
            if (count == limit){
                break;
            };
        }
        youngPeople.forEach(System.out::println);

    }

                            // JAVA STREAM API

    // STEP 1
    //============================================================
    // FOR STREAMS, WE START WITH A COLLECTION
    // I.E., LIST, ARRAY, SETS, etc.


    // STEP 2
    //============================================================
    // THEN, WE TELL WHAT WE WANT BY USING INTERMEDIATE OPERATORS
    // I.E., FILTER, MAP, REDUCE, etc.


    // STEP 3
    //============================================================
    // WE END WITH TERMINATOR OPERATOR.
    // I.E., sum(), collect(Collectors.toList()), average(), etc.

    public static void declarativeApproachUsingStreams() throws Exception{

        List<Person2> people = List.of(
                new Person2("jessie",18),
                new Person2("low",18),
                new Person2("wong",16),
                new Person2("chen",21),
                new Person2("tan",21),
                new Person2("yap",21),
                new Person2("sam",21)
        );

        List<Person2> youngPeople = people.stream()
                .filter(p -> p.getAge() <=18)
                .limit(3)
                .collect(Collectors.toList());
        youngPeople.forEach(System.out::println);
    }

}
