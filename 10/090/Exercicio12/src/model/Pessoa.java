package model;

public class Pessoa {

	private double altura;
	private char genero;
	
	public Pessoa() {
	}
	
	public Pessoa(double altura, char genero) {
		this.altura = altura;
		this.genero = genero;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Pessoa [altura=" + altura + ", genero=" + genero + "]";
	}
	
}
