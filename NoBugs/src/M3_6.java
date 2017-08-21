import pt.uc.dei.nobugssnackbar.SnackMan;
import pt.uc.dei.nobugssnackbar.VisualWorld;

public class M3_6 extends SnackMan {

	@Override
	public void serve() throws Exception {
		int cachorro = 0;
		int valorcachorro = 0;
		int bebida = 0;
		int valorbebida = 0;
		int lucro = 0;
		int total = 0;
		
		goToBarCounter(1);
		cachorro = askWantHowManyFoods();
		valorcachorro = askWantHowManyFoods() * 3;
		bebida = askWantHowManyDrinks();
		valorbebida = askWantHowManyDrinks() * 3;
		
		goToBarCounter(3);
		cachorro += askWantHowManyFoods();
		valorcachorro += askWantHowManyFoods() * 3;
		bebida += askWantHowManyDrinks();
		valorbebida += askWantHowManyDrinks() * 3;
		
		total = valorcachorro + valorbebida;
		lucro = valorcachorro - cachorro*2;
		lucro += valorbebida - bebida; 
		
		talk(total);
		talk(lucro);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisualWorld.start("mission3_6.dat", M3_6.class);
	}

}
