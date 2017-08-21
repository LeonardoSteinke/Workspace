import java.awt.Dimension;
import java.awt.Toolkit;

public class resolucaodatela {
    public static void main (String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.print("A Resolução da sua tela é: " + d.width + " x ");
        System.out.println(d.height);
                
    }

}