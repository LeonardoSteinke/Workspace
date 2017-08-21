import java.util.Scanner;

public class L2_2 {

	private static Scanner ler;

	public static void main(String[] args) {
		double numero;
		ler = new Scanner(System.in);
		System.out.print("Digite um número: ");
		numero = ler.nextDouble();
		if (numero == 0) {
			System.out.println("Seu número é ZERO");
		}
		if (numero > 0) {
			System.out.println("Seu número é positivo");
		}
		if (numero < 0) {
			System.out.println("Seu número é negativo");
		}
	}

}
