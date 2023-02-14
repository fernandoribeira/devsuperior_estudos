package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {
	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		int roomNumber;
		LocalDate checkin;
		LocalDate checkout;
		Reservation reservation;
		
		System.out.print("Room number: ");
		roomNumber = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		checkin = LocalDate.parse(sc.next(), dtf);
		System.out.print("Check-out date (dd/MM/yyyy): ");
		checkout = LocalDate.parse(sc.next(), dtf);
		
		if (!checkin.isAfter(LocalDate.now())) {
			System.out.println("Error in reservation: Check-in date must be after today");
		} else if (!checkout.isAfter(checkin)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		} else {
			reservation = new Reservation(roomNumber, checkin, checkout);
			System.out.println(reservation);
			
			System.out.println();
			
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkin = LocalDate.parse(sc.next(), dtf);
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkout = LocalDate.parse(sc.next(), dtf);
			
			String error = reservation.updateDates(checkin, checkout);
			if (error != null) {
				System.out.println("Error in reservation: " + error);
			} else {
				System.out.println(reservation);
			}
		}
		
		sc.close();
		
	}
}
