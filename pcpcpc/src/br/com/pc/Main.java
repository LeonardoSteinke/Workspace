package br.com.pc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		A oA = new A();
		B oB = new B();
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas instruções?");
		int tamanho = sc.nextInt();
                while (tamanho>256 || tamanho<0) {
                    System.out.println("Você digitou um número acima de 256 ou abaixo de 0, digite novamente: ");
                    tamanho= sc.nextInt();
                
            }
		int vetor[] = new int[tamanho + 11];
		for (int i = 0; i < vetor.length - 11; i++) {
			System.out.print("Instrução " + (i + 1) + ":");
			vetor[i] = sc.nextInt();
			if (vetor[i] > 127 || vetor[i] < -128) {
				System.out.println("Não pode ser maior que 127 ou menor que -128");
				sc.close();
				System.exit(0);
			}
		}
		if (vetor[0] == 27) {
			oB.b27 = 0;
		}
		for (int i = 0; i < vetor.length - 11; i++) {
			Flags oFlags = new Flags(vetor[i], oB);
			Grafico oGrafico = new Grafico(vetor, oA, oB, oFlags, i, vetor[i]);
			ULA oULA = new ULA(vetor[i], oA, oB, vetor[i + 1], i, vetor);
			System.out.println("Digite qualquer número para o avançar");
			int contador = sc.nextInt();

			if (i == vetor.length - 12) {
				i++;
				System.out.println("Fim. :)");
			}
		}
		sc.close();
	}
}
