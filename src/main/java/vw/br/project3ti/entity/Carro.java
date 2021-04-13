package vw.br.project3ti.entity;

public class Carro {
	
	private String nome;
	private String marca;
	private int ano;
	private double precoVenda;
	private double precoAluguel;
	private Categoria categoria;
	private String compraOuAluguel;
	
	public Carro(String nome, String marca, int ano, double precoVenda, double precoAluguel, Categoria categoria,
			String compraOuAluguel) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.ano = ano;
		this.precoVenda = precoVenda;
		this.precoAluguel = precoAluguel;
		this.categoria = categoria;
		this.compraOuAluguel = compraOuAluguel;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	public double getPrecoAluguel() {
		return precoAluguel;
	}
	public void setPrecoAluguel(double precoAluguel) {
		this.precoAluguel = precoAluguel;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public String getCompraOuAluguel() {
		return compraOuAluguel;
	}
	public void setCompraOuAluguel(String compraOuAluguel) {
		this.compraOuAluguel = compraOuAluguel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ano;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((compraOuAluguel == null) ? 0 : compraOuAluguel.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(precoAluguel);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(precoVenda);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Carro other = (Carro) obj;
		if (ano != other.ano)
			return false;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (compraOuAluguel == null) {
			if (other.compraOuAluguel != null)
				return false;
		} else if (!compraOuAluguel.equals(other.compraOuAluguel))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(precoAluguel) != Double.doubleToLongBits(other.precoAluguel))
			return false;
		if (Double.doubleToLongBits(precoVenda) != Double.doubleToLongBits(other.precoVenda))
			return false;
		return true;
	}
	
}
