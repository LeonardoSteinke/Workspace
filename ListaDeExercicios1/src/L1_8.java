import java.util.Scanner;

public class L1_8 {

	private static Scanner entrada;

	public static void main(String[] args) {
		double distancia;
		// TODO Auto-generated method stub
		System.out.println("Conversão de Metros para Centímetros");
		entrada = new Scanner(System.in);
		System.out.print("Digite o tamanho em metros: ");
		distancia = entrada.nextDouble();
		distancia = distancia * 100;
		System.out.println("O tamanho em centímetros é: " + distancia + "cm.");
	}

}
