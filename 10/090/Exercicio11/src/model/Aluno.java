package model;

public class Aluno {

	private String nome;
	private double primeiraNota;
	private double segundaNota;
	
	public Aluno() {
	}
	
	public Aluno(String nome, double primeiraNota, double segundaNota) {
		this.nome = nome;
		this.primeiraNota = primeiraNota;
		this.segundaNota = segundaNota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrimeiraNota() {
		return primeiraNota;
	}

	public void setPrimeiraNota(double primeiraNota) {
		this.primeiraNota = primeiraNota;
	}

	public double getSegundaNota() {
		return segundaNota;
	}

	public void setSegundaNota(double segundaNota) {
		this.segundaNota = segundaNota;
	}
	
	public double media() {
		return (primeiraNota + segundaNota) / 2.0;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", primeiraNota=" + primeiraNota + ", segundaNota=" + segundaNota + "]";
	}

}
