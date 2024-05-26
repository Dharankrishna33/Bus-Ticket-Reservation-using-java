package bus_ticket_reservation;
import java.util.*;
import java.text.*;
public class Booking {
      String passangerName;
      int busNo;
      Date date;
      
      Booking(){
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println();
    	  System.out.println("Enter your name :");
    	  this.passangerName=sc.nextLine();
    	  System.out.println("Enter the bus number you want to travel :");
    	  this.busNo=sc.nextInt();
    	  System.out.println("Enter your travel date in \"dd-MM-yyyy\" format :");
    	  String dateInput=sc.next();
    	
    	  
    	  try {
			date=new SimpleDateFormat("dd-MM-yyyy").parse(dateInput); 
		  } catch (ParseException e) {			
			e.printStackTrace();
		  }
    	  System.out.println();
      }
      public boolean isAvailable(ArrayList<Bus>buses,ArrayList<Booking>bookings) {
    	  int capacity=0;
    	  for(Bus b:buses) {
    		  if(busNo==b.getBusNo()) {
    			  capacity=b.getCapacity();
    		  }
    	  }
    	  int bookings_done=0;
    	  for(Booking b:bookings) {
    		  if(busNo==b.getBusNo() && date.equals(b.getDate())) {
    			  bookings_done++;
    		  }
    	  }
    	  return bookings_done<capacity;
      }
      
      public Date getDate() {
    	  return date;
      }
      public void setCapacity(Date c) {
    	  date=c;
      }
      
      public int getBusNo() {
    	  return busNo;
      }
      public void setBusNo(int b) {
    	   busNo=b;
      }
      
}
