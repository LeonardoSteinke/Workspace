
public class questaodavi {

	public static void main(String[] args) {

		int cont = 0;
		int valor = 0;
		while (valor < 125250) {
			cont += 1;
			valor += cont;
		}
		System.out.println(cont);
	}
}