package Po;

public class Carro {
	protected int velocidade;
	public String modelo;
	protected String cor;
	protected boolean ligado;
	
	public void status(){
		System.out.println("Velocidade do "+ this.modelo+ " é: "+ this.velocidade+ "km/h");
		
	}
	public void velocidade(int velocidade){
		this.velocidade = velocidade;
	}
	
}
