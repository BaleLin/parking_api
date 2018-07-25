package com.oocl.employeeapi.service;

import com.oocl.employeeapi.domain.ParkingLots;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingLotService {
    List<ParkingLots> parkingLotsList = new ArrayList<>();
    {
        parkingLotsList.add(new ParkingLots(1,"东南停车场",20));
        parkingLotsList.add(new ParkingLots(2,"东北停车场",20));
    }
    public List<ParkingLots> getAllParkingLot(){
        return parkingLotsList;
    }
    public ParkingLots addParkingLot(ParkingLots parkingLots){
        try{
            parkingLotsList.add(parkingLots);
            return parkingLots;
          }catch (RuntimeException e){
            e.printStackTrace();
        }
        return null;
    }
}
