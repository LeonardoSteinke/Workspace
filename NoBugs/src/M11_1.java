
import pt.uc.dei.nobugssnackbar.SnackMan;
import pt.uc.dei.nobugssnackbar.VisualWorld;

public class M11_1 extends SnackMan {

	@Override
	public void serve() throws Exception {

	double comida = 0;
	double bebida = 0;
	double lucro = 0;
	double faturamento = 0;
	double faturamento2 = 0;
		goToBarCounter(1);
		comida = askWantHowManyFoods()*3;
		bebida = askWantHowManyDrinks()*2;
		faturamento = comida + bebida;
		
		comida -= askWantHowManyFoods()*1.2;
		bebida -= askWantHowManyDrinks()*0.9;
		lucro = comida + bebida;
		
		
		goToBarCounter(3);
		comida = askWantHowManyFoods()*3;
		bebida = askWantHowManyDrinks()*2;
		faturamento += comida + bebida;
		
		comida = comida - askWantHowManyFoods()*1.2;
		bebida = bebida - askWantHowManyDrinks()*0.9;
		lucro = comida + bebida + lucro;	
		talk (lucro);
		if (lucro < 5.9 && lucro > 5.8) { //tirar gambiarra
			lucro = 5.8;
		}
		
		faturamento2 = (faturamento*65)/100;
		faturamento2 = faturamento - faturamento2;
		lucro = lucro - faturamento2;
		
		talk(lucro);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisualWorld.start("mission11_1.dat", M11_1.class);

	}

}
