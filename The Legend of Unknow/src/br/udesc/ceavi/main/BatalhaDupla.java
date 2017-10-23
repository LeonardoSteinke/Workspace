package br.udesc.ceavi.main;

import javax.swing.JOptionPane;

import br.udesc.ceavi.personagens.Personagens;

public class BatalhaDupla {
	public static int[] batalhaDupla(int mascote, int vida, int forca, int p, int up, int armadura, int vidaIni,
			int forcaIni, int vidaIni2, int forcaIni2, String nomeIni) {
		int dado;
		String qual = "";
		while (vidaIni > 0 || vida > 0) {
			dado = 0;
			if (vidaIni > 0 && vidaIni2 > 0) {
				qual = JOptionPane.showInputDialog("Batalha Dupla\nSua vida: " + vida + "\nAtacar " + nomeIni + " 1 ("
						+ vidaIni + " pontos de vida restante)\nAtacar " + nomeIni + " 2 (" + vidaIni2
						+ " pontos de vida restantes)");
			}
			if (vidaIni <= 0 && vidaIni2 > 0) {
				qual = JOptionPane.showInputDialog(
						"Batalha Dupla\nSua vida: " + vida + "\nAtacar monstro 1 (Defendido)\nAtacar monstro 2 ("
								+ vidaIni2 + " pontos de vida restantes)");
			}
			if (vidaIni > 0 && vidaIni2 <= 0) {
				qual = JOptionPane.showInputDialog("Batalha Dupla\nSua vida: " + vida + "\nAtacar monstro 1 (" + vidaIni
						+ " pontos de vida restante)\nAtacar monstro 2 (Defendido)");
			}
			String ataque = JOptionPane
					.showInputDialog("Batalha Dupla\n 1)Ataque Básico\n 2)Ataque Especial\n 3)Usar poção de cura (" + p
							+ " restantes)\n 4)Usar Ultra Poção de cura (" + up + " restantes)");
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
			if (qual.equals("1")) {
				if (vidaIni <= 0) {
					JOptionPane.showMessageDialog(null, "Você não pode atacar esse inimigo");
					continue;
				} else {
					vidaIni -= mascote;
					vidaIni -= dado;
					JOptionPane.showMessageDialog(null, "Batalha\nVocê deu " + dado
							+ " de dano no inimigo, agora ele tem " + vidaIni + " pontos de vida");
				}
			}
			if (qual.equals("2")) {
				if (vidaIni2 <= 0) {
					JOptionPane.showMessageDialog(null, "Você não pode atacar esse inimigo");
					continue;
				} else {
					vidaIni2 -= mascote;
					vidaIni2 -= dado;
					JOptionPane.showMessageDialog(null, "Batalha\nVocê deu " + dado
							+ " de dano no inimigo, agora ele tem " + vidaIni2 + " pontos de vida");
				}
			}

			if (vidaIni > 0 || vidaIni2 > 0) {
				if (vidaIni > 0) {
					dado = (int) (((Math.random() * forcaIni) - armadura));
					if (dado < 0) {
						JOptionPane.showMessageDialog(null, "Você defendeu o ataque");
					} else {
						vida -= dado;
						JOptionPane.showMessageDialog(null, "Batalha\nO inimigo tirou " + dado
								+ " pontos de vida de você, agora você tem: " + vida);
					}
				}
				if (vidaIni2 > 0) {
					dado = (int) (((Math.random() * forcaIni) - armadura));
					if (dado < 0) {
						JOptionPane.showMessageDialog(null, "Você defendeu o ataque");
					} else {
						vida -= dado;
						JOptionPane.showMessageDialog(null, "Batalha\nO inimigo tirou " + dado
								+ " pontos de vida de você, agora você tem: " + vida);
					}
				}
			}
			if (vida <= 0 || (vidaIni <= 0 && vidaIni2 <= 0)) {
				break;
			}
		}
		if (vida <= 0) {
			int[] retorno = { 0, p, up };
			return retorno;
		} else {
			int gold = (int) (Math.random() * 100 * 2);
			JOptionPane.showMessageDialog(null,
					"Vitória!!!\nVocê ganhou " + gold + " de ouro\nSua vida foi restaurada.");
			int[] retorno = { gold + 1, p, up };
			return retorno;
		}
	}

	public BatalhaDupla(String Classe, Personagens oPersona, int monstro, int forcaini, int xpini, int monstro2,
			int forcaini2, int xpini2, String nomeIni) {
		int resultado[] = batalhaDupla(oPersona.mascote, oPersona.vida, oPersona.forca, oPersona.pocoes,
				oPersona.uPocoes, oPersona.armadura, monstro, forcaini, monstro2, forcaini2, nomeIni);
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
			oPersona.xp += xpini + xpini2;
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
