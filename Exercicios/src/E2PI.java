import java.util.Scanner;

public class E2PI {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Anos: ");
		int anos = sc.nextInt();
		System.out.println("Cigarros por dia: ");
		int cigarros = sc.nextInt();
		System.out.println("preço: ");
		double preco = sc.nextDouble();
		preco = preco/20;
		anos = anos*365;
		cigarros = anos*cigarros;
		preco = preco*cigarros;
		System.out.println("R$" + preco);
	}
}