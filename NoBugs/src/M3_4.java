import pt.uc.dei.nobugssnackbar.SnackMan;
import pt.uc.dei.nobugssnackbar.VisualWorld;
public class M3_4 extends SnackMan {
	@Override
	public void serve() throws Exception {
		int qtaComida = 0;
		int nCachorros = 10;
		
		goToBarCounter(1);
		qtaComida = askWantHowManyFoods();
		
		goToBarCounter(2);
		qtaComida = qtaComida + askWantHowManyFoods();
		
		goToBarCounter(3);
		qtaComida = qtaComida + askWantHowManyFoods();
		
		nCachorros = nCachorros - qtaComida;
		talk(nCachorros);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisualWorld.start("mission3_4.dat", M3_4.class);

	}

}
