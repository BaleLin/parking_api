package com.oocl.employeeapi.domain;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ParkingLots {
    private int lotId;
    private String parkingLotName;
    int size;

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
