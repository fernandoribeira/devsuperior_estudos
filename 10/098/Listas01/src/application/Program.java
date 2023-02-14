package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Xuxu");
		list.add("Minhoca");
		list.add("Gabriel");
		list.add("Anna");
		list.add("Maria");
		list.add("Bob");
		list.add("Minhoca");
		
		// Mostrar lista inteira
		for (String name : list) {
			System.out.println(name);
		}
		
		// Mostrar item especifico da lista por posição
		System.out.println("--------------------------------------");
		System.out.println(list.get(2));
		
		// Pegar posição na lista a primeira e ultima aparição
		System.out.println("--------------------------------------");
		System.out.println(list.indexOf("Minhoca"));
		System.out.println(list.lastIndexOf("Minhoca"));
	
		// Adicionar no final da lista
		System.out.println("--------------------------------------");
		list.add("Marco");
		mostraLista(list);
		
		// Adicionar em posição escolhida da lista
		System.out.println("--------------------------------------");
		list.add(1, "Aurelio");
		mostraLista(list);
		
		// Mostrar tamanho da lista
		System.out.println("--------------------------------------");
		System.out.println(list.size());
		
		// Remover da lista por posição
		System.out.println("--------------------------------------");
		list.remove(3);
		mostraLista(list);
		
		// Remover da lista por descrição
		System.out.println("--------------------------------------");
		list.remove("Bob");
		mostraLista(list);
		
	}
	public static void mostraLista(List<String> list) {
		for (String name : list) {
			System.out.println(name);
		}
	}
}
