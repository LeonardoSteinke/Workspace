import java.util.Scanner;
public class L2_8 {
	private static Scanner entrada;
	public static void main(String[] args) {
		float peso = 0;
		float altura = 0;
		float imc = 0;
		entrada = new Scanner(System.in);
		System.out.println("Calcule seu IMC");
		System.out.print("Digite seu peso: ");
		peso = entrada.nextFloat();
		System.out.print("Digite sua altura: ");
		altura = entrada.nextFloat();
		imc = peso / (altura * altura);
		System.out.print("Seu IMC é: " + imc);		
		if (imc < 20) {
			System.out.print(" Você está abaixo do peso !");
		}
		if (imc >= 20 && imc < 25) {
			System.out.print(" Você está com peso ideal !");
		}
		if (imc >= 25 && imc < 30) {
			System.out.print(" Você está com sobrepeso !");
		}
		if (imc >= 30 && imc < 40) {
			System.out.print(" Você está com obesidade !");		
		}
		if (imc > 40) {
			System.out.print(" Obesidade mórbida !");
		}
	}
}




