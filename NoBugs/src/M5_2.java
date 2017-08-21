import pt.uc.dei.nobugssnackbar.Order;
import pt.uc.dei.nobugssnackbar.SnackMan;
import pt.uc.dei.nobugssnackbar.VisualWorld;

public class M5_2 extends SnackMan {

	@Override
	public void serve() throws Exception {
		// TODO Auto-generated method stub
		goToBarCounter(1);
		if (askHasThirsty() == true) {
			Order bebida = askForDrink();
			goToCooler();
			bebida = pickUpDrink(bebida);
			goToBarCounter(1);
			deliver(bebida);			
		}
		goToBarCounter(3);
		if (askHasThirsty() == true) {
			Order bebida2 = askForDrink();
			goToCooler();
			bebida2 = pickUpDrink(bebida2);
			goToBarCounter(3);
			deliver(bebida2);		
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisualWorld.start("mission5_2.dat", M5_2.class);

	}

}
