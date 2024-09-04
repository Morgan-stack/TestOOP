package com.test.WorkingWithStreams;

import java.util.Objects;

public class Cars {
    private String name;
    private boolean isElectric;

    public Cars(String name, boolean isElectric) {
        this.name = name;
        this.isElectric = isElectric;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return isElectric == cars.isElectric && Objects.equals(name, cars.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isElectric);
    }

    @Override
    public String toString() {
        return "Cars{" +
                "name='" + name + '\'' +
                ", isElectric=" + isElectric +
                '}';
    }
}
