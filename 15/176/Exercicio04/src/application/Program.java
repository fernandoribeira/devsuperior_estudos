package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.ReservationException;

public class Program {
	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		int roomNumber;
		LocalDate checkin;
		LocalDate checkout;
		Reservation reservation;
		
		try {
			System.out.print("Room number: ");
			roomNumber = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkin = LocalDate.parse(sc.next(), dtf);
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkout = LocalDate.parse(sc.next(), dtf);
			reservation = new Reservation(roomNumber, checkin, checkout);
			System.out.println(reservation);
			
			System.out.println();
			
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkin = LocalDate.parse(sc.next(), dtf);
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkout = LocalDate.parse(sc.next(), dtf);
			reservation.updateDates(checkin, checkout);
			System.out.println(reservation);
			
			sc.close();
		} catch (InputMismatchException e) {
			System.out.println("Invalid room format!");
		} catch (DateTimeParseException e) {
			System.out.println("Invalid date format!");
		} catch (ReservationException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Inexpected error!");
		}

	}
}
