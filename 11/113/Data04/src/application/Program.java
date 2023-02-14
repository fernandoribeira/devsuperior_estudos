package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDate d02 = d01.minusDays(7);
		LocalDate d03 = d01.plusDays(7);
		LocalDate d04 = d01.plusMonths(7);
		LocalDate d05 = d01.plusYears(7);
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		
		System.out.println();
		
		LocalDateTime d06 = LocalDateTime.parse("2022-07-20T01:30:26");
		LocalDateTime d07 = d06.minusDays(7);
		LocalDateTime d08 = d06.plusDays(7);
		LocalDateTime d09 = d06.plusMonths(7);
		LocalDateTime d10 = d06.plusYears(7);
		LocalDateTime d11 = d06.plusHours(7);
		LocalDateTime d12 = d06.plusMinutes(7);
		LocalDateTime d13 = d06.plusSeconds(7);
		
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d10);
		System.out.println(d11);
		System.out.println(d12);
		System.out.println(d13);
		
		System.out.println();
		
		Instant d14 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d15 = d14.minus(7, ChronoUnit.DAYS);
		Instant d16 = d14.plus(7, ChronoUnit.DAYS);
		Instant d19 = d14.plus(7, ChronoUnit.HOURS);
		Instant d20 = d14.plus(7, ChronoUnit.MINUTES);
		Instant d21 = d14.plus(7, ChronoUnit.SECONDS);
		
		System.out.println(d14);
		System.out.println(d15);
		System.out.println(d16);
		System.out.println(d19);
		System.out.println(d20);
		System.out.println(d21);
		
		System.out.println();
		
		Instant nascimento = Instant.parse("1979-03-10T11:50:00Z");
		Instant hoje = Instant.now();
		Duration periodo = Duration.between(nascimento, hoje);
		System.out.println(periodo.toDays());
		System.out.println(periodo.toSeconds());
		System.out.println(periodo.toString());
		
		LocalDate ldmin = LocalDate.MIN;
		LocalDate ldmax = LocalDate.MAX;
		System.out.println(ldmin);
		System.out.println(ldmax);
		
	}
} 
