package com.oocl.employeeapi.control;

import com.oocl.employeeapi.domain.Car;
import com.oocl.employeeapi.domain.Receipts;
import com.oocl.employeeapi.service.ReceiptsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ReceiptsController {
    @Autowired
    private ReceiptsService receiptsService;
    @GetMapping("/receipts")
    public Map<Receipts,Car> getAllReceipt(){
        return receiptsService.getAllReceipt();
    }
    @PostMapping("/receipts")
    public Receipts addReceipts(@RequestBody Car car){
        return receiptsService.addReceipts(car);
    }

}
