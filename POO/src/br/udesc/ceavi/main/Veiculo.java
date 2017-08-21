package br.udesc.ceavi.main;

abstract class Veiculo {
	abstract void abastecer();
}
class Carro extends Veiculo {
	void abastecer() {
		encherTanqueComGasolina();
	}
}
