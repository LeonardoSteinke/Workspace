import java.util.Scanner;

public class L3_11 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Digite 2 caracteres e descubra o numero de caracteres entre eles");
		System.out.print("Digite o primeiro caractere: ");
		char a = sc.next().charAt(0);
		System.out.print("Digite o segundo caractere: ");
		char b  = sc.next().charAt(0);
		int um = (int) a;
		int dois = (int) b;
		um = dois - um - 1;
		System.out.println("A distância é: " + um);

	}

}
