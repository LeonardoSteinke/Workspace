import pt.uc.dei.nobugssnackbar.MoneyType;
import pt.uc.dei.nobugssnackbar.SnackMan;
import pt.uc.dei.nobugssnackbar.VisualWorld;

public class M4_2 extends SnackMan {



	@Override
	public void serve() throws Exception {
		int qtaComida = 0;
		int qtaBebida = 0;
		int total = 0;
		int troco = 0;

		goToBarCounter(2);
		qtaComida = askWantHowManyFoods()*2;
		qtaBebida = askWantHowManyDrinks()*3;
		total = qtaComida + qtaBebida;
		troco = cashIn(total);
		troco = troco - total;
		giveChange(troco, MoneyType.MOEDA1);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisualWorld.start("mission4_2.dat", M4_2.class);

	}

}
