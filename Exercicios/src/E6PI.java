import java.util.Scanner;

public class E6PI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("quanto de latao vc quer: ");
		double latao = sc.nextDouble();
		double cobre = latao*0.7;
		double zinco = latao*0.3;
		System.out.println("Você vai precisar de:\nCobre: "+ cobre +"\nZinco: "+ zinco);
	}
	
	
	
	
	

}
