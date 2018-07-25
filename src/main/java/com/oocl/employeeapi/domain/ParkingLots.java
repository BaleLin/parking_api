package com.oocl.employeeapi.domain;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ParkingLots {
    private int lotId;
    private String parkingLotName;
    int size;
    private List<Car> carList = new ArrayList<>();

    public ParkingLots() {
    }

//    public ParkingLots(int lotId, String parkingLotName) {
//        this.lotId = lotId;
//        this.parkingLotName = parkingLotName;
//    }


    public ParkingLots(int lotId,  String parkingLotName,int size) {
        this.lotId = lotId;
        this.size = size;
        this.parkingLotName = parkingLotName;
    }

    public ParkingLots(int lotId, String parkingLotName, int size, List<Car> carList) {
        this.lotId = lotId;
        this.parkingLotName = parkingLotName;
        this.size = size;
        this.carList = carList;
    }

    public int getLotId() {
        return lotId;
    }

    public void setLotId(int lotId) {
        this.lotId = lotId;
    }

    public String getParkingLotName() {
        return parkingLotName;
    }

    public void setParkingLotName(String parkingLotName) {
        this.parkingLotName = parkingLotName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParkingLots that = (ParkingLots) o;
        return lotId == that.lotId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(lotId);
    }
}
