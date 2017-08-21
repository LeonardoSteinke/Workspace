package br.udesc.ceavi.main;

public class Carro {
	//atributos
	protected double velocidade;
	protected String cor;
	private int numPortas;

	//metodos
		public void setNumPortas(int numPortas){
		this.numPortas = numPortas;
	}
		public void setCor(String cor){
		this.cor = cor;
	}
	//Construtor
		public Carro(String cor, int numPortas){
		this.cor = cor;
		this.numPortas = numPortas;
	}	
	public Carro() {}
	// metodo sem parametros
	
	public void ligarMotor(){
		System.out.println("Vrummmm...");
	}
	public void desligarMotor(){
		System.out.println("Motor desligado.");
	}
	public void buzina(){
		System.out.println("FARAH");
	}
	public void acelerar(double kmh) {
		this.velocidade = kmh;
	}
}
