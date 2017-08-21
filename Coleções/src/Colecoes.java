import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class Colecoes {

	public static void main(String[] args) {
		List<String> frutas = new ArrayList <String>();
		frutas.isEmpty();
		frutas.add("Cherry");
		System.out.println(frutas.size());
		frutas.get(0);
		frutas.contains("Laranja");
		frutas.contains("Goiaba");
		frutas.add("Banana");
		frutas.add("Goiaba");
		frutas.add("Kiwi");
		System.out.println(frutas.size());
		JOptionPane.showMessageDialog(null, "Tem melancia?  " + frutas.contains("Melancia"));
	}

}
