import pt.uc.dei.nobugssnackbar.Order;
import pt.uc.dei.nobugssnackbar.SnackMan;
import pt.uc.dei.nobugssnackbar.VisualWorld;

public class M5_8 extends SnackMan {

	@Override
	public void serve() throws Exception {
		// TODO Auto-generated method stub
		goToBarCounter(2);
		Order bebida  = askForDrink();
		if (bebida.equals(Order.SOFTDRINK)) {
			goToCooler();
			bebida = pickUpDrink(bebida);
		}else{
			goToBoxOfFruits();
			bebida = pickUpFruits(bebida);
			goToJuiceMachine();
			bebida = prepareAndPickUpJuice(bebida);
		}
		goToBarCounter(2);
		deliver(bebida);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisualWorld.start("mission5_8.dat", M5_8.class);
	}

}
