import java.util.Scanner;

public class Questao4 {
	
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		float i = sc.nextFloat();
		int deucerto = 0;
		for (int j = 1; j <= 99999999; j++) {
			int k = 2;
			int l = 3;	
			deucerto = j*k*l;
			if (deucerto == i) {
				System.out.println("É triangular");
				j = 99999999;
			}else{
				k = k + 1;
				l = l + 1 ;
			}
		}
		if (deucerto != i) {
			System.out.println("Não é triangular");
		}
		sc.close();
	}
}