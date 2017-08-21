import pt.uc.dei.nobugssnackbar.SnackMan;
import pt.uc.dei.nobugssnackbar.VisualWorld;


public class M1_1 extends SnackMan {

	@Override
	public void serve() throws Exception {
		goToBarCounter(1);
		goToBarCounter(3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisualWorld.start("mission1_1.dat", M1_1.class);

	}

}
