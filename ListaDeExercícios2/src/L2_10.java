import java.util.Scanner;
public class L2_10 {
	private static Scanner entrada;
	public static void main(String[] args) {
		int numero = 0;
		
		// TODO Auto-generated method stub
		while (numero != 4){
		int opcao = 1;
		entrada = new Scanner(System.in);
		System.out.println("1 – Somar dois números");
		System.out.println("2 - Comparar 2 caracteres");
		System.out.println("3 - Converter uma String para número");
		System.out.println("4 - Sair");
		System.out.print("Digite sua opção: ");
		numero = entrada.nextInt();
		while (numero == 1 && opcao == 1) {
			double numero1;
			double numero2;
			double soma;
			System.out.println("Soma de 2 números");
			System.out.print("Digite o primeiro número: ");
			numero1 = entrada.nextDouble();
			System.out.print("Digite o segundo número: ");
			numero2 = entrada.nextDouble();
			soma = numero1 + numero2;
			System.out.println("A soma é: " + soma);
			System.out.println("Digite 1 para repetir, digite 0 para voltar.");
			opcao = entrada.nextInt();
		}
		while (numero == 2 && opcao == 1) {
			char a;
			char b;
			System.out.println("Comparar 2 caracteres");
			System.out.print("Digite um caractere: ");
			a = entrada.next().charAt(0);
			System.out.print("Digite outro caractere: ");
			b = entrada.next().charAt(0);
			if (a == b) {
				System.out.println("São caracteres iguais");
			}else{
				System.out.println("São caracteres distintos");
			}
			System.out.println("Digite 1 para repetir, digite 0 para voltar.");
			opcao = entrada.nextInt();
		}
		while (numero == 3 && opcao == 1) {
			System.out.println("Converter uma String para número");			
			System.out.print("Digite uma String: ");			
			String x = entrada.next();
			try
			{
			int i = Integer.parseInt(x);
			System.out.println(i);
			} catch (NumberFormatException e)
			{
				System.out.println("Isto não é um número");
			}		
			System.out.println("Digite 1 para repetir, digite 0 para voltar.");
			opcao = entrada.nextInt();
		}
		if (numero == 4) {
			System.err.println("Programa finalizado.");
		}
		if(numero < 1 || numero > 4) {
			System.err.println("Opção inválida.");
			}		
		}
	}
}