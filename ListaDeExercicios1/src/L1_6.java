import java.util.Scanner;

public class L1_6 {

	private static Scanner entrada;

	public static void main(String[] args) {
		int ano;
		entrada = new Scanner(System.in);
		System.out.println("Quer saber se um ano é bissexto?");
		System.out.print("Digite um ano: ");
		ano = entrada.nextInt();
		
		if((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println(ano + " é ano bissexto.");
        } else{
            System.out.println(ano + " não é ano bissexto.");
        }
		

	}

}
