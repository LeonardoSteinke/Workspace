import pt.uc.dei.nobugssnackbar.MoneyType;
import pt.uc.dei.nobugssnackbar.SnackMan;
import pt.uc.dei.nobugssnackbar.VisualWorld;

public class M4_4 extends SnackMan {

	@Override
	public void serve() throws Exception {
		int comida = 0;
		int bebida = 0;
		int dinheiro = 0;
		int item = 0;
		int sobra = 0;
		int item2 = 0;
		int moeda1 = 0;
		// TODO Auto-generated method stub
		goToBarCounter(2);
		comida = askWantHowManyFoods()*2;
		bebida = askWantHowManyDrinks()*3;
		dinheiro = cashIn(comida + bebida);
		dinheiro = dinheiro - (comida + bebida);
		item = dinheiro / 5;
		sobra = dinheiro - (item*5);
		item2 = sobra/2;
		moeda1 = dinheiro - ((item*5)+(item2*2));
		giveChange(item, MoneyType.NOTA5);
		giveChange(item2, MoneyType.MOEDA2);
		giveChange(moeda1, MoneyType.MOEDA1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisualWorld.start("mission4_4.dat", M4_4.class);

	}

}
