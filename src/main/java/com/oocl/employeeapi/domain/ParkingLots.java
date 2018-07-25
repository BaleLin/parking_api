package com.oocl.employeeapi.domain;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ParkingLots {
    private int lotId;
    private String parkingLotName;

    public ParkingLots() {
    }

    public ParkingLots(int lotId, String parkingLotName) {
        this.lotId = lotId;
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
