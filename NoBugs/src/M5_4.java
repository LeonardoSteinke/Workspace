import pt.uc.dei.nobugssnackbar.SnackMan;
import pt.uc.dei.nobugssnackbar.VisualWorld;

public class M5_4 extends SnackMan {

	@Override
	public void serve() throws Exception {
		int quantos = 0;
		// TODO Auto-generated method stub
		goToBarCounter(1);
		if (askHasHunger() == true) {
			quantos = quantos + 1;
		}
		goToBarCounter(2);
		if (askHasHunger() == true) {
			quantos = quantos + 1;
		}
		goToBarCounter(3);
		if (askHasHunger() == true) {
			quantos = quantos + 1;
		}
		talk(quantos);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisualWorld.start("mission5_4.dat", M5_4.class);

	}

}
