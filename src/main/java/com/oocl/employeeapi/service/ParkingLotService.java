package com.oocl.employeeapi.service;

import com.oocl.employeeapi.domain.ParkingLot;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingLotService {
    List<ParkingLot> parkingLotList = new ArrayList<>();
    {
        parkingLotList.add(new ParkingLot(1,"东南停车场"));
        parkingLotList.add(new ParkingLot(2,"东北停车场"));
    }
    public List<ParkingLot> getAllParkingLot(){
        return parkingLotList;
    }
    public ParkingLot addParkingLot(ParkingLot parkingLot){
        try{
            parkingLotList.add(parkingLot);
            return parkingLot;
          }catch (RuntimeException e){
            e.printStackTrace();
        }
        return null;
    }
}
