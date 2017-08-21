package br.udesc.ceavi.personagens;

import javax.swing.JOptionPane;

public class Personagens {
	// atributos
	public int gold;
	public int armadura;
	public int xp = 0;
	public int forca = 20;
	public int vida = 50;
	public int pocoes = 0;
	public int uPocoes = 0;
	public int mascote = 0;
	public int revive=0;

	public Personagens(String nome) {
		if (nome.equals("mario")) {
			forca = 55;
			vida = 350;
			pocoes = 5; // MARIO \\
			xp = 0;
			gold = 0;
			armadura = 0;
		}
		if (nome.equals("arqueiro")) {
			forca = 40;
			vida = 200;
			pocoes = 5; // ARQUEIRO \\
			xp = 0;
			gold = 0;
			armadura = 0;
		}
		if (nome.equals("bruxo")) {
			forca = 60;
			vida = 250;
			pocoes = 10; // BRUXO \\
			xp = 0;
			gold = 0;
			armadura = 0;
		}
		if (nome.equals("mago")) {
			forca = 60;
			vida = 230;
			pocoes = 10; // MAGO \\
			xp = 0;
			gold = 0;
			armadura = 0;
		}
		if (nome.equals("vitoria")) {
			forca = 30000;
			vida = 6000;
			pocoes = 30; // Vitória \\
			xp = 0;
			gold = 0;
			armadura = 30;
			JOptionPane.showMessageDialog(null, "Você escolheu uma classe especial!");
		}
	}
}
