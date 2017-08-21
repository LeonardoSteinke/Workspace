package Exercicios;

import java.util.Scanner;

/*Implemente um programa para ler uma matriz bidimensional e 
imprimir a matriz transposta da matriz lida. 
A matriz transposta é dada pela troca de linhas por colunas.*/
public class E_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas linhas? ");
		int k = sc.nextInt();
		System.out.println("Quantas colunas? ");
		int l = sc.nextInt();
		int[][] matriz = new int[k][l];
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < l; j++) {
				System.out.print("Digite o " + (j + 1) + "º numero da " + (i + 1) + "ª linha: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matriz digitada: ");
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < l; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("Matriz transposta: ");
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(matriz[j][i] + "\t");
			}
			System.out.println();
		}
	}
}
