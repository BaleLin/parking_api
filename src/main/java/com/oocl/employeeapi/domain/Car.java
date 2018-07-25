package com.oocl.employeeapi.domain;

import org.springframework.stereotype.Service;

import java.util.Objects;
@Service
public class Car {
    String carNumber;

    public Car() {
    }

    public Car(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(carNumber, car.carNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(carNumber);
    }
}
