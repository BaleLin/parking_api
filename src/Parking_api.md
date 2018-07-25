### ParkingLot:
1.
method:get  
path:/parkingLot  
request:  
respose:List<ParkingLot>  
2.  
method:post  
path:/parkingLot  
request:parkingLot  
respose:parkingLot  

### ParkingBoy：  
1.
method:get  
path:/parkingBoy  
request:  
respose:List<ParkingBoy>  
2.
method:post  
path:/parkingBoy  
request:ParkingBoy  
respose:ParkingBoy  
3.
method:post  
path:parkingBoy/{bId}/parkingLot  
request:ParkingLot  
respose:ParkingBoy  