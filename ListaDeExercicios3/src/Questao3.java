import java.util.Scanner;

public class Questao3 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int i = sc.nextInt();
		int valor;
		for (int j = 1; j <= 200; j++) {
			if (j >= 1 && j <= 200) {
				valor = i*j;
				System.out.print(i + " x " + j + " = " + valor + "|");
				if (j % 10 == 0) {
					System.out.printf("\n");
				}
			}
		}
		sc.close();
	}
}
