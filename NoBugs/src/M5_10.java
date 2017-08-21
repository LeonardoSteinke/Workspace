import pt.uc.dei.nobugssnackbar.Order;
import pt.uc.dei.nobugssnackbar.SnackMan;
import pt.uc.dei.nobugssnackbar.VisualWorld;

public class M5_10 extends SnackMan {

	@Override
	public void serve() throws Exception {
		int qtaComida = 0;
		int qtaBebida = 0;
		Order pedido;
		// TODO Auto-generated method stub
		goToBarCounter(2);
		qtaComida = askWantHowManyFoods();
		qtaBebida = askWantHowManyDrinks();
		if (qtaComida == 3 || qtaBebida > 1 ) {
			pedido = Order.SUCODELARANJA;
			goToBoxOfFruits();
			pedido = pickUpFruits(pedido);
			goToJuiceMachine();
			pedido = prepareAndPickUpJuice(pedido);
			goToBarCounter(2);
			deliver(pedido);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisualWorld.start("mission5_10.dat", M5_10.class);
	}

}
