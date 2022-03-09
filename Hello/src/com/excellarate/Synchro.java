package com.excellarate;

class BookTheaterSeat{
	int ticket=14;
	synchronized void bookSeat(int seat)
	{
		if(ticket>=seat)
		{
			System.out.println("seat booked");
			ticket=ticket-seat;
			System.out.println("Available seats are:"+ticket);
		}
		else
			System.out.println("Seat not available");
	}
	
}

public class Synchro extends Thread {
	
static BookTheaterSeat b;
int seats;
public void run()
{
 b.bookSeat(seats);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b=new BookTheaterSeat();
		Synchro s=new Synchro();
		s.seats=7;
		s.start();
		Synchro a=new Synchro();
		a.seats=7;
		a.start();

	}

}
