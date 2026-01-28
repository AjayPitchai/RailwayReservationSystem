package com.ajay;

import java.util.Scanner;

public class TicketBooking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*******Welcome to Railway Reservation system*********");
		while(true) {
			System.out.println("1. Show Available Trains");
			System.out.println("2. Show All booked tickets");
			System.out.println("3. Book Ticket");
			System.out.println("4. Exit");
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
					Train t = new Train();
					t.showAllTrains();
					break;
					
				case 2:
					break;
				case 3:
					break;
				case 4:
					System.out.println("SEE YOU AGAIN!! BYE");
					return;
			}
		}
		
	}
}
