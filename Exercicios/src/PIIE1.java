import java.util.Scanner;

public class PIIE1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("numero para fatorial");
		int n = sc.nextInt();
		int f = 0;
		for (int i = n; i>=0; i--) {
			f += n*(n-1);	
		}
		System.out.println(f);
	}
}
