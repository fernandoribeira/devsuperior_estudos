package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;
import model.enums.Color;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		int n;
		List<Shape> shapes = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			char type;
			Color color;
			
			System.out.println("Shape #" + (i + 1) + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			type = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			color = Color.valueOf(sc.next());
			
			if (type == 'r') {
				double width;
				double height;
				System.out.print("Width: ");
				width = sc.nextDouble();
				System.out.print("Height: ");
				height = sc.nextDouble();
				shapes.add(new Rectangle(color, width, height));
			} else {
				double radius;
				System.out.print("Radius: ");
				radius = sc.nextDouble();
				shapes.add(new Circle(color, radius));
			}
			
		}
		
		System.out.println();
		
		System.out.println("SHAPE AREAS:");
		
		for (Shape shape : shapes) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();
		
	}
}
