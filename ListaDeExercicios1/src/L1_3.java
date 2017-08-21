import java.util.Scanner;
public class L1_3 {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite seu número: ");
		numero = entrada.nextInt();
		
		System.out.print("Seu número é: " + numero);

	}
}
