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
		
		public void showPassengerPage() {
			while(true) {
				Scanner sc = new Scanner(System.in);
				System.out.println("1. Book a ticket");
				System.out.println("2. Show ticket");
				System.out.println("3. Exit");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Enter name: ");
					String Name=sc.next();
					System.out.println("Enter Age: ");
					int Age = sc.nextInt();
					System.out.println("Enter Source station name: ");
					String Source=sc.next();
					System.out.println("Enter Destination station name: ");
					String Destination=sc.next();
					User p=new Passenger(Name, Age);
					Ticket t = new Ticket(Source, Destination, p);
					p.book(t);
					break;
				case 2:
					System.out.println("Enter ticket id to show: ");
					int ticketId=sc.nextInt();
					Ticket tt = new Ticket();
					tt.showTicket(ticketId);
					break;
				case 3:
					return;
				}
			}
		}
		
}