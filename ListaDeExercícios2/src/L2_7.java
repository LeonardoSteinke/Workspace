import java.util.Scanner;

public class L2_7 {

	private static Scanner ler;

	public static void main(String[] args) {
		int n1, n2, n3;
		int maiornumero, numerodomeio, menornumero;
		ler = new Scanner(System.in);
		// 7. Faça um Programa que leia três números inteiros e os imprima em ordem decrescente.
		System.out.println("Digite 4 números inteiros e descubra qual a ordem decrescente");
		System.out.print("Digite o primeiro número: ");
		n1 = ler.nextInt();
		System.out.print("Digite o segundo número: ");
		n2 = ler.nextInt();
		System.out.print("Digite o terceiro número: ");
		n3 = ler.nextInt();
		maiornumero = n1;
		menornumero = n1;
		numerodomeio = n1;
		if(n2 > maiornumero) {
			maiornumero = n2;
		}
		if(n3 > maiornumero) {
			maiornumero = n3;
		}
		if(n2 < menornumero) {
			menornumero = n2;
		}
		if(n3 < menornumero) {
			menornumero = n3;
		}
		if(n2 < maiornumero && n2 >= menornumero) {
			numerodomeio = n2;
		}
		if(n3 < maiornumero && n3 >= menornumero) {
			numerodomeio = n3;
		}

		System.out.println("Ordem decrescente: " + maiornumero + ", " + numerodomeio + " e " + menornumero);
	}
}
