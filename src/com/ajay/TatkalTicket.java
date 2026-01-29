package com.ajay;

public class TatkalTicket extends Ticket {
	public TatkalTicket(String source, String destination, Passenger passenger, int price) {
		super(source, destination, passenger);
		this.price=price*3;
	}
}
