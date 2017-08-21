import java.util.Scanner;

public class Questao5 {
	
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int n = sc.nextInt();
		int intervalo1 = 0;
		int intervalo2 = 0;
		int intervalo3 = 0;
		int intervalo4 = 0;
		System.out.printf("Agora digite os %d numeros um de cada vez: \n",n);
		for (int x = 1; x <= n; x++) {
			int numero = sc.nextInt();
			if (numero >= 0 && numero <= 25) {
				intervalo1 = intervalo1 + 1;
			}
			if (numero >= 26 && numero <= 50) {
				intervalo2 = intervalo2 + 1;
			}
			if (numero >= 51 && numero <= 75) {
				intervalo3 = intervalo3 + 1;
			}
			if (numero >= 76 && numero <= 100) {
				intervalo4 = intervalo4 + 1;
			}
		}
		System.out.printf("Intervalo [0..25] = %d \nIntervalo [26..50] = %d \nIntervalo [51..75] = %d \nIntervalo [76..100] = %d",intervalo1,intervalo2,intervalo3,intervalo4);
		sc.close();
	}
}