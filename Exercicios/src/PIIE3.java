
public class PIIE3 {

	public static void main(String[] args) {
		int media = 0;
		int cont=0;
		System.out.println("Números pares entre 13 e 73:");
		for (int i = 14; i < 73; i+=2) {
			System.out.println(i);
			cont ++;
			media += i;
		}
		media = media/cont;
		System.out.println("Media: "+media);
		
	}

}
