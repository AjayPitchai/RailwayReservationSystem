package com.ajay;

import java.util.Scanner;

public class Passenger implements User {

		private String name;
		private int age;

		public Passenger (String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		public Passenger() {
		}
		
		public void showTickets (Ticket t) {
			System.out.println("********Ticket Details*********");
			System.out.println("Passenger Name: " + this.getName());
			System.out.println("Age: " + this.getAge());
			System.out.println("Source Station: " + t.getSource());
			System.out.println("Destination Station: " + t.getDestination());
			System.out.println("Price: "+t.getPrice());
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public void book(Ticket ticket) {
			if(Ticket.ticketList.size()<=10)
				Ticket.ticketList.add(ticket);
			else
				System.out.println("Tickets sold!!!");
			
		}

		@Override
		public void desplayDetails() {
			System.out.println("**********Passenger Details***********");
			System.out.println("Passenger Name: "+this.getName());
			System.out.println("Age: "+this.getAge());
			System.out.println("**************************************");
			
		}
		
}