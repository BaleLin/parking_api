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
        Receipts receipts = new Receipts("1",true);
        Car car = new Car("粤C8888");
        receiptsList.add(receipts);
        receiptCarHashMap.put("1",car);
    }
    public Map<String,Car> getAllReceipt(){
        return receiptCarHashMap;
    }
    public Receipts addReceipts(String receiptId,Car car){
        Receipts receipts = new Receipts(receiptId,true);
        receiptCarHashMap.put(receiptId,car);
        return receipts;
    }
    public Car getCarByReceipt(String receiptsId){
        if (receiptCarHashMap.keySet().contains(receiptsId)){
            return receiptCarHashMap.get(receiptsId);
        }
        return null;
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
