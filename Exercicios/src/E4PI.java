import java.util.Scanner;

public class E4PI {

	public static void main(String[] args) {
		//a) de imposto: 45% sobre o custo do carro
		//b) de lucro do distribuidor: 12% sobre o custo do carro
		Scanner sc = new Scanner(System.in);
		System.out.print("Preço de fabrica do carro: ");
		double preco = sc.nextDouble();
		double bla = preco*0.45;
		double ble = preco*0.12;
		System.out.println("Imposto: "+ bla);
		System.out.println("Lucro do distribuidor: "+ble);
		preco += bla+ble;
		System.out.println("Preco final: "+preco);
		}

}
