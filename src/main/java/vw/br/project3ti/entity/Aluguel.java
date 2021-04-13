package vw.br.project3ti.entity;

import java.util.ArrayList;
import java.util.List;

public class Aluguel {
	
List<Item> itens = new ArrayList<>();
	
	public boolean addItem(Item item) {
		if (!itens.contains(item)) {
			itens.add(item);
			return true;
		}
		return false;
	}
	
	public double calculaValorTotal(int quantDias) {
		var valorTotal = 0.0;
		for (Item item : itens) {
			valorTotal += item.getCarro().getPrecoAluguel() * quantDias; 
		}
		return valorTotal;
	}

}
