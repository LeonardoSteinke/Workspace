package Exercicios;

import java.util.Scanner;

public class E_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = 0;
		int l = 0;
		int o = 0;
		int p = 0;
		do {
		System.out.println("1ª Matriz: quantas linhas? ");
		k = sc.nextInt();
		System.out.println("1ª Matriz: quantas colunas? ");
		l = sc.nextInt();
		System.out.println("2ª Matriz: quantas linhas? ");
		o = sc.nextInt();
		System.out.println("2ª Matriz: quantas colunas? ");
		p = sc.nextInt();
		if (l != o) {
			System.out.println("Impossível multiplicar essas matrizes. \nTente novamente.");
		}
		} while (l != o);
		int[][] a = new int[k][l];
		int[][] b = new int[o][p];
		int[][] c = new int [l][o];
		System.out.println("Primeira matriz");
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < l; j++) {
				System.out.print("Digite o " + (j + 1) + "º numero da " + (i + 1) + "ª linha: ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Segunda matriz");
		for (int i = 0; i < o; i++) {
			for (int j = 0; j < p; j++) {
				System.out.print("Digite o " + (j + 1) + "º numero da " + (i + 1) + "ª linha: ");
				b[i][j] = sc.nextInt();
			}
		}
        for (int i = 0; i < l; i++) {
            System.out.println("");
            for (int j = 0; j < o; j++) {
                for (int x = 0; x < a[j][i]; x++) {
                    c[i][j] = a[i][x] * b[x][j];
                    System.out.print(c[i][j]);
                    System.out.print(" ");
                }
            }
        }
	}
}
