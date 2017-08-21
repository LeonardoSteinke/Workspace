
public class bubblesort {

	public static void main(String[] args) {
		int vetor[] = {2, 4, 3, 1, 8, 10, 5, 6, 7, 9};
		for (int i = vetor.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (vetor[j] > vetor[j + 1]) {
					int aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "\t");
		}
		System.out.println("\n");
		
		// busca linear
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == 10)
				System.out.println("posição 1: " + i);
		}
		// busca binaria
		System.out.println("\n");
		int ini = 0;
		int fim = vetor.length;
		int posicao = -1;
		while ((ini < fim) || posicao == -1) {
			int meio = (fim + ini) / 2;
			if (vetor[meio] == 7) {
				posicao = meio;
			} else if (7 < vetor[meio]) {
				fim = meio - 1;

			} else {
				ini = meio + 1;
			}
		}
		System.out.println("posição 2: " + posicao); 
	}
}
