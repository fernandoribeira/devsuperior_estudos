package model.entities;

public class IndividualTaxPayer extends TaxPayer {

	protected Double healthExpenditures;

	public IndividualTaxPayer(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double taxesPaid() {
		double taxes;
		if (anualIncome < 20000.00) {
			taxes = anualIncome * 0.15;
		} else {
			taxes = anualIncome * 0.25;
		}
		if (healthExpenditures > 0.00) {
			taxes -= healthExpenditures / 2.00; 
		}
		return taxes;
	}
	
}
