import java.util.Scanner;

public class L2_1 {

	private static Scanner ler;

	public static void main(String[] args) {
		double numero;
		ler = new Scanner(System.in);
		System.out.print("Digite um número: ");
		numero = ler.nextDouble();
		if (numero > 5) {
			System.out.println("O número é: " + numero);
		}else{
			System.out.println("Somente números maiores que 5.");
		}
		
	}

}
