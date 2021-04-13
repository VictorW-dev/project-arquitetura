package vw.br.project3ti.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Venda {

	private List<Item> itens = new ArrayList<>();
	private FormaPagamento formaPagamento = FormaPagamento.CREDITO;
	
	public void addItem(Item item) {
		if (!itens.contains(item)) {
			itens.add(item);
		} else {
			for (Item it : itens) {
				if (it.equals(item)) {
					it.setQuantidade(it.getQuantidade() + 1);
				}
			}
		}
	}
	
	public double calculaValorTotal() {
		var valorTotal = 0.0;
		for (Item item : itens) {
			valorTotal += item.getCarro().getPrecoVenda() * item.getQuantidade(); 
		}
		return valorTotal;
	}
	
	public List<Item> listaItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public boolean tem(Item item) {

		return itens.contains(item);
	}
	
	public void setFormaPagmento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}
	
}
