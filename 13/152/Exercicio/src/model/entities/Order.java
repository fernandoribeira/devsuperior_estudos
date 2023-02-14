package model.entities;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import model.enums.OrderStatus;

public class Order {

	private Instant moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> items;
	
	public Order(Instant moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
		this.items = new ArrayList<>();
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItems(OrderItem ordemItem) {
		items.add(ordemItem);
	}
	
	public void removeItems(OrderItem ordemItem) {
		items.remove(ordemItem);
	}
	
	public double total() {
		double total = 0.0;
		for (OrderItem orderItem : items) {
			total += orderItem.subTotal();
		}
		return total;
	}

	@Override
	public String toString() {
		DateTimeFormatter dtfMoment = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + dtfMoment.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client + "\n");
		sb.append("Order items:\n");
		for (OrderItem orderItem : items) {
			sb.append(orderItem);
		}
		sb.append("Total price: $" + String.format("%.2f", total()) + "\n");
		
		return sb.toString();
	}
	
}
