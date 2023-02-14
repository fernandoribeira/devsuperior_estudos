package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Client;
import model.entities.Order;
import model.entities.OrderItem;
import model.entities.Product;
import model.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtfBirthDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String name;
		String email;
		LocalDate birthDate;
		Client client;
		OrderStatus orderStatus;
		Order order;
		int itemQuantity;
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Email: ");
		email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		birthDate = LocalDate.parse(sc.next(), dtfBirthDate);
		client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		orderStatus = OrderStatus.valueOf(sc.next());
		order = new Order(Instant.now(), orderStatus, client);
		
		System.out.print("How many items to this order? ");
		itemQuantity = sc.nextInt();
		
		for (int i = 0; i < itemQuantity; i++) {
			
			String productName;
			double productPrice;
			int productQuantity;
			Product product;
			OrderItem orderItem;
			
			System.out.println("Enter #" + (i + 1) + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			productName = sc.nextLine();
			System.out.print("Product price: ");
			productPrice = sc.nextDouble();
			product = new Product(productName, productPrice);
			System.out.print("Quantity: ");
			productQuantity = sc.nextInt();
			orderItem = new OrderItem(productQuantity, productPrice, product);
			order.addItems(orderItem);
			
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		sc.close();
		
	}
}
