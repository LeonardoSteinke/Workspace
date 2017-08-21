import java.util.Scanner;

public class L1_11 {
	private static Scanner entrada;
	public static void main(String[] args) {
		

		double temperatura;
		
		entrada = new Scanner (System.in);
		System.out.println("Converta ºF para ºC");
		System.out.print("Temperatura em ºF: ");
		temperatura = entrada.nextDouble();
		
		temperatura = (5 * (temperatura - 32) / 9);
		
		System.out.println("A temperatura em ºC é: " + temperatura + " ºC" );

	}

}
