
import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double notas[] = new double[4];
		double media = 0;
		for (int i = 0; i < notas.length; i++) {
			int j = i + 1;
			System.out.print("Digite a " + j + "ª nota: ");
			notas[i] = sc.nextDouble();
		}
		System.out.print("As notas são: ");
		for (int i = 0; i < notas.length; i++) {
			media = notas[i] + media;
			System.out.print(notas[i] + " ");
		}
		media = media / 4;
		System.out.println("\nA média é: " + media);
		sc.close();
	}
}
