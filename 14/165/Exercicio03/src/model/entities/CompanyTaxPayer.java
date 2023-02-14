package model.entities;

public class CompanyTaxPayer extends TaxPayer {

	protected Integer numberOfEmployees;

	public CompanyTaxPayer(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public double taxesPaid() {
		double taxes;
		if (numberOfEmployees < 10) {
			taxes = anualIncome * 0.16;
		} else {
			taxes = anualIncome * 0.14;
		}
		return taxes;
	}
	
}
