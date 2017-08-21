import java.util.Scanner;

public class L1_7 {

	private static Scanner entrada;

	public static void main(String[] args) {
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;
		entrada = new Scanner(System.in);
		System.out.println("Média de 4 Bimestres");
		System.out.print("Nota 1: ");
		nota1 = entrada.nextDouble();
		while (nota1 > 10 || nota1 < 0) {
			System.out.println("A nota deve ser um valor positivo, menor ou igual a 10.");
			System.out.print("Nota 1: ");
			nota1 = entrada.nextDouble();
		} 
		if(nota1 <= 10){
			System.out.print("Nota 2: ");
			nota2 = entrada.nextDouble();
			while (nota2 > 10 || nota2 < 0) {
				System.out.println("A nota deve ser um valor positivo, menor ou igual a 10.");
				System.out.print("Nota 2: ");
				nota2 = entrada.nextDouble();
			} 
			if (nota2 <= 10) {
				System.out.print("Nota 3: ");
				nota3 = entrada.nextDouble();
				while (nota3 > 10 || nota2 < 0) {
					System.out.println("A nota deve ser um valor positivo, menor ou igual a 10.");
					System.out.print("Nota 3: ");
					nota3 = entrada.nextDouble();
				} 
				if (nota3 <= 10) {
					System.out.print("Nota 4: ");
					nota4 = entrada.nextDouble();
					while (nota4 > 10 || nota4 < 0) {
						System.out.println("A nota deve ser um valor positivo, menor ou igual a 10.");
						System.out.print("Nota 4: ");
						nota4 = entrada.nextDouble();
					}
					media = (nota1 + nota2 + nota3 + nota4)/4;
					System.out.println("A média do aluno é: " + media);			
				}
			}
		}		
	}
}

