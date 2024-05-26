package bus_ticket_reservation;

public class Bus {
      int busNo;
      boolean ac;
      int capacity;
      String fromPlace;
      String toPlace;
      
      Bus(int busNo,boolean ac,int capacity,String fromPlace,String toPlace){
    	  this.busNo=busNo;
    	  this.ac=ac;
    	  this.capacity=capacity;
    	  this.fromPlace=fromPlace;
    	  this.toPlace=toPlace;
      }
      
      public void busList() {
    	  
    	  System.out.println("BUS_NO: "+ busNo+"  AC/NON-AC: "+ac+"  CAPACITY: "+capacity+"  FROM_PLACE: "+fromPlace+"  TO_PLACE: "+toPlace);
    	  System.out.println("-----------------------------------------------------------------------------------------------");
      }
      
      
      public int getCapacity() {
    	  return capacity;
      }
      
      public void setCapacity(int c) {
    	  capacity=c;
      }
      
      public int getBusNo() {
    	  return busNo;
      }
      
      public void setBusNo(int b) {
    	   busNo=b;
      }
      
      public String getFromPlace() {
    	  return fromPlace;
      }
      
      public void setFromPlace(int fp) {
    	  capacity=fp;
      }
      
      public String getToPlace() {
    	  return toPlace;
      }
      
      public void setToPlace(int tp) {
    	  capacity=tp;
      }
      
}
