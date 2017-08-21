import java.util.Scanner;

public class L3_1 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int i = 0;
		int x = 0;
		/* 1) Números. Faça um programa que imprima na tela os números de 1 a 20, um abaixo do
		outro. Depois modifique o programa para que ele mostre os números um ao lado do outro*/
		System.out.println("Digite 1 para mostrar os numeros um abaixo do outro e 2 para mostrar um do lado do outro.");
		System.out.print("Digite um número: ");
		x = sc.nextInt();
		while (x == 1 || x == 2) {
		if (x == 1) {
		for (i = 1; i <= 20; i++) {
			System.out.println(i);			
		}
		System.out.print("Digite 1 numero: ");
			x = sc.nextInt();
	}
		if (x == 2) {	
			for (i = 1; i <= 18; i++) {
				System.out.print(i + ", ");
				if (i == 18) {
				System.out.println((i + 1) + " e " +( i + 2) + ".");
				System.out.print("Digite 1 numero: ");
				x = sc.nextInt();				
			}
				
		}
	}
}
		if (x != 1 && x != 2) {
			System.err.println("Programa finalizado.");
			
		}
}
}