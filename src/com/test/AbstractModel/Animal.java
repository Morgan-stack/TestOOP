package com.test.AbstractModel;

import java.util.Objects;

//if use abstract keyword, cannot instantiate the super class.
//i.e., Animal wong = new Dog() can work while
// Animal wong = new animal() will not work.
abstract public class Animal {
    private String namel;
    private int age;
    public Animal(String namel, int age) {
        this.namel = namel;
        this.age = age;
    }

    // 1. The abstract keyword in method below just means every sub-class created
    //    must implement and *OVERRIDE* the method. (also can be inside interface class)
    // 2. Abstract method can only be used when the class is abstract also.
    // 3. No method body.

    abstract public void makeSound();

    public void testwater(){
        System.out.println("test.");
    }
    public String getNamel() {
        return namel;
    }

    public void setNamel(String namel) {
        this.namel = namel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "namel='" + namel + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(namel, animal.namel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namel, age);
    }
}
