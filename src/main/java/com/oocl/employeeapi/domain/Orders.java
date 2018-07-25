package com.oocl.employeeapi.domain;

import org.springframework.stereotype.Service;

@Service
public class Orders {
    int orderId;
    String carNumber;
    ParkingBoys parkingBoys;
    boolean isValid;

    public Orders() {
    }


    public Orders(int orderId, String carNumber, boolean isValid) {
        this.orderId = orderId;
        this.carNumber = carNumber;
        this.isValid = isValid;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public ParkingBoys getParkingBoys() {
        return parkingBoys;
    }

    public void setParkingBoys(ParkingBoys parkingBoys) {
        this.parkingBoys = parkingBoys;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }
}
