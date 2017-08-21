
import pt.uc.dei.nobugssnackbar.SnackMan;
import pt.uc.dei.nobugssnackbar.VisualWorld;


public class M2_3 extends SnackMan {

	@Override
	public void serve() throws Exception {
		int qtaComida = 0;
		int qtaBebida = 0;

		goToBarCounter(1);
		qtaComida = askWantHowManyFoods();
		qtaBebida = askWantHowManyDrinks();
		
		goToBarCounter(2);
		qtaComida += askWantHowManyFoods();
		qtaBebida += askWantHowManyDrinks();
		
		goToBarCounter(3);
		qtaComida += askWantHowManyFoods();
		qtaBebida += askWantHowManyDrinks();
		
		talk(qtaComida);
		talk(qtaBebida);
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisualWorld.start("mission2_3.dat", M2_3.class);

	}

}
