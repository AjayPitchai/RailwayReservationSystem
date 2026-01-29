package com.ajay;

import java.util.List;
import java.util.Scanner;

public class Admin implements User {

	@Override
	public void book(Ticket ticket) {
		if (Ticket.ticketList.size()<=10)
			Ticket.ticketList.add(ticket);
		else
			System.out.println("Sorry!!! Tickets are sold!!!!");
	}

	@Override
	public void displayDetails() {
		System.out.println("You are the admin of this Railway reservation system!!!");
		
	}
	
	public void viewAllTickets() {
		for(Ticket t: Ticket.ticketList)
			System.out.println(t.toString());
	}
	
	public void editTicketDetails(int t, List<Ticket> ticketList) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		while(true) {
			System.out.println("Enter which field you need to edit.\n1. Passenger name \n2. Source \n3.Destination \n4. Price \n5.Exit editing");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Enter the new passenger name: ");
				String newname=sc.next();
				ticketList.get(t).setPassengerName(newname);
				break;
			case 2:
				System.out.print("Enter the new Source station name: ");
				String newSource=sc.next();
				ticketList.get(t).setSource(newSource);
				break;
			case 3:
				System.out.print("Enter the new destination station name: ");
				String newDestination=sc.next();
				ticketList.get(t).setDestination(newDestination);
				break;
			case 4:
				System.out.print("Enter the new price: ");
				int newPrice=sc.nextInt();
				ticketList.get(t).setPrice(newPrice);
				break;
			case 5:
				return;
			}
		}
	}
	
	
	public void showAdminPage() {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. Display details");
			System.out.println("2. View All tickets");
			System.out.println("3. Edit a ticket");
			System.out.println("4. Exit");
			System.out.print("Enter you choice: ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				displayDetails();
				break;
			case 2:
				viewAllTickets();
				break;
			case 3:
				System.out.print("Enter ticket Id to edit the details: ");
				int ticketId=sc.nextInt();
				editTicketDetails((ticketId-1), Ticket.ticketList);
				break;
			case 4:
				return;
			}
			
		}
	}
}
