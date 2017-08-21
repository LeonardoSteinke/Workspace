
import pt.uc.dei.nobugssnackbar.Order;
import pt.uc.dei.nobugssnackbar.SnackMan;
import pt.uc.dei.nobugssnackbar.VisualWorld;


public class M2_6 extends SnackMan {

	@Override
	public void serve() throws Exception {
		int qtasBebidas = 0;
		goToBarCounter(1);
		Order comida = askForFood();
		goToDisplay();
		comida = pickUpHotDog(comida);
		goToBarCounter(1);
		qtasBebidas = askWantHowManyDrinks();
		deliver(comida);
		goToBarCounter(3);
		Order comida2 = askForFood();
		goToDisplay();
		comida2 = pickUpHotDog(comida2);
		goToBarCounter(3);
		qtasBebidas += askWantHowManyDrinks();
		deliver(comida2);
		talk(qtasBebidas);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisualWorld.start("mission2_6.dat", M2_6.class);

	}

}
