package br.udesc.ceavi.main;

public class Batmovel extends Carro {
	private int turbinas;
	private boolean missilAtivado;
	//construtor
	public Batmovel() {}
	public Batmovel(String cor, int numPortas){
		super(cor, numPortas); //chama o construtor de carro com args
	}
	public void ligarTurbinas() {
		this.turbinas = 2;
		System.out.println("TURBINA!!!!!!!!!!!!!");
	}

	public void ativarMissil() {
		this.missilAtivado = true;
		System.out.println("Pew, pew, pew");
		System.out.println(this.cor);
	}

	// método polimorfico
	public void acelerar(double kmh) {
		if (this.turbinas > 0) {
			this.velocidade = kmh * this.turbinas * 100;
		} else {
			this.velocidade = kmh;
		}
	}
}
