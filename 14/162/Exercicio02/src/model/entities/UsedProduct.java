package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {

	private LocalDate manufactureDate;

	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		StringBuilder sb = new StringBuilder();
		sb.append(getName());
		sb.append(" (used) $ ");
		sb.append(String.format("%.2f", getPrice()));
		sb.append(" (Manufacture date: ");
		sb.append(dtf.format(manufactureDate));
		sb.append(")");
		return sb.toString();
	}
	
}
