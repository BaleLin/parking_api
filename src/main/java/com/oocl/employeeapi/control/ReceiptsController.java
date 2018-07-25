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
    @PostMapping("/receipts")
    public Receipts addReceipts(@RequestBody Car car){
        return receiptsService.addReceipts(car);
    }

    @PutMapping("/receipts/{receiptsId}")
    public Receipts updateReceiptsUnValidById(@PathVariable String receiptsId){
        return receiptsService.updateReceiptsUnValidById(receiptsId);
    }
}
