import pt.uc.dei.nobugssnackbar.Order;
import pt.uc.dei.nobugssnackbar.SnackMan;
import pt.uc.dei.nobugssnackbar.VisualWorld;


public class M2_5 extends SnackMan {

	@Override
	public void serve() throws Exception {

		// TODO Auto-generated method stub
		goToBarCounter(2);
		Order bebida = askForDrink();
		Order comida = askForFood();
		goToDisplay();
		comida = pickUpHotDog(comida);
		goToCooler();
		bebida = pickUpDrink(bebida);
		goToBarCounter(2);
		deliver(comida);
		deliver(bebida);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisualWorld.start("mission2_5.dat", M2_5.class);

	}

}
