package com.oocl.employeeapi.service;

import com.oocl.employeeapi.domain.ParkingBoys;
import com.oocl.employeeapi.domain.ParkingLots;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingBoyService {
    List<ParkingBoys> parkingBoysList = new ArrayList<>();

    {
        List<ParkingLots> list1 = new ArrayList<>();
        list1.add(new ParkingLots(1, "东南停车场",20));
        list1.add(new ParkingLots(2, "东南停车场",20));
        parkingBoysList.add(new ParkingBoys(1, list1));
    }

    public List<ParkingBoys> getAllParkingBoy() {
        return parkingBoysList;
    }

    public ParkingBoys addParkingBoy(ParkingBoys parkingBoys) {
        try {
            parkingBoysList.add(parkingBoys);
            return parkingBoys;
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ParkingBoys addParkingLotToBoy(int bid, ParkingLots parkingLots) {
        try {
            for (ParkingBoys parkingBoys : parkingBoysList) {
                if (parkingBoys.getBid() == bid) {
                    List<ParkingLots> temp = parkingBoys.getParkingLotsList();
                    if (!temp.contains(parkingLots)) {
                        temp.add(parkingLots);
                        parkingBoys.setParkingLotsList(temp);
                        return parkingBoys;
                    }
                }
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return null;
    }
}
