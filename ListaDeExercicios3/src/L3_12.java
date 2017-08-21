import java.util.Scanner;

public class L3_12 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		double i = sc.nextDouble();
		double h = 0;
		for (double j = 1; j <= i; j++) {
			h = 1/j + h;		
		}
		System.out.println("O numero é: " + h);
		sc.close();
	}
}
