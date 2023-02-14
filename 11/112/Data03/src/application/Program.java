package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {
	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate d04 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		LocalDate d05 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		LocalDateTime d06 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		LocalDateTime d07 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		
		System.out.println("d04 dia numero = " + d04.getDayOfMonth());
		System.out.println("d04 mes numero = " + d04.getMonthValue());
		System.out.println("d04 ano numero = " + d04.getYear());
		System.out.println("d04 dia do ano juliano = " + d04.getDayOfYear());
		System.out.println("d04 dia da semana texto = " + d04.getDayOfWeek());
		System.out.println("d04 mes texto = " + d04.getMonth());
		
		System.out.println("d02 hora = " + d02.getHour());
		System.out.println("d02 minuto = " + d02.getMinute());
		System.out.println("d02 segundo = " + d02.getSecond());
			
	}
}
