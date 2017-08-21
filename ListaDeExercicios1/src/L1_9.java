import java.util.Scanner;

public class L1_9 {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
			// TODO Auto-generated method stub
		double raio;
		double area;
		System.out.println("Descubra a área de uma circunferência sabendo o valor do raio.");
		System.out.print("Digite o valor do raio da circunferência: ");
		raio = entrada.nextDouble();
		area = Math.PI*raio*raio;
		System.out.print("A área da circunferência é: " + area);
		


	}

}
