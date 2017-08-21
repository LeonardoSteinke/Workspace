package Exercicios;

import java.util.Scanner;

public class E_1 {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Escreva 2 palavras e descubra se são anagramas");
		System.out.print("Primeira palavra: ");
		char oi[] = sc.nextLine().toLowerCase().toCharArray();
		System.out.print("Segunda palavra: ");
		char ola[] = sc.nextLine().toLowerCase().toCharArray();
		for (int i = ola.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (ola[j] > ola[j + 1]) {
					char aux = ola[j];
					ola[j] = ola[j + 1];
					ola[j + 1] = aux;
				}
			}
		}
		for (int i = oi.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (oi[j] > oi[j + 1]) {
					char aux = oi[j];
					oi[j] = oi[j + 1];
					oi[j + 1] = aux;
				}
			}
		}
		int sim = 0;
		try {
			sim = 0;
			for (int i = 0; i < ola.length; i++) {
				if (oi[i] == ola[i]) {
					sim ++;
				}
			}
		} catch (Exception e) {
			sim = 0;
			for (int i = 0; i < oi.length; i++) {
				if (oi[i] == ola[i]) {
					sim ++;
				}
			}
		}
		if (sim == ola.length) {
			System.out.println("São anagramas");
		} else {
			System.out.println("Não são anagramas");
		}
		sc.close();
	}
}
