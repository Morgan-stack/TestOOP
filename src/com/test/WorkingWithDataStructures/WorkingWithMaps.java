package com.test.WorkingWithDataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMaps {
    public static void main(String[] args) {

        // A map has  pair of key and value MAPPED to each other
        // No duplicates
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Sam"));
        map.put(2, new Person("JC"));


        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.containsKey(3));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());

        map.entrySet().forEach(System.out::println);
        map.entrySet().
                forEach(x-> System.out.println(x.getKey() + " " + x.getValue()));
        map.forEach(((key, person) -> {
            System.out.println(key + " " + person);
        }));
        System.out.println(map.getOrDefault(3, new Person("Default")));
        System.out.println("map.keySet()" + map.keySet());
        System.out.println("map.values()" + map.values());

        // Lesson 229
        // with hashCode, will generate same hashKey if same attribute
        Map<Person, Subject> map2= new HashMap<>();
        System.out.println(new Person("JC").hashCode());
        System.out.println(new Person("JC").hashCode());
        map2.put(new Person("JC"), new Subject("ACCA"));
        System.out.println("test output map.get : " + map2.get(new Person("JC")));

    }
    static class Person{
        String name;
        public Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        // for same objects (i.e. same properties), can generate same hascode
        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
    record Subject(String name){}
}
