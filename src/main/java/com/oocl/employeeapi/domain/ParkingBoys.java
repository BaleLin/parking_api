package com.oocl.employeeapi.domain;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingBoys {
    int bid;
    List<ParkingLots> parkingLotsList;

    public ParkingBoys() {
    }

    public ParkingBoys(int bid, List<ParkingLots> parkingLotsList) {
        this.bid = bid;
        this.parkingLotsList = parkingLotsList;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public List<ParkingLots> getParkingLotsList() {
        return parkingLotsList;
    }

    public void setParkingLotsList(List<ParkingLots> parkingLotsList) {
        this.parkingLotsList = parkingLotsList;
    }
}
