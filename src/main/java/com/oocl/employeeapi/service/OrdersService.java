package com.oocl.employeeapi.service;

import com.oocl.employeeapi.domain.Car;
import com.oocl.employeeapi.domain.Orders;
import com.oocl.employeeapi.domain.ParkingBoys;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersService {
    List<Orders> ordersList = new ArrayList<>();
    {
        Orders orders = new Orders(1,"粤C888",true);
        ordersList.add(orders);
    }

    public List<Orders> getAllOrder(){
        return  ordersList;
    }

    public Orders addOrder(Orders orders){
        ordersList.add(orders);
        return  orders;
    }
    public Orders updateOrder(int orderId,ParkingBoys parkingBoys){
        for (Orders orders:ordersList){
            if (orders.getOrderId()==orderId){
                orders.setParkingBoys(parkingBoys);
                orders.setValid(false);
                return orders;
            }
        }
       return null;
    }
    public Orders getValidOrder(){
        for (Orders orders:ordersList){
            if (orders.isValid()==true){
                return orders;
            }
        }
        return null;
    }
}
