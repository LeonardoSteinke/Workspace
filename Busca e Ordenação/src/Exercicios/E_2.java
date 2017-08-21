package Exercicios;

import java.util.Scanner;

public class E_2 {
	public static String Ordenar(String a) {
		char[] ordenar = a.toLowerCase().toCharArray();
		for (int i = ordenar.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (ordenar[j] > ordenar[j + 1]) {
					char aux = ordenar[j];
					ordenar[j] = ordenar[j + 1];
					ordenar[j + 1] = aux;
				}
			}
		}
		String ordenado = "";
		for (int i = 0; i < ordenar.length; i++) {
			ordenado += ordenar[i];
		}
		return ordenado;		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String vetor[] = new String[10];
		String vetor2[] = new String[10];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextLine();
			vetor2[i] = vetor[i];
		}
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Ordenar(vetor[i]);
		}
		String certo = "";
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length && j != i; j++) {
				if (vetor[i].equals(vetor[j])) {
					certo += vetor2[i] + " " + vetor2[j] + " ";
				}
			}
		}
		System.out.println(certo);
		sc.close();
	}
}
