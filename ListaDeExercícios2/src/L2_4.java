import java.util.Scanner;

public class L2_4 {

	private static Scanner ler;

	public static void main(String[] args) {
		// Escreva um programa que leia pelo teclado dois valores inteiros e imprime o maior deles.
		int valor1;
		int valor2;
		ler = new Scanner(System.in);
		System.out.println("Descubra qual valor inteiro é maior");
		System.out.print("Digite o primeiro número: ");
		valor1 = ler.nextInt();
		System.out.print("Digite o segundo número: ");
		valor2 = ler.nextInt();
		if (valor1 > valor2) {
			System.out.println("O maior número é: " + valor1);
		} else {
			System.out.println("O maior número é: " + valor2);
		}
		
	}

}
