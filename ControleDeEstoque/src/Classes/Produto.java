package Classes;

public class Produto {
	public String nome;
	public double preco;
	public int qtd;

	private double ValorTotal() {
		return preco * qtd;
	}
	
	public void AdicionarProduto(int quantidade) {
		this.qtd += quantidade;
	}
	
	public void RemoverProduto(int quantidade) {
		this.qtd -= quantidade;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return 	nome 
				+ ", R$ "
				+ String.format("%.2f", preco)
				+ " , "
				+ qtd
				+ " Unidades, total R$ "
				+ String.format("%.2f",ValorTotal());
	}
}
