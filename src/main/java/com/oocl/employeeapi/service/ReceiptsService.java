package com.oocl.employeeapi.service;

import com.oocl.employeeapi.domain.Car;
import com.oocl.employeeapi.domain.Receipts;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class ReceiptsService {
    Map<Receipts,Car> receiptCarHashMap = new HashMap<>();
    {
        Receipts receipts = new Receipts(UUID.randomUUID().toString(),true);
        Car car = new Car("粤C8888");
        receiptCarHashMap.put(receipts,car);
    }
    public Map<Receipts,Car> getAllReceipt(){
        return receiptCarHashMap;
    }
    public Receipts addReceipts(Car car){
        Receipts receipts = new Receipts(UUID.randomUUID().toString(),true);
        receiptCarHashMap.put(receipts,car);
        return receipts;
    }

}
