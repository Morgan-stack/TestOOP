//package com.test;
//import com.test.AbstractSlightlyAdvancedModel.EmailExtractorReport;
//import com.test.AbstractSlightlyAdvancedModel.ExtractorReport;
//import com.test.AbstractSlightlyAdvancedModel.NumberExtractorReport;
//import com.test.EncapsulationModel.BankAccount;
//import com.test.InheritanceModel.Programmer;
//import com.test.PolymorphismModel.Bicycle;
//import com.test.PolymorphismModel.Car;
//import com.test.PolymorphismModel.Person;
//import com.test.PolymorphismModel.Vehicle;
//
//import java.math.BigDecimal;
//
//public class Main {
//    public static void main(String[] args) throws Exception {
//        Car car = new Car();
//        Bicycle bicycle = new Bicycle();
//        Vehicle[] vehicles ={car,bicycle};
//
//        Person person = new Person("John",vehicles);
//
//        for (Vehicle vehicle : person.getVehicles()) {
//            vehicle.move(10);
//        }
//    }
//}