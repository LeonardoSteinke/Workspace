import java.util.Scanner;

public class E5 {

	public static void main(String[] args) {
		int inteiros[] = new int[20];
		int pares[] = new int[20];
		int impares[] = new int[20];

		System.out.println("Digite 20 numeros");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < inteiros.length; i++) {
			inteiros[i] = sc.nextInt();
			if (inteiros[i] % 2 == 0) {
				pares[i] = inteiros[i];
			} else {
				impares[i] = inteiros[i];
			}
		}
		System.out.println("Inteiros: ");
		for (int i = 0; i < inteiros.length; i++) {
			System.out.print(inteiros[i] + " ");
		}
		System.out.print("\nPares: ");
		for (int i = 0; i < pares.length; i++) {
			if (pares[i] == 0) {
			} else {
				System.out.print(pares[i] + " ");
			}
		}
		System.out.print("\nImpares: ");
		for (int i = 0; i < impares.length; i++) {
			if (impares[i] == 0) {
			} else {
				System.out.print(impares[i] + " ");
			}
		}
		sc.close();
	}
}
