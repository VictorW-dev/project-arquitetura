package vw.br.project3ti.entity;

public class Item {
	
	private Carro carro;
	private int quantidade;
	
	public Item(Carro carro, int quantidade) {
		super();
		this.carro = carro;
		this.quantidade = quantidade;
	}
	
	public Carro getCarro() {
		return carro;
	}
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
