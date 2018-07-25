package com.oocl.employeeapi.control;

import com.oocl.employeeapi.domain.ParkingLot;
import com.oocl.employeeapi.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParkingLotController {
    @Autowired
    private ParkingLotService parkingLotService;

    @GetMapping("/parkingLot")
    public List<ParkingLot> getAllParkingLot(){
        return parkingLotService.getAllParkingLot();
    }
    @PostMapping("/parkingLot")
    public ParkingLot addParkingLot(@RequestBody ParkingLot parkingLot){
        return parkingLotService.addParkingLot(parkingLot);
    }
}
