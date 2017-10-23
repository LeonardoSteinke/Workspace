package br.udesc.ceavi.main;

import javax.swing.JOptionPane;

import br.udesc.ceavi.personagens.*;

public class Batalha {
	public static int[] batalhaSolo(int mascote, int vida, int forca, int p, int up, int armadura, int vidaIni,
			int forcaIni, String nomeIni) {
		int dado;
		while (vidaIni > 0 || vida > 0) {
			dado = 0;
			String ataque = JOptionPane.showInputDialog("Batalha contra " + nomeIni
					+ "\n 1)Ataque Básico\n 2)Ataque Especial\n 3)Usar poção de cura (" + p
					+ " restantes)\n 4)Usar Ultra Poção de cura (" + up + " restantes)\nSeus pontos de vida: " + vida);
			if (ataque.equals("1")) {
				dado = (int) ((Math.random() * forca));
			}
			if (ataque.equals("2")) {
				dado = (int) ((Math.random() * (forca + (forca / 3))));
			}
			if (ataque.equals("3")) {
				if (p > 0) {
					p -= 1;
					vida += 50;
					JOptionPane.showMessageDialog(null, "Batalha\nSeus pontos de vida: " + vida);
				}
				if (p == 0) {
					continue;
				}
				if (ataque.equals("4")) {
					if (up > 0) {
						up -= 1;
						vida += 200;
						JOptionPane.showMessageDialog(null, "Batalha\nSeus pontos de vida: " + vida);
					}
					if (up == 0) {
						continue;
					}
				}
			}
			if (mascote > 0) {
				vidaIni -= mascote;
			}
			vidaIni -= dado;
			JOptionPane.showMessageDialog(null,
					"Batalha\nVocê deu " + dado + " de dano no inimigo, agora ele tem " + vidaIni + " pontos de vida");
			if (vidaIni > 0) {
				dado = (int) ((Math.random() * forcaIni - armadura));
				if (dado < 0) {
					JOptionPane.showMessageDialog(null, "Você defendeu o ataque");
				} else {
					vida -= dado;
					JOptionPane.showMessageDialog(null,
							"Batalha\nO inimigo tirou " + dado + " pontos de vida de você, agora você tem: " + vida);
				}
			}
			if (vida <= 0 || vidaIni <= 0)
				break;
		}
		if (vida <= 0) {
			JOptionPane.showMessageDialog(null, "Você Perdeu");
			int[] resultado = { 0, p, up };
			return resultado;
		} else {
			int gold = (int) (Math.random() * 100);
			JOptionPane.showMessageDialog(null,
					"Vitória!!!\nVocê ganhou " + gold + " de ouro\nSua vida foi restaurada.");
			int[] resultado = { gold + 1, p, up };
			return resultado;
		}
	}

	public Batalha(String Classe, Personagens oPersona, int monstro, int forcaini, int xpini, String nomeIni) {
		int resultado[] = batalhaSolo(oPersona.mascote, oPersona.vida, oPersona.forca, oPersona.pocoes,
				oPersona.uPocoes, oPersona.armadura, monstro, forcaini, nomeIni);
		for (int i = 0; i < resultado.length; i++) {
			if (i == 0) {
				oPersona.gold += resultado[i];
			}
			if (i == 1) {
				oPersona.pocoes = resultado[i];
			}
			if (i == 2) {
				oPersona.uPocoes = resultado[i];
			}
		}
		if (resultado[0] > 0) {
			oPersona.xp += xpini;
			JOptionPane.showMessageDialog(null, "Você ganhou: " + resultado[0] + " de Ouro e " + xpini
					+ " de experiencia\nVocê tem agora:\nGold:" + oPersona.gold + "\nXp: " + oPersona.xp);
		} else {
			String derrota = JOptionPane.showInputDialog(null,
					"Você Perdeu!\n1)Reviver? (" + oPersona.revive + " revives)\n2)Fim de jogo");
			if (derrota.equals("1")) {
				if (oPersona.revive > 0) {
					oPersona.revive -= 1;
				} else {
					JOptionPane.showMessageDialog(null, "Você não possui revive");
					JOptionPane.showMessageDialog(null, "Game Over.");
					System.exit(0);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Game Over.");
				System.exit(0);
			}
			JOptionPane.showMessageDialog(null, "Você não ganhou nenhum bônus e fugiu da batalha\nVocê tem:\nGold:"
					+ oPersona.gold + "\nXp: " + oPersona.xp);
		}
	}
}