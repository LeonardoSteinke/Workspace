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
		String escolha = "";
		String escolha2 = "";
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
		nomeIni = "Ratazana";
		Batalha oBS = new Batalha(Classe, oPersona, monstro, forcaini, xpini, nomeIni);

		// BatalhaDupla oBD = new BatalhaDupla(Classe, oPersona, monstro,
		// forcaini, xpini, monstro2, forcaini2, xpini2, nomeIni);
		JOptionPane.showMessageDialog(null, "Após batalha, " + nomePersona + " Seguiu em direção ao reino de Ceavi.");
		while (escolha.equals(0)) {
			break;
		}
		escolha = JOptionPane.showInputDialog(nomePersona
				+ " chega no reino de ceavi.\nO que você vai vai fazer?\n1: Loja\n2: Passear pela cidade\n3: Seguir em direção ao castelo central");
		while (escolha.equals(1)) {
			escolha2 = JOptionPane.showInputDialog(
					"Bem vindo à loja real, o que vc deseja comprar?\n1: Armadura +20def 10 gold\n2: Escudo +25def 10gold\n3: Espada +15atk 15 gold\n0: Sair");
			if (escolha2.equals(1) && oPersona.gold > 10) {
				oPersona.armadura += 10;
				oPersona.gold -= 10;
			} else{
				JOptionPane.showConfirmDialog(null, "Você não possui dinheiro suficiente");
			}
			if (escolha2.equals(2)&& oPersona.gold > 10) {
				oPersona.armadura += 25;
				oPersona.gold -= 10;
			} else {
				JOptionPane.showConfirmDialog(null, "Você não possui dinheiro suficiente");
			}
			if (escolha2.equals(3)&& oPersona.gold > 10) {
				oPersona.forca += 15;
				oPersona.gold -= 15;
			} else {
				JOptionPane.showConfirmDialog(null, "Você não possui dinheiro suficiente");
			}
			if (escolha2.equals(0)) {
				escolha = "";
				escolha2 = "";		
				break;
			}
		}
	}

}
