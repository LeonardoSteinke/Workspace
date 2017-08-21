package br.udesc.ceavi.main;

class Principal {

	public static void main(String[] args) {
		Carro oKombi = new Carro("Branco", 3);
		Carro oFusca = new Carro("Azul", 4);

		oFusca.ligarMotor();
		oKombi.ligarMotor();
		oKombi.buzina();
		Batmovel batMovel = new Batmovel("Preto", 2);
		batMovel.ativarMissil();
		batMovel.ligarTurbinas();

	}

}
