import pt.uc.dei.nobugssnackbar.Order;
import pt.uc.dei.nobugssnackbar.SnackMan;
import pt.uc.dei.nobugssnackbar.VisualWorld;

public class M8_7 extends SnackMan {

	@Override
	public void serve() throws Exception {
		int qtosSorvetes = 0;
		// TODO Auto-generated method stub
		goToBarCounter(1);
		qtosSorvetes = askWantHowManyFoods();
		for (int i = 1; i <= qtosSorvetes; i += 1) {
			Order sorvete = Order.CHOCOLATE;
			goToIceCreamMachine();
			sorvete = pickUpIceCream(sorvete);
			goToBarCounter(i);
			deliver(sorvete);
		}
			
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisualWorld.start("mission8_7.dat", M8_7.class);

	}

}
