package br.udesc.ceavi.main;

public class Interface {
	public interface Ciclista Extends Pessoa {
		public void pedala(int km);
	}
	class Triatleta extends Atleta implements Ciclista{
		
	}
}
