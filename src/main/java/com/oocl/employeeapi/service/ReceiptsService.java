package com.oocl.employeeapi.service;

import com.oocl.employeeapi.domain.Car;
import com.oocl.employeeapi.domain.Receipts;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@Service
public class ReceiptsService {
    List<Receipts> receiptsList = new ArrayList<>();
    Map<String,Car> receiptCarHashMap = new HashMap<>();
    {
        String receiptId = UUID.randomUUID().toString();
        Receipts receipts = new Receipts(receiptId,true);
        Car car = new Car("粤C8888");
        receiptsList.add(receipts);
        receiptCarHashMap.put(receiptId,car);
    }
    public Map<String,Car> getAllReceipt(){
        return receiptCarHashMap;
    }
    public Receipts addReceipts(Car car){
        String receiptId = UUID.randomUUID().toString();
        Receipts receipts = new Receipts(receiptId,true);
        receiptCarHashMap.put(receiptId,car);
        return receipts;
    }
    public Receipts updateReceiptsUnValidById(String receiptsId){
        if (receiptCarHashMap.keySet().contains(receiptsId)){
           for (Receipts receipts:receiptsList){
               if (receipts.getReceiptId().equals(receiptsId)){
                   receipts.setValid(false);
                   return receipts;
               }
           }
           }
           return null;
    }

}
