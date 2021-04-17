package vw.br.project3ti.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestaAluguel {
	
	@Test
	public void testaTotalDoAluguel() {
		
		Carro carro = new Carro("Duster", "Renalt", 2021, 95000.00, 3500.00, new Categoria("SUV"), Opcao.ALUGUEL);
		Item item = new Item(carro, 1);		
		Aluguel aluguel = new Aluguel();
		
		aluguel.addItem(item);
		
		assertEquals(35000.00, aluguel.calculaValorTotal(10));
	}

}
