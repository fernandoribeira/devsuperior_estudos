package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {

	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private Integer roomNumber;
	private LocalDate checkin;
	private LocalDate checkout;
	
	public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckin() {
		return checkin;
	}

	public LocalDate getCheckout() {
		return checkout;
	}

	public long duration() {
		return ChronoUnit.DAYS.between(checkin, checkout);
	}
	
	public void updateDates(LocalDate checkin, LocalDate checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Reservation: Room ");
		sb.append(roomNumber);
		sb.append(", check-in: ");
		sb.append(dtf.format(checkin));
		sb.append(", check-out: ");
		sb.append(dtf.format(checkout));
		sb.append(", ");
		sb.append(duration());
		sb.append(" nights");
		return sb.toString();
	}

}
