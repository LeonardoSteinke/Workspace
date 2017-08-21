import java.util.Scanner;

public class L2_3 {

	private static Scanner ler;

	public static void main(String[] args) {
		int numero;
		ler = new Scanner(System.in);
		System.out.println("Digite um número e descubra se ele é PAR ou IMPAR");
		System.out.print("Digite seu numero: ");
		numero = ler.nextInt();
		if (numero % 2 == 0) {
			System.err.print("Seu número é PAR!");
		}else{
			System.err.print("Seu numero é IMPAR!");
		}

	}

}
