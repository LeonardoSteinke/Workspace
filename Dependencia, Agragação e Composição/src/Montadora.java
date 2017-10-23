import java.util.ArrayList;

public class Montadora {
	// Dependência
	int metal;
	String empresa;

	public boolean temMetal(int qtd) {
		if (qtd <= metal) {
			metal -= qtd;
			return true;
		} else {
			return false;
		}
	}

	// Agregação
	String cargo;

	private ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();

	public ArrayList<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario.add(funcionario);
	}

	// Composição
	private Maquina maquina;

	private ArrayList<Maquina> maq = new ArrayList<Maquina>();
	
	public void addMaquina(String modelo, double potencia) {
		maquina = new Maquina();
		
		maquina.setModelo(modelo);
		maquina.setPotencia(potencia);
		this.maq.add(maquina);
	}
	public ArrayList<Maquina> getMaquina(){
		return maq;
	}
	public void setMaq(Maquina maq){
		this.maq.add(maq);
	}


	// Getters and Setters
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getMetal() {
		return metal;
	}

	public void setMetal(int metal) {
		this.metal = metal;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
}
