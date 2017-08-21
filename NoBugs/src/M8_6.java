import pt.uc.dei.nobugssnackbar.SnackMan;
import pt.uc.dei.nobugssnackbar.VisualWorld;

public class M8_6 extends SnackMan {

	@Override
	public void serve() throws Exception {
		int divisor = 0;
		int cachorro = 0;
		for (int i = 1; 1 <= 3; i += 1) {
			goToBarCounter(i);
			if (askWantHowManyFoods() == 0) {
				divisor = divisor + 0;
			} else {
				divisor = divisor + 1;
				cachorro = askWantHowManyFoods() + cachorro;
			}
			if (divisor == 0) {
				divisor = 1;
			}
			if (i == 3) {
				talk(cachorro/divisor);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisualWorld.start("mission8_6.dat", M8_6.class);

	}

}
