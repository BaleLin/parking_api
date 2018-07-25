package com.oocl.employeeapi.service;

import com.oocl.employeeapi.domain.Car;
import com.oocl.employeeapi.domain.ParkingLots;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    public ParkingLots parkCar(Car car){
        try{
            if (!parkingLotIsFull()){
                for (ParkingLots parkingLots:parkingLotsList){
                    if (parkingLots.getSize()>0){
                        parkingLots.getCarList().add(car);
                        int tempSize = parkingLots.getSize();
                        parkingLots.setSize(--tempSize);
                        return parkingLots;
                    }
                }
            }
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        return null;
    }
    public ParkingLots unparkCar(Car car){
        try{
            for (ParkingLots parkingLots:parkingLotsList){
                    if (parkingLots.getCarList().contains(car)){
                        parkingLots.getCarList().remove(car);
                        int tempSize = parkingLots.getSize();
                        parkingLots.setSize(++tempSize);
                        return parkingLots;
                    }
                }

        }catch (RuntimeException e){
            e.printStackTrace();
        }
        return null;
    }
    public Boolean parkingLotIsFull(){
        List<ParkingLots> collect = parkingLotsList.stream()
                .filter(x -> x.getSize()>0)
                .collect(Collectors.toList());
        return !(collect.size() > 0);
    }
}
