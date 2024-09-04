package com.test.InheritanceModel;

import java.util.Arrays;

//inheritance, a sub class created from a super class
//in this case, employee is super class while programmer is sub class
//sub class can access all the public methods in super class
public class Programmer extends Employee{
    private String[] programmingLanguages;
    public Programmer(String name,
                      int age,
                      String experience,
                      String address) {
        super(name, age, experience, address);
    }

    //This constructor includes the private attribute.
    public Programmer(String name,
                      int age,
                      String experience,
                      String address,
                      String[] programmingLanguages) {
        super(name, age, experience, address);
        this.programmingLanguages = programmingLanguages;
    }

    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String[] programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    //the super keyword here means we are using the method from super/parent class.
    // i.e. you can differentiate the methods if you have methods with same name as parent class.
    public void writeCode(){
        super.sayHi();
        System.out.println("test."+ this.isGood);
    }

    // overriding the sayHi method from parent class. Can call to see difference.
    @Override
    public void sayHi() {
        var msg = """
                Hello my name is %s
                I am a programmer
                """.formatted(getName());

        System.out.println(msg);
    }
// =============================================

//        FOR TESTING PURPOSES, LAZY TYPE

// =============================================
//    String[] languages = {"c++","python"};
//
//    Programmer javaman = new Programmer(
//            "Sam",
//            25,
//            "Debugging",
//            "NYC",
//            languages
//    );
//        System.out.println(javaman);
//        javaman.writeCode();


}
