package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Integer numero;
		LocalDate data;
		Double valorContrato;
		Contract contrato;
		Integer numeroParcelas;
		ContractService servicoContrato;
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		data = LocalDate.parse(sc.next(), dtf);
		System.out.print("Valor do contrato: ");
		valorContrato = sc.nextDouble();
		
		contrato = new Contract(numero, data, valorContrato);
		
		System.out.print("Entre com o numero de parcelas: ");
		numeroParcelas = sc.nextInt();
		
		servicoContrato = new ContractService(new PaypalService());
		servicoContrato.processContract(contrato, numeroParcelas);
		
		System.out.println("Parcelas:");
		contrato.getInstallments().forEach((installment) -> System.out.println(installment));
		
		sc.close();
		
	}
}
