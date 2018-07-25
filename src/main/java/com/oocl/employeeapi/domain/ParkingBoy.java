package com.oocl.employeeapi.domain;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingBoy {
    int bid;
    List<ParkingLot> parkingLotList;

    public ParkingBoy() {
    }

    public ParkingBoy(int bid, List<ParkingLot> parkingLotList) {
        this.bid = bid;
        this.parkingLotList = parkingLotList;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public List<ParkingLot> getParkingLotList() {
        return parkingLotList;
    }

    public void setParkingLotList(List<ParkingLot> parkingLotList) {
        this.parkingLotList = parkingLotList;
    }
}
