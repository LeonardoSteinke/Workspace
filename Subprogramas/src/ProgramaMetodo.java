
public class ProgramaMetodo {

	static double media(int a, int b) {
		double media = (a + b) / 2;
		return media; 
	}

	public static void main(String[] args) {
		double m1 = media(10, 100);
		System.out.printf("Média 1: %.2f\n", m1);
		double m2 = media(0, 10);
		System.out.printf("Média 2: %.2f\n", m2);
	}
}
