package ListaSubrotinas;

import java.util.Scanner;
	
public class E4 {
	static int x(int a[]){
		int aux;
		for(int i=0; i<3; i++ ){
            for(int j=i+1; j<3; j++ ){
                 if( a[i] > a[j] ){
                     aux = a[i]; 
                     a[i] = a[j];
                     a[j] = aux;
                 }
            }
		}		
		return a[2];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int [3];
		System.out.println("Digite 3 numeros: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Numero " + (i+1)+ ": ");
			a[i] = sc.nextInt();		
		}
		int x = x(a);
		System.out.println(x);
	}

}
