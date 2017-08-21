package exercicios;

import java.util.Scanner;

public class E2 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		double numerosReais[] = new double[10];
		for (int i = 0; i < numerosReais.length; i++) {
			int j = i+1;
			System.out.print("Digite o "+ j + "º número: ");
			numerosReais[i] = sc.nextDouble();
		}
		for (int i = 9; i >= 0; i--) {
			System.out.print(numerosReais[i] + " ");
		}
		sc.close();
	}
}
