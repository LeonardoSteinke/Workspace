import java.util.Scanner;

public class L2_6 {

	private static Scanner ler;

	public static void main(String[] args) {
		int n1;
		int n2;
		int n3;
		int n4;
		int maiorvalor = 0;
		int menorvalor = 999999999;
		ler = new Scanner(System.in);
		// 6. Escreva um programa que leia pelo teclado quatro números inteiros e imprima o maior e o menor valor.
		System.out.println("Digite 4 números inteiros e descubra qual o menor e o maior");
		System.out.print("Digite o primeiro número: ");
		n1 = ler.nextInt();
		System.out.print("Digite o segundo número: ");
		n2 = ler.nextInt();
		System.out.print("Digite o terceiro número: ");
		n3 = ler.nextInt();
		System.out.print("Digite o quarto número: ");
		n4 = ler.nextInt();
		if(n1 > maiorvalor) {
			maiorvalor = n1;
		}
		 if (n1 < menorvalor) {
			menorvalor = n1;
		}
		if(n2 > maiorvalor) {
			maiorvalor = n2;
		}
		if (n2 < menorvalor) {
			menorvalor = n2;
		}
		if(n3 > maiorvalor) {
			maiorvalor = n3;
		}
		if (n3 < menorvalor) {
			menorvalor = n3;
		}
		if(n4 > maiorvalor) {
			maiorvalor = n4;
		}
		if (n4 < menorvalor) {
			menorvalor = n4;
		}
		
		System.out.println("O maior número é: " + maiorvalor);
		System.out.println("O menor número é: " + menorvalor);
	}
}
