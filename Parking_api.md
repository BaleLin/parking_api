### ParkingLots:
1.查询所有停车场
```josn
method:get  
URL:/parkingLots  
request: {
    
} 
respose:{
List<ParkingLots>  
}
```
2. 添加停车场 
```josn
method:post  
URL:/parkingLots  
request:{
parkingLots
}  
respose:{
parkingLots
}
```
### ParkingBoys：  
1.查询所有停车小弟
```Json
method:get  
URL:/parkingBoys  
request:{
}
respose:{
List<ParkingBoys> 
}
```
2.添加停车小弟
```json
method:post  
URL:/parkingBoys  
request:{
ParkingBoys
}  
respose:{
ParkingBoys
} 
```
3.给停车小弟管理某个停车场
```json
method:post  
URL:parkingBoys/{bId}/parkingLots  
request:{
ParkingLots
}  
respose:{
ParkingBoys  
}
```