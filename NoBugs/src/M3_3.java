import pt.uc.dei.nobugssnackbar.SnackMan;
import pt.uc.dei.nobugssnackbar.VisualWorld;

public class M3_3 extends SnackMan {

	@Override
	public void serve() throws Exception {
		int dinheiro = 0;
		int money = 0;
		int money2 = 0;
		int gorgeta =0;

		goToBarCounter(1);
		dinheiro = askWantHowManyFoods() * 2;
		money = cashIn(dinheiro);
		gorgeta = money - dinheiro;
		
		goToBarCounter(3);
		dinheiro = askWantHowManyFoods() * 2;
		money2 = cashIn(dinheiro);
		gorgeta = money2 - dinheiro + gorgeta;
		talk(money + money2);
		talk(gorgeta);
	}

	public static void main(String[] args) {
		VisualWorld.start("mission3_3.dat", M3_3.class);
		

	}

}
