import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
    	
        Locale locale = Locale.getDefault();
        System.out.print("O idioma do sistema é: ");
        System.out.println(locale.getDisplayLanguage());       
    }

}