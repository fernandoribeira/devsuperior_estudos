import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int duracao = 0;
		
		if (horaFinal > horaInicial) {
			duracao = horaFinal - horaInicial;
		} else if (horaFinal < horaInicial) {
			duracao = (24 - horaInicial) + horaFinal;
		} else {
			duracao = 24;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
		
	}
}
