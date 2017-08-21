import java.util.Scanner;

public class L1_12 {

	private static Scanner entrada;

	public static void main(String[] args) {
		double temperatura;
		entrada = new Scanner(System.in);
		System.out.println("Converta ºC para ºF");
		System.out.print("Temperatura em ºC: ");
		temperatura = entrada.nextDouble();
		temperatura = temperatura * 1.8 + 32;
		System.out.println("A temperatura é: " + temperatura);

	}

}
