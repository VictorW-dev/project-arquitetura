package vw.br.project3ti.entity;

import java.util.ArrayList;
import java.util.List;

public class Venda {

	List<Item> itens = new ArrayList<>();
	
	public boolean addItem(Item item) {
		if (!itens.contains(item)) {
			itens.add(item);
			return true;
		}
		return false;
	}
	
	public double calculaValorTotal() {
		var valorTotal = 0.0;
		for (Item item : itens) {
			valorTotal += item.getCarro().getPrecoVenda() * item.getQuantidade(); 
		}
		return valorTotal;
	}
	
}
