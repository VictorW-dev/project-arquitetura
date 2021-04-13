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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carro == null) ? 0 : carro.hashCode());
		result = prime * result + quantidade;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (carro == null) {
			if (other.carro != null)
				return false;
		} else if (!carro.equals(other.carro))
			return false;
		if (quantidade != other.quantidade)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Item [carro = " + carro + ", quantidade=" + quantidade + "]";
	}
}
