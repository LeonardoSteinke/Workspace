import pt.uc.dei.nobugssnackbar.Order;
import pt.uc.dei.nobugssnackbar.SnackMan;
import pt.uc.dei.nobugssnackbar.VisualWorld;

public class M5_7 extends SnackMan {

	@Override
	public void serve() throws Exception {
		// TODO Auto-generated method stub
		goToBarCounter(2);
		Order suco = askForDrink();
		goToBoxOfFruits();
		suco = pickUpFruits(suco);
		goToJuiceMachine();
		suco = prepareAndPickUpJuice(suco);
		goToBarCounter(2);
		deliver(suco);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisualWorld.start("mission5_7.dat", M5_7.class);

	}

}
