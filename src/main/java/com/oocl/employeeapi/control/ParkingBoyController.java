package com.oocl.employeeapi.control;

import com.oocl.employeeapi.domain.ParkingBoys;
import com.oocl.employeeapi.domain.ParkingLots;
import com.oocl.employeeapi.service.ParkingBoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ParkingBoyController {
    @Autowired
    private ParkingBoyService parkingBoyService;

    @GetMapping("/parkingBoys")
    public List<ParkingBoys> getAllParkingBoy(){
        return parkingBoyService.getAllParkingBoy();
    }
    @PostMapping("/parkingBoys")
    public ParkingBoys addParkingBoy(@RequestBody ParkingBoys parkingBoys){
        return parkingBoyService.addParkingBoy(parkingBoys);
    }
    @PostMapping("/parkingBoys/{bId}/parkingLots")
    public ParkingBoys addParkingLotToBoy(@PathVariable int bId, @RequestBody ParkingLots parkingLots){
        return parkingBoyService.addParkingLotToBoy(bId, parkingLots);
    }
}
