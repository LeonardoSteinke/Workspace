import java.util.Scanner;

public class L1_10 {
	private static Scanner entrada;
	public static void main(String[] args) {
		double porHora;
		double qtasHoras;
		double salario;
		entrada = new Scanner(System.in);
		System.out.println("Cálculo do salário mensal");
		System.out.println("Quanto você ganha por hora? ");
		porHora = entrada.nextDouble();
		System.out.println("Quantas horas você trabalha por mês? ");
		qtasHoras = entrada.nextDouble();
		salario = qtasHoras*porHora;
		System.out.println("Você ganha " + salario + " por mês");
		
	}

}
