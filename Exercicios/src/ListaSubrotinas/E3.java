package ListaSubrotinas;

import java.util.Scanner;

public class E3 {
	static String x(int x, String y){
		if (y.equals("par")) {
			if (x%2==0) {
				y = "True";
			}else{
				y = "False";
			}
		}
		if (y.equals("impar")) {
			if (x%2!=0) {
				y = "True";
			} else {
				y = "False";
			}
		}
	return y;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int a = sc.nextInt();
		System.out.print("Digite par ou impar: ");
		String b = sc.next();
		String resultado = x(a, b);
		System.out.println(resultado);

	}

}
