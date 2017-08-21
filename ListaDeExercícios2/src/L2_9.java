import java.util.Scanner;

public class L2_9 {

	private static Scanner sc;

	public static void main(String[] args) {
		double media1 = -1;
		double media2 = -1;
		double media3 = -1;
		double media4 = -1;
		int frequencia = -1;
		sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Digite as medias e a frequencia do aluno e descubra se foi aprovado");
		while (media1 < 0 || media1 > 10) {
			System.out.print("Média 1: ");
			media1 = sc.nextDouble();
			if (media1 < 0 || media1 > 10) {
				System.out.println("Digite um numero entre 0 e 10");
				}
		}
		while (media2 < 0 || media2 > 10) {
			System.out.print("Média 2: ");
			media2 = sc.nextDouble();
			if (media2 < 0 || media2 > 10) {
				System.out.println("Digite um numero entre 0 e 10");
			}
	}
		while (media3 < 0 || media3 > 10) {
			System.out.print("Média 3: ");
			media3 = sc.nextDouble();
			if (media3 < 0 || media3 > 10) {
				System.out.println("Digite um numero entre 0 e 10");
			}
	}
		while (media4 < 0 || media4 > 10) {
			System.out.print("Média 4: ");
			media4 = sc.nextDouble();
			if (media4 < 0 || media4 > 10) {
				System.out.println("Digite um numero entre 0 e 10");
			}
		}
		while (frequencia <= 0 || frequencia >= 100) {
			System.out.print("Frequência: ");
			frequencia = sc.nextInt();
			if (frequencia <= 0 || frequencia >= 100) {
				System.out.println("Digite um numero entre 0 e 100");
			}
		}
		media1 = (media1 + media2 + media3 + media4)/4;
		System.out.println("Media final: " + media1);
		if (frequencia < 75) {
			System.err.print("REPROVADO!");		
		}
		if(frequencia >= 75 && media1 < 3) {
			System.err.println("REPROVADO!");
		}
		if (frequencia >= 75 && media1 >= 3 && media1 <7) {
			System.err.println("EM EXAME!");
		}
		if (frequencia >= 75 && media1 >= 7) {
			System.out.println("Aprovado");
		}
	}
}
