package ListaSubrotinas;

import java.util.Scanner;

public class E5 {
	static long[] x(long[] a) {
		long b[] = new long[5];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
			for (long j = b[i] - 1; j > 0; j--) {
				b[i] = b[i] * j;
			}
		}
		return b;
	}
	public static void main(String[] args) {
		long a[] = new long[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 5 numeros: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		long[] x = x(a);
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

}
