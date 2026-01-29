package com.ajay;

import java.util.Scanner;

public class ReserveTicket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*******Welcome to Railway Reservation system*********");
		while(true) {
			System.out.println("1. If You are Admin");
			System.out.println("2. If you are Passenger");
			System.out.println("3. Exit the Reservation system");
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
					System.out.print("Enter your name: ");
					String username=sc.next();
					System.out.print("Enter password: ");
					String pass=sc.next();
					if(username.equals("root") && pass.equals("pass1234")) {
						Admin ad=new Admin();
						ad.showAdminPage();
						break;
					}
					else {
						System.out.println("You are not admin. Exitinggg...");
						return;
					}
				case 2:
					Passenger p =new Passenger();
					p.showPassengerPage();
					break;
				case 3:
					System.out.println("SEE YOU AGAIN!! BYE");
					return;
			}
		}
		
	}
}
