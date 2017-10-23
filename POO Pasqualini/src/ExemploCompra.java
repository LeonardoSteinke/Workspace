
public class ExemploCompra {
	private String produto;
	private double precoUnitario;
	private String enderecoEntrega;
	private int quantidade;
	private String status;

	public ExemploCompra(){}

	public ExemploCompra(String produto, double precoUnitario, int quantidade, String enderecoEntrega, String status){
	this.produto = produto;
	this.precoUnitario = precoUnitario;
	this.quantidade = quantidade;
	this.enderecoEntrega = enderecoEntrega;
	this.status = status;
}
	public double valorTotal() {
		return this.precoUnitario * this.quantidade;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
