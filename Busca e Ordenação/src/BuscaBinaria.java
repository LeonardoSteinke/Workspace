
public class BuscaBinaria {

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
		}
	}

