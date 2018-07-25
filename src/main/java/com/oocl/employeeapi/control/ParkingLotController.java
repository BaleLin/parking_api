package com.oocl.employeeapi.control;

import com.oocl.employeeapi.domain.Car;
import com.oocl.employeeapi.domain.ParkingLots;
import com.oocl.employeeapi.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParkingLotController {
    @Autowired
    private ParkingLotService parkingLotService;

    @GetMapping("/parkingLots")
    public List<ParkingLots> getAllParkingLot(){
        return parkingLotService.getAllParkingLot();
    }
    @PostMapping("/parkingLots")
    public ParkingLots addParkingLot(@RequestBody ParkingLots parkingLots){
        return parkingLotService.addParkingLot(parkingLots);
    }
    @PostMapping("/parkingLots/car")
    public ParkingLots parkCar(@RequestBody Car car){
        return parkingLotService.parkCar(car);
    }
    @DeleteMapping("/parkingLots/car")
    public ParkingLots unParkCar(@RequestBody Car car){
        return parkingLotService.unparkCar(car);
    }
}
