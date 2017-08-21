import java.util.Scanner;

public class E5PI {

	public static void main(String[] args) {
		// a) 50 reais se o motorista estiver ultrapassar em até 10km/h a velocidade permitida
		//b) 100 reais, se o motorista ultrapassar de 11 a 30 km/h a velocidade permitida. 
		//c) 200 reais, se estiver acima de 31km/h da velocidade permitida.
		Scanner sc = new Scanner(System.in);
		System.out.print("Velocidade maxima da via: ");
		int v = sc.nextInt();
		System.out.print("Velocidade do motorista: ");
		int m = sc.nextInt();
		if (m>v && m <= (v+10)) {
			System.out.println("50 reais de multa");
		}
		if (m>=(v+11) && m<=(v+30)) {
			System.out.println("100 reais de multa");
		}
		if (m>=(v+31)) {
			System.out.println("200 reis de multa");
		}
		sc.close();
	}
}
