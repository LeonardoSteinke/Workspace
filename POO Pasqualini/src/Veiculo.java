
public class Veiculo {
		
	private String modelo;
	private String marca;
	private int ano;
	private double potencia;
	private boolean arCondicionado;
	public Veiculo(String marca, String modelo){
		this.marca = marca;
		this.modelo = modelo;
	}
	public Veiculo(){
		
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public boolean isArCondicionado() {
		return arCondicionado;
	}
	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	public void buzina(){
		System.out.println("FARAHH");
	}
	public double calcularImposto(){
		if (ano < 2010) {
			return 500;
		}else{
			return 700;
		}
	}
}
