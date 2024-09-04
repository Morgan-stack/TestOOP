package com.test.WorkingWithStreams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExerciseTest {

    public static void main(String[] args) {
        imperativeApproach();
        declarativeApproachUsingStreams();
    }
    public static void imperativeApproach() {

        List<Cars> electricCars = new ArrayList<>();

        List<Cars> cars = List.of(
                new Cars("x5", true),
                new Cars("saga", false)
        );

        if (cars.size() == 0){
            System.out.println("empty list");
        }

        for (Cars car : cars) {
            if (car.isElectric()) {
                electricCars.add(car);
            }
        }
        electricCars.forEach(System.out::println);
    }

    public static void declarativeApproachUsingStreams() {

        List<Cars> cars = List.of(
                new Cars("x5", true),
                new Cars("saga", false)
        );

        List<Cars> electricCars = cars.stream()
                .filter(c -> !cars.isEmpty() && c.isElectric())
                .collect(Collectors.toList());
        electricCars.forEach(System.out::println);

    }

}

