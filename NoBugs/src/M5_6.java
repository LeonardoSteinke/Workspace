import pt.uc.dei.nobugssnackbar.SnackMan;
import pt.uc.dei.nobugssnackbar.VisualWorld;

public class M5_6 extends SnackMan {

	@Override
	public void serve() throws Exception {
		int valorbebida = 3;
		// TODO Auto-generated method stub
		goToBarCounter(2);
		if (askHasThirsty() == true) {
			if (askWantHowManyDrinks() >= 2) {
				valorbebida = 2;
			}
			valorbebida = askWantHowManyDrinks() * valorbebida;
		}else{
			valorbebida = 0;
		}	
		cashIn(valorbebida);
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisualWorld.start("mission5_6.dat", M5_6.class);
	}
}
