import pt.uc.dei.nobugssnackbar.SnackMan;
import pt.uc.dei.nobugssnackbar.VisualWorld;

public class M5_9 extends SnackMan {

	@Override
	public void serve() throws Exception {
		int valorCobrar;
		int total;
		// TODO Auto-generated method stub
		goToBarCounter(1);
		if (askHasHunger() && askHasThirsty() == true) {
			valorCobrar = 4;
			total = 4;
		}else{
			valorCobrar = 3;
			total = 3;
		}
		cashIn(valorCobrar);
		
		goToBarCounter(3);
		if (askHasHunger() && askHasThirsty() == true) {
			valorCobrar = 4;
			total += 4;
		}else{
			valorCobrar = 3;
			total += 3;
		}
		cashIn(valorCobrar);
talk(total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisualWorld.start("mission5_9.dat", M5_9.class);

	}

}
