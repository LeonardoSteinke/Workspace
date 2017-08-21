import java.util.Scanner;

public class L3_4 {
	
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double media1 = -1;
		sc = new Scanner(System.in);
		System.out.println("Digite notas");
		while (media1 < 0 || media1 > 10) {
			System.out.print("Média 1: ");
			media1 = sc.nextDouble();
			if (media1 < 0 || media1 > 10) {
				System.out.println("Digite um numero entre 0 e 10");
				}
		}
		System.err.println("Correto :D");
	}
}
