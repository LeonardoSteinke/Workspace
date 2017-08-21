import pt.uc.dei.nobugssnackbar.SnackMan;
import pt.uc.dei.nobugssnackbar.VisualWorld;

public class M6_7 extends SnackMan {

	@Override
	public void serve() throws Exception {
		int pedidoCaro = 0;
		int pedido = 0;
		// TODO Auto-generated method stub
		goToBarCounter(1);
		pedido = askWantHowManyFoods()*2;
		pedido += askWantHowManyDrinks()*3;
		if (pedido > pedidoCaro) {
			pedidoCaro = pedido;
		}
		goToBarCounter(2);
		pedido = askWantHowManyFoods()*2;
		pedido += askWantHowManyDrinks()*3;
		if (pedido > pedidoCaro) {
			pedidoCaro = pedido;
		}goToBarCounter(3);
		pedido = askWantHowManyFoods()*2;
		pedido += askWantHowManyDrinks()*3;
		if (pedido > pedidoCaro) {
			pedidoCaro = pedido;
		}
		talk(pedidoCaro);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisualWorld.start("mission6_7.dat", M6_7.class);

	}

}
