package com.oocl.employeeapi.control;

import com.oocl.employeeapi.domain.Car;
import com.oocl.employeeapi.domain.Receipts;
import com.oocl.employeeapi.service.ReceiptsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class ReceiptsController {
    @Autowired
    private ReceiptsService receiptsService;
    @GetMapping("/receipts")
    public Map<String,Car> getAllReceipt(){
        return receiptsService.getAllReceipt();
    }
    @GetMapping("/receipts/{receiptsId}")
    public Car getCarByReceipt(@PathVariable String receiptsId){
        return receiptsService.getCarByReceipt(receiptsId);
    }
    @PostMapping("/receipts/{receiptsId}")
    public Receipts addReceipts(@PathVariable String receiptsId, @RequestBody Car car){
        return receiptsService.addReceipts(receiptsId,car);
    }

    @PutMapping("/receipts/{receiptsId}")
    public Receipts updateReceiptsUnValidById(@PathVariable String receiptsId){
        return receiptsService.updateReceiptsUnValidById(receiptsId);
    }


}
