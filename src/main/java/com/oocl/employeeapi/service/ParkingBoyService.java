package com.oocl.employeeapi.service;

import com.oocl.employeeapi.domain.ParkingBoy;
import com.oocl.employeeapi.domain.ParkingLot;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingBoyService {
    List<ParkingBoy> parkingBoyList = new ArrayList<>();

    {
        List<ParkingLot> list1 = new ArrayList<>();
        list1.add(new ParkingLot(1, "东南停车场"));
        list1.add(new ParkingLot(2, "东南停车场"));
        parkingBoyList.add(new ParkingBoy(1, list1));
    }

    public List<ParkingBoy> getAllParkingBoy() {
        return parkingBoyList;
    }

    public ParkingBoy addParkingBoy(ParkingBoy parkingBoy) {
        try {
            parkingBoyList.add(parkingBoy);
            return parkingBoy;
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ParkingBoy addParkingLotToBoy(int bid, ParkingLot parkingLot) {
        try {
            for (ParkingBoy parkingBoy : parkingBoyList) {
                if (parkingBoy.getBid() == bid) {
                    List<ParkingLot> temp = parkingBoy.getParkingLotList();
                    if (!temp.contains(parkingLot)) {
                        temp.add(parkingLot);
                        parkingBoy.setParkingLotList(temp);
                        return parkingBoy;
                    }
                }
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return null;
    }
}
