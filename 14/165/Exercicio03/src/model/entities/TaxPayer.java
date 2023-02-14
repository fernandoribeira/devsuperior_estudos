package model.entities;

public abstract class TaxPayer {

	protected String name;
	protected Double anualIncome;
	
	public TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public String taxesDisplay() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(": $ ");
		sb.append(String.format("%.2f", taxesPaid()));
		return sb.toString(); 
	}
	
	public abstract double taxesPaid();
	
}
