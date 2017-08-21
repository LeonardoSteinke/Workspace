import java.util.Scanner;

public class L2_5 {

	private static Scanner ler;

	public static void main(String[] args) {
		ler = new Scanner(System.in);
		char x = 1;
		char a = 'a';
		char e = 'e';
		char i = 'i';
		char o = 'o';
		char u = 'u';
		char ç = '.';
		//Faça um Programa que leia pelo teclado um caractere e imprime se ele é vogal ou consoante.
		System.out.println("Descubra se um caractere é vogal ou consoante");
		while (x != ç) {
		System.out.print("Digite uma letra: ");
		x = ler.next().charAt(0);
		if (x == ç) {
			System.err.println("Programa finalizado.");
		} else if (x != a && x != e && x != i && x != o && x != u) {
			System.out.println("É consoante.");
		} else { 
			System.out.println("É vogal.");
		}
	}
}
}
