package com.oocl.employeeapi.control;

import com.oocl.employeeapi.domain.Orders;
import com.oocl.employeeapi.domain.ParkingBoys;
import com.oocl.employeeapi.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrdersController {
    @Autowired
    private OrdersService ordersService;
    @GetMapping("/orders")
    public List<Orders> getAllOrder(){
        return ordersService.getAllOrder();
    }
    @GetMapping("/orders/valid")
    public Orders getValidOrder(){
        return ordersService.getValidOrder();
    }

    @PostMapping("/orders")
    public Orders addOrder(@RequestBody Orders orders){
        return ordersService.addOrder(orders);
    }
    @PutMapping("/orders/{orderId}")
    public Orders pakingboyGetOrder(@PathVariable int orderId, @RequestBody ParkingBoys parkingBoys){
        return ordersService.updateOrder(orderId,parkingBoys);
    }
}
