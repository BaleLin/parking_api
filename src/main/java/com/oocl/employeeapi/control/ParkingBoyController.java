package com.oocl.employeeapi.control;

import com.oocl.employeeapi.domain.ParkingBoy;
import com.oocl.employeeapi.domain.ParkingLot;
import com.oocl.employeeapi.service.ParkingBoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ParkingBoyController {
    @Autowired
    private ParkingBoyService parkingBoyService;

    @GetMapping("/parkingBoy")
    public List<ParkingBoy> getAllParkingBoy(){
        return parkingBoyService.getAllParkingBoy();
    }
    @PostMapping("/parkingBoy")
    public ParkingBoy addParkingBoy(@RequestBody ParkingBoy parkingBoy){
        return parkingBoyService.addParkingBoy(parkingBoy);
    }
    @PostMapping("/parkingBoy/{bId}/parkingLot")
    public ParkingBoy addParkingLotToBoy(@PathVariable int bId,@RequestBody ParkingLot parkingLot){
        return parkingBoyService.addParkingLotToBoy(bId,parkingLot);
    }
}
