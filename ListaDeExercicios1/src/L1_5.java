import java.util.Scanner;

public class L1_5 {

	private static Scanner entrada;

	public static void main(String[] args) {
		double numero1;
		double numero2;
		double soma;
		entrada = new Scanner(System.in);
		System.out.println("Soma de 2 números");
		System.out.print("Digite o primeiro número: ");
		numero1 = entrada.nextDouble();
		System.out.print("Digite o segundo número: ");
		numero2 = entrada.nextDouble();
		soma = numero1 + numero2;
		System.out.println("A soma é: " + soma);

	}

}
