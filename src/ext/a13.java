package ext;

import java.util.Scanner;

abstract class reservation{
	int seats;
	abstract boolean reserve(int s,String type);
	abstract int getAvailableSeats();
}
class reserveTrain extends reservation{
	int seats=100,wseats=50;
	boolean reserve(int s, String type) {
		if(type.equalsIgnoreCase("window"))
			if(s>wseats)
				return false;
			else {
				wseats-=s;
				return true;
			}
		if(type.equalsIgnoreCase("regular"))
			if(s>seats)
				return false;
			else {
				seats-=s;
				return true;
			}
		else {
			System.out.println("select properly");
		}
			return false;
	}

	int getAvailableSeats() {
		System.out.println("regular:"+seats);
		System.out.println("window:"+wseats);
		int total=seats+wseats;
		System.out.println("total:");
		return total;
	}
	
}
class reserveBus extends reservation{
	int seats=30;
	boolean reserve(int s, String type) {

		return false;
	}

	int getAvailableSeats() {

		return 0;
	}
	
}
public class a13 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String seattype;
	int seat;
	reserveTrain t1=new reserveTrain();
	//reserveBus b1=new reserveBus();
	//t1.reserve(4,"window");
	//System.out.print(t1.getAvailableSeats());
	//t1.reserve(10,"regular");
	//System.out.print(t1.getAvailableSeats());
	while(true) {
		System.out.print("enter choice 1-reserve 2-available 3-exit");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:System.out.print("enter no of seats");
				seat=sc.nextInt();
				System.out.print("enter seat type reg/win");
				sc.nextLine();
				seattype=sc.nextLine();
				boolean b=t1.reserve(seat,seattype);
				if(b==true)
					System.out.print("reservation success");
				else
					System.out.print("not enough seats");
				break;
		case 2:System.out.print("no of seats remaining in train:");
				System.out.println(t1.getAvailableSeats());
				break;
		case 3:System.exit(0);
		default: System.out.print("improper selection");
		}
		
	}
}
}
