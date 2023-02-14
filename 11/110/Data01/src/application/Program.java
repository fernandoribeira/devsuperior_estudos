package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
	public static void main(String[] args) {
		
		// Declaração de data com horário atual
		
		// Data local
		LocalDate d01 = LocalDate.now();
		System.out.println("d01 = " + d01);
		
		// Data e hora local
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("d02 = " + d02);
		
		// Data e hora global
		Instant d03 = Instant.now();
		System.out.println("d03 = " + d03);
		
		// Declaração de data com horário manual

		// Data local
		LocalDate d04 = LocalDate.of(2023, 3, 10);
		System.out.println("d04 = " + d04);
		
		// Data e hora local
		LocalDateTime d05 = LocalDateTime.of(2023, 3, 10, 11, 50);
		System.out.println("d05 = " + d05);
		
		// Data e hora local
		Instant d005 = Instant.ofEpochSecond(1678449000);
		System.out.println("d005 = " + d005);
		
		// Convertendo texto de data padrão
		
		// Data local
		LocalDate d06 = LocalDate.parse("2024-08-25");
		System.out.println("d06 = " + d06);
		
		// Data e hora local
		LocalDateTime d07 = LocalDateTime.parse("2024-07-24T01:36:24");
		System.out.println("d07 = " + d07);
		
		// Date e hora global
		Instant d08 = Instant.parse("2024-07-24T01:36:24Z");
		System.out.println("d08 = " + d08);
		
		// Convertendo texto de data não padrão (formatador)
		
		// Data local
		DateTimeFormatter dtf09 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d09 = LocalDate.parse("10/03/1979", dtf09);
		System.out.println("d09 = " + d09);
		
		// Data e hora local
		DateTimeFormatter dtf10 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime d10 = LocalDateTime.parse("10/03/1979 11:55:47", dtf10);
		System.out.println("d10 = " + d10);

		// Invertido
		DateTimeFormatter dtf11 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d11 = LocalDate.parse("2024-08-25");
		System.out.println("d11 normal = " + d11.format(dtf11));
		System.out.println("d11 invertido = " + dtf11.format(d11));
		
	}
}
