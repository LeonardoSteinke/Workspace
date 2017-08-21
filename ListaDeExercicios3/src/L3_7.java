import java.util.Scanner;
public class L3_7 {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Digite um numero e descubra seu fatorial");
		System.out.print("Digite um numero: ");
		long x = sc.nextLong();
		for (long i = (x-1); i != 0; i--) {
			x = x*i;
		} 
System.out.println("O fatorial do valor é: " + x);
	}
}
