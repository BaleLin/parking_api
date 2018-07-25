### ParkingLots:
1.
method:get  
path:/parkingLots  
request:  
respose:List<ParkingLots>  
2.  
method:post  
path:/parkingLots  
request:parkingLots  
respose:parkingLots  

### ParkingBoys：  
1.
method:get  
path:/parkingBoys  
request:  
respose:List<ParkingBoys>  
2.
method:post  
path:/parkingBoys 
request:ParkingBoys 
respose:ParkingBoys  
3.
method:post  
path:parkingBoys/{bId}/parkingLots  
request:ParkingLots  
respose:ParkingBoys  