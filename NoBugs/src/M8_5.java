import pt.uc.dei.nobugssnackbar.SnackMan;
import pt.uc.dei.nobugssnackbar.VisualWorld;

public class M8_5 extends SnackMan {

	@Override
	public void serve() throws Exception {
		// TODO Auto-generated method stub
		int i = 1;
		int comida;
		int dinheiro;
		int gorgeta = 0;
		while (i <= 3) {
			goToBarCounter(i);
			comida = askWantHowManyFoods()*2;
			dinheiro = cashIn(comida);
			gorgeta += dinheiro - comida;
			i += 1;
		}
		talk (gorgeta);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisualWorld.start("mission8_5.dat", M8_5.class);

	}

}
