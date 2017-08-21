import java.util.Scanner;

public class L1_4 {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int numero1;
		int numero2;
		int soma;
		int multiplicacao;
		int divisao;
		int resto;
		System.out.println("Nesse programa você deverá digitar 2 números inteiros.");
		System.out.print("Digite o primeiro número: ");
		numero1 = entrada.nextInt();
		System.out.print("Digite o segundo número: ");
		numero2 = entrada.nextInt();
		soma = numero1 + numero2;
		multiplicacao = numero1 * numero2;
		divisao = numero1/numero2;
		resto = numero1 % numero2;
		System.out.println("Soma dos valores:  " + numero1 + " + " + numero2 + " = " + soma);
		System.out.println("Multiplicação dos valores: " + numero1 + " x " + numero2 + " = " + multiplicacao );
		System.out.println("Divisão inteira dos valores: " + numero1 + " ÷ " + numero2 + " = " + divisao);
		System.out.println("Resto da divisão: " + resto);
		System.out.println("Os Operandos são: +, x e ÷");
		System.out.println("Os Operadores são: " + numero1 + " e " + numero2);

	}

}
