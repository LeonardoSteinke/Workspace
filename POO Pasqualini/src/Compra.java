import java.util.ArrayList;
import java.util.List;

public class Compra {
	public static void main(String[] args) {
		List<Compra> compras = new ArrayList<Compra>();
		ExemploCompra compra = new ExemploCompra();
		compra.setProduto("Camiseta XPTO - TAM M");
		compra.setPrecoUnitario(140.0);
		compra.setQuantidade(2);
		compra.setEnderecoEntrega("Rua Getúlio Vargas, 200 - Ibirama, SC - 8914000");
		compra.setStatus("Pedido realizado");
		
		compras.add(compra);
		ExemploCompra compra2 = new ExemploCompra("Tenis ABC 42", 300, 1, "Caixa postal 27 - 8914000", "pagamento comfirmado");
		compras.add(compra2);
		
		for (int i = 0; i < compras.size(); i++) {
			Compra c = compras.get(1);
			System.out.println("compra: "+ c.getProduto()+" a "+ c.getPrecoUnitario()+ "/unidade, totalizando "+c.valorTotal()+".");
		}
		
	}

}
