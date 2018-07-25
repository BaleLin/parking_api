package com.oocl.employeeapi.control;

import com.oocl.employeeapi.domain.ParkingBoy;
import com.oocl.employeeapi.service.ParkingBoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ParkingBoyController {
    @Autowired
    private ParkingBoyService parkingBoyService;

    @GetMapping("/parkingBoy")
    public List<ParkingBoy> getAllParkingBoy(){
        return parkingBoyService.getAllParkingBoy();
    }
}
