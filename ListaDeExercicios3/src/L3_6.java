import java.util.Scanner;

public class L3_6 {

	private static Scanner sc;

	public static void main(String[] args) {
		/* Fibonacci. A série de Fibonacci é formada pela sequência 1,1,2,3,5,8,13,21,34,55,... 
		 * Faça um programa capaz de gerar a série até o n−ésimo termo, digitado pelo usuário.
		 */
		sc = new Scanner(System.in);
		System.out.println("Descubra a o numero n na série Fibonacci");
		System.out.print("Digite um numero: ");
		int x = sc.nextInt();
		long y = 1;
		long z = 0;
		if(x % 2 == 1) {
        for(int i = 0; i < (x-1); i++){
            y = y + z;
            z = y - z;           
        } 
        System.out.println("O numero na sequencia de fibonacci é: " + y);
		}
		if ( x % 2 == 0) {
			for(int i = 0; i < x; i++){
	            y = y + z;
	            z = y - z;	            
    }
		System.out.println("O numero na sequencia de fibonacci é: " + z);	
	}
		sc.close();
}
}