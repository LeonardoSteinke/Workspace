import java.util.Scanner;

public class PIIE2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Tabuada de que numero?: ");
		int t = sc.nextInt();
		for (int i = 0; i <= 10 ; i++) {
			System.out.println(t+"x"+i+ "="+ (t*i));
		}
	}

}
