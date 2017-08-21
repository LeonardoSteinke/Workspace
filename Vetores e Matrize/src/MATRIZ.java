public class MATRIZ {

	public static void main(String[] args) {
		int[][] matrizDeNaturais = new int[5][4]; // [x] [y]
		int a = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				matrizDeNaturais[i][j] = a;
				a++;
				if (matrizDeNaturais[i][j] < 10) {
					System.out.print("0" + matrizDeNaturais[i][j] + "\t");
				} else {
					System.out.print(matrizDeNaturais[i][j] + "\t");
				}
			}
			System.out.println();
			
		}
		String s1 = "Olá";
		String s2 = "Mundo!";
		String s3 = s1 + " " + s2;
		System.out.println(s3.replace('O', 'F'));
	}
}
