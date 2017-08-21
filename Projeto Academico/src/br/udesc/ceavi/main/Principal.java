package br.udesc.ceavi.main;

import javax.swing.JOptionPane;
import br.udesc.ceavi.historia.Historia;
import br.udesc.ceavi.personagens.*;

public class Principal {

	public static void main(String[] args) {
		int monstro = 0;
		int forcaini = 0;
		int xpini = 0;
		int monstro2 = 0;
		int forcaini2 = 0;
		int xpini2 = 0;
		int boss = 0;
		int forcaBoss = 0;
		int xpBoss = 0;
		String nomeIni = "";
		Historia oHistoria = new Historia();
		String nomePersona = JOptionPane.showInputDialog(oHistoria.cp1);
		JOptionPane.showMessageDialog(null, oHistoria.cp2 + nomePersona + oHistoria.cp3);
		String Classe = JOptionPane.showInputDialog(oHistoria.cp4).toLowerCase();
		Personagens oPersona = new Personagens(Classe);
		JOptionPane.showMessageDialog(null, oHistoria.cp5);

		JOptionPane.showMessageDialog(null, "		Ato 1\n\nCeavi, 9h30...");

		JOptionPane.showMessageDialog(null, oHistoria.a1p1);
		JOptionPane.showMessageDialog(null, oHistoria.a1p2);
		JOptionPane.showMessageDialog(null, oHistoria.a1p3);
		JOptionPane.showMessageDialog(null, oHistoria.a1p4 + nomePersona + oHistoria.a1p5);
		JOptionPane.showMessageDialog(null, nomePersona + oHistoria.a1p6);
		JOptionPane.showMessageDialog(null, oHistoria.a1p7);
		JOptionPane.showMessageDialog(null, nomePersona + oHistoria.a1p8);
		JOptionPane.showMessageDialog(null, oHistoria.a1p9);
		JOptionPane.showMessageDialog(null, oHistoria.a1p10);
		JOptionPane.showMessageDialog(null, oHistoria.a1p11 + nomePersona);
		JOptionPane.showMessageDialog(null, nomePersona + oHistoria.a1p12);
		JOptionPane.showMessageDialog(null, nomePersona + " pega seus equipamentos e sai de casa...");
		JOptionPane.showMessageDialog(null,
				"No caminho do castelo " + nomePersona
						+ " encontra um rato de tamanho anormal vindo em sua direção...\n" + nomePersona
						+ " saca sua adaga e se prepara para o combate");

		monstro = 100;
		forcaini = 50;
		xpini = 30;
		nomeIni = "Ratazana Gigante";
		Batalha oBS = new Batalha(Classe, oPersona, monstro, forcaini, xpini, nomeIni);

		// BatalhaDupla oBD = new BatalhaDupla(Classe, oPersona, monstro,
		// forcaini, xpini, monstro2, forcaini2, xpini2, nomeIni);
	}
}
