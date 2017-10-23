public class Carro {

	public String modelo;
	public int ano;
	public int qtdMetal;

	public boolean montarCarro(Montadora montadora, int qtd) {
		if (montadora.temMetal(qtd) == true) {
			System.out.println("Carro montado com sucesso\n-------------------------------------------");
			return true;
		} else {
			System.out.println("Não foi possivel montar o carro\n-------------------------------------------");
			return false;
		}
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getQtdMetal() {
		return qtdMetal;
	}

	public void setQtdMetal(int qtdMetal) {
		this.qtdMetal = qtdMetal;
	}
}
