package com.ajay;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class Ticket {
	private static final AtomicLong SEQ = new AtomicLong();
	private int ticketid;
	private String source;
	private String destination;
	private String passengerName;
	protected int price;
	public static final List<Ticket> ticketList = new ArrayList<Ticket>();
	public Ticket() {
		source=null;
		destination=null;
		passengerName=null;
		price=0;
	}
	
	public Ticket(String source, String destination, User passenger, int price) {
		this.ticketid=(int) SEQ.getAndIncrement();
		this.source = source;
		this.destination=destination;
		this.passengerName=((Passenger) passenger).getName();
		this.price=price;
	}

	public Ticket(String source, String destination, String passengerName, int price) {
		this.source=source;
		this.destination=destination;
		this.passengerName=passengerName;
		this.price=price;
	}

	

	public Ticket(String source, String destination, User p) {
		this.source=source;
		this.destination=destination;
		this.passengerName=((Passenger) p).getName();
		price=999;
	}

	public String getSource() {
		return source;
	}

	public String getDestination() {
		return destination;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public int getPrice() {
		return price;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	@Override
	public String toString() {
		return "Ticket [ticketid=" + ticketid + ", source=" + source + ", destination=" + destination
				+ ", passengerName=" + passengerName + ", price=" + price + "]";
	}
	
	public void showTicket(int ticketId) {
		Ticket ticket=new Ticket();
		for(Ticket t:ticketList) {
			if(t.getTicketid()==ticketId)
				ticket=t;
		}
		System.out.println("Ticket Details\n Passenger Name "+ticket.getPassengerName()+"\n Source Station "+ ticket.getSource()+"\n Destination "+ticket.getDestination());
	}
	
	
}
