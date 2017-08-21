import pt.uc.dei.nobugssnackbar.Order;
import pt.uc.dei.nobugssnackbar.SnackMan;
import pt.uc.dei.nobugssnackbar.VisualWorld;

public class M5_3 extends SnackMan {

	@Override
	public void serve() throws Exception {
		// TODO Auto-generated method stub
		goToBarCounter(2);
		if (askHasHunger() == true) {
			Order comida = askForFood();
			goToDisplay();
			comida = pickUpHotDog(comida);
			goToBarCounter(2);
			deliver(comida);
		}
		
		if (askHasThirsty() == true) {
			Order bebida = askForDrink();
			goToCooler();
			bebida = pickUpDrink(bebida);
			goToBarCounter(2);
			deliver(bebida);
		}
	
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisualWorld.start("mission5_3.dat", M5_3.class);

	}

}
