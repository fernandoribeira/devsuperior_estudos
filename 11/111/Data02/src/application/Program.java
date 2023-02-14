package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
	public static void main(String[] args) {

		DateTimeFormatter dtf01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf02 = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
		DateTimeFormatter dtf03 = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault());
		
		LocalDate d01 = LocalDate.parse("2024-07-24");
		LocalDateTime d02 = LocalDateTime.parse("2024-07-24T01:36:24");
		Instant d03 = Instant.parse("2024-07-24T01:36:24Z");
		
		System.out.println("d01 = " + d01.format(dtf01));
		System.out.println("d02 = " + d02.format(dtf02));
		System.out.println("d03 = " + dtf03.format(d03));
		
	}
}
