
import java.util.Scanner;

public class E1 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int numerosInteiros[] = new int[5];
		for (int i = 0; i < numerosInteiros.length; i++) {
			System.out.print("Digite um número: ");
			numerosInteiros[i] = sc.nextInt();
		}
		for (int i = 0; i < numerosInteiros.length; i++) {
			System.out.print(numerosInteiros[i] + " ");
		}
		sc.close();
	}

}
