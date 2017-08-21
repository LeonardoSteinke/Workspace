
import pt.uc.dei.nobugssnackbar.SnackMan;
import pt.uc.dei.nobugssnackbar.VisualWorld;

public class M3_2 extends SnackMan {

	@Override
	public void serve() throws Exception {
		int valorDoPedido = 0;
		int dinheiro = 0;
		
		goToBarCounter(2);
		valorDoPedido = askWantHowManyFoods() * 2;
		dinheiro = cashIn(valorDoPedido);
		talk(dinheiro);
		
	}

	public static void main(String[] args) {
		VisualWorld.start("mission3_2.dat", M3_2.class);

	}

}
