public class VetoresEMatrizes {

	private static int [] arrayInteiros;

	public static void main(String[] args) {
		arrayInteiros = new int [101]; /*sempre começa no indice 0, sempre vai ate n-1
														manutenção do array .length
														System.arraycopy*/
		for(int i=1; i<=100; i++) {
			arrayInteiros[i]= i*2;
			System.out.println("Índice: " + i + " Valor: " + arrayInteiros[i]);	
		}
	}
}