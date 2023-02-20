package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.Product;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();
		String path;
		
		// Leitura
		path = "C:\\Temp\\in\\source.csv";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {		
			String line = br.readLine();
			while (line != null) {
				String[] productData = line.split(",");
				String name = productData[0];
				double price = Double.parseDouble(productData[1]);
				int quantity = Integer.parseInt(productData[2]);
				list.add(new Product(name, price, quantity));
				line = br.readLine();
			}	
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		// Gravação
		path = "C:\\Temp\\out\\sumary.csv";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {		
			for (Product product : list) {
				String line = product.getName() + "," + product.total();
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}
}
