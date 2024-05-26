package bus_ticket_reservation;
import java.util.*;

public class Ui {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException {
		
		ArrayList<Bus>buses=new ArrayList<>();
		ArrayList<Booking>bookings=new ArrayList<>();
		
		buses.add(new Bus(1001,true,3,"Tirunelveli","Chennai"));
		buses.add(new Bus(1002,true,40,"Tenkasi","Trichy"));
		buses.add(new Bus(1003,true,40,"Madurai","Chennai"));
		buses.add(new Bus(1004,true,35,"Tirunelveli","Banglore"));
		buses.add(new Bus(1004,true,35,"Tirunelveli","Mumbai"));
		
		System.out.println("\t\t\t      WELCOME TO MY_TRAVELS");
		System.out.println("\t\t\tTHE AVAILABLE BUSES ARE AS BELOW ");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		for(Bus b:buses) {
			b.busList();
		}
		System.out.println();
		
		int input=1;
		while(input==1){
			
			System.out.println("Please enter any one option shown below!!");
			System.out.println("1.To Book a bus");
			System.out.println("2.Exit");
			input=sc.nextInt();
			if(input==1) {
				Booking booking=new Booking();
				if(booking.isAvailable(buses, bookings)) {
					bookings.add(booking);
					Thread.sleep(1000);
					System.out.println("Booking successfull.......");
					System.out.println();
				}
				else{
					System.out.println("The bus is full.So,please try for another bus or date.");
					System.out.println();
				}
			}
		}

	}

}
