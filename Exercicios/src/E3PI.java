import java.util.Scanner;

public class E3PI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Razão da sua PA: ");
		int R = sc.nextInt();
		System.out.print("Primeiro termo: ");
		int P = sc.nextInt();
		System.out.print("Ultimo termo: ");
		int U = sc.nextInt();	
		int soma = 0;
		while(P <= U){
		soma += P;
		P = P+R;		
		}
		System.out.println(soma);
	}

}
