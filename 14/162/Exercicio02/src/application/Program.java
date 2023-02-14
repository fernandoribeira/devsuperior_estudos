package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.ImportedProduct;
import model.entities.Product;
import model.entities.UsedProduct;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<>();
		int n;
		
		System.out.print("Enter the number of products: ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			char type;
			String name;
			double price;
			
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Price: ");
			price = sc.nextDouble();
			
			if (type == 'c') {
				products.add(new Product(name, price));
			} else if (type == 'u') {
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate date;
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				date = LocalDate.parse(sc.next(), dtf);
				products.add(new UsedProduct(name, price, date));
			} else {
				double fee;
				System.out.print("Customs fee: ");
				fee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, fee));
			}
			
		}
		
		System.out.println();
		
		System.out.println("PRICE TAGS:");
		for (Product product : products) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
		
	}
}
