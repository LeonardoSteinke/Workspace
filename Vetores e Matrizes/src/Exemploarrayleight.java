
public class Exemploarrayleight {

	public static void main(String[] args) {
		int array[] = {9,8,7,6,5,4,3,2,1,0};
		String saida = "Índice\tValor\n";
		for (int cont = 0; cont < array.length; cont++)
			saida += cont + "\t\t" + array[cont] + "\n";
			System.out.print(saida);
	}
}
