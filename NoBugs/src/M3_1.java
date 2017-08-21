
import pt.uc.dei.nobugssnackbar.SnackMan;
import pt.uc.dei.nobugssnackbar.VisualWorld;


public class M3_1 extends SnackMan {

	@Override
	public void serve() throws Exception {
		int qtasComidas = 0;
		// TODO Auto-generated method stub
		goToBarCounter(1);
		qtasComidas = askWantHowManyFoods() * 2;
		goToBarCounter(2);
		qtasComidas += askWantHowManyFoods() * 2;
		goToBarCounter(3);
		qtasComidas += askWantHowManyFoods() * 2;
		talk(qtasComidas);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisualWorld.start("mission3_1.dat", M3_1.class);

	}

}
