package vw.br.project3ti.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestaVendas {
	
	@Test
	public void testaTotalDaVenda() {
		
		Carro carro = new Carro("Duster", "Renalt", 2021, 95000.00, 3500.00, new Categoria("SUV"), "Compra");
		Item item = new Item(carro, 1);		
		Venda venda = new Venda();
		
		venda.addItem(item);
		
		assertEquals(95000.00, venda.calculaValorTotal());
		
	}

}
