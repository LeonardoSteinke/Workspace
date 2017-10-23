package Po;

public class Main {

	public static void main(String[] args) {
		Carro celta = new Carro();
		Carro pika = new Carro();
		Radar r = new Radar();
		
		celta.modelo = "celta 2012";
		celta.velocidade = 80;
		celta.status();
		pika.modelo = "carro pika";
		pika.velocidade(80);
		pika.status();
		if (pika.velocidade == celta.velocidade) {
			System.out.println("80 É 80 ARROMBADO");
		}
		r.velocidadeMaxima(celta.velocidade, 80);
		r.velocidadeMaxima(pika.velocidade, 80);
		
	}

}
