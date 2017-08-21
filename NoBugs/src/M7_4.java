import pt.uc.dei.nobugssnackbar.Order;
import pt.uc.dei.nobugssnackbar.SnackMan;
import pt.uc.dei.nobugssnackbar.VisualWorld;

public class M7_4 extends SnackMan {

	@Override
	public void serve() throws Exception {
		int qtoCachorro = 0;

		int bar = 0;
		// TODO Auto-generated method stub
		goToBarCounter(1);
		if (askWantHowManyFoods() > qtoCachorro) {
			qtoCachorro = askWantHowManyFoods();
			bar = 1;
		}
		goToBarCounter(2);
		if (askWantHowManyFoods() > qtoCachorro) {
			bar = 2;
			qtoCachorro = askWantHowManyFoods();
		}
		goToBarCounter(3);
		if (askWantHowManyFoods() > qtoCachorro) {
			bar = 3;
			qtoCachorro = askWantHowManyFoods();
		}
		Order pedido = Order.CHOCOLATE;
		goToIceCreamMachine();
		pedido = pickUpIceCream(pedido);
		goToBarCounter(bar);
		deliver(pedido);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisualWorld.start("mission7_4.dat", M7_4.class);

	}

}