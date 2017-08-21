package exercicios;

import java.util.Scanner;

public class E4 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		char vogais[] = {'a', 'e', 'i', 'o', 'u'};
		char letras[] = new char[10];
		for (int i = 0; i < letras.length; i++) {
			int j = i + 1;
			System.out.print("Digite a " + j + "ª letra: ");
			letras[i] = sc.next().charAt(0);
		}
		for (int i = 0; i < 10; i++) {
			for (int x = 0; x < 5; x++) {
				if (letras[i] != vogais[x]) {
					System.out.print(letras[i] + " ");
				}
			}
		}
	}
}