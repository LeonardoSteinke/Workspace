import pt.uc.dei.nobugssnackbar.SnackMan;
import pt.uc.dei.nobugssnackbar.VisualWorld;

public class M5_11 extends SnackMan {

	@Override
	public void serve() throws Exception {
		int valorcachorro = 3;
		int valorbebida = 4;
		goToBarCounter(2);
		askHasHunger();
		askHasThirsty();
		if (askHasHunger() == true && askHasThirsty() == true) {
			valorcachorro = 1;
			valorbebida = 1;
		}
		if (askHasThirsty() == true && askHasHunger() == false && askWantHowManyDrinks() > 1) {
			valorbebida = 3;	
		}
		if (askHasHunger() == true && askHasThirsty() == false && askWantHowManyFoods() > 1) {
			valorcachorro = 2;			
		}
		talk (valorcachorro);
		talk (valorbebida);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisualWorld.start("mission5_11.dat", M5_11.class);

	}

}
