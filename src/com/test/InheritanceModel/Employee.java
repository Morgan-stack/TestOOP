package com.test.InheritanceModel;

import java.util.Objects;

public class Employee {
    protected String name;
    private int age;
    private String experience;
    private String address;

    // if you use protected, the sub class can use this variable with this.isGood.
    protected boolean isGood;

    public Employee(String name,
                    int age,
                    String experience,
                    String address) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.address = address;
    }

    public void sayHi(){
        System.out.println("hi my name is "+ this.name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience='" + experience + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(experience, employee.experience) && Objects.equals(address, employee.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, experience, address);
    }
}
