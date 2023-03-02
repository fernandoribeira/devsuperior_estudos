package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

	private Integer number;
	private LocalDate date;
	private Double totalValue;
	private List<Installment> installments;
	
	public Contract(Integer number, LocalDate date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		this.installments = new ArrayList<Installment>();
	}

	public LocalDate getDate() {
		return date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

	public void addInstallments(Installment installment) {
		installments.add(installment);
	}
	
}
