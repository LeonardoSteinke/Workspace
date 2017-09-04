package ListaSubrotinas;

import java.util.Scanner;

public class E1 {
	static int n(int a){
		if (a>=0) {
			return 1;
		} else { 
			return 0;
		}
	}
	public static void main(String[] args) {
		System.out.println("Digite um numero: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		x = n(x);
		System.out.println(x);
	}

}
