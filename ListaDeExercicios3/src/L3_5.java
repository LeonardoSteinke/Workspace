import java.util.Scanner;

public class L3_5 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int i = 0;
		int c = 0;
		System.out.println("Soma de valores até digitar -1"); 
		while (i != -1) {
			System.out.print("Digite um numero: ");
			i = sc.nextInt();
			c = c +i;
		}
System.out.println("A soma é: " + c);
	}

}
