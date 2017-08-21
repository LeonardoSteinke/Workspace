
public class Sadas {

	    
	public static void main(String[] args) {
		        final int MAX_ARRAY = 10;
		        int array[ ] = new int[ MAX_ARRAY ];
		        String saida = “Índice\tValor\n”;
		        for( int cont = 0; cont < array.length; cont ++)
		            array[ cont ] = 1 + 2 * cont;
		        for( int cont = 0; cont < array.length; cont++)
		            saida += cont + “\t” + array[ cont ] + “\n”;
		        System.out.printf(saida);
		    }
		}
