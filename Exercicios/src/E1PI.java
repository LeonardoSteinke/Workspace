import java.util.Scanner;

public class E1PI {

	public static void main(String[] args) {
		System.out.println("Digite um ano para saber se ele é bissexto: ");
		Scanner sc = new Scanner(System.in);
		int ano = sc.nextInt();
		if (ano%4==0) {
			System.out.println("é bissexto");
		}else{
			System.out.println("não é bissexto");
		}
	}

}
