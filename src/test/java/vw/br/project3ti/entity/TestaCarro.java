package vw.br.project3ti.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestaCarro {
	
	@Test
	public void testaCarroTemNomeMarcaPrecos() { 
		
		Carro carro = new Carro("Duster", "Renault", 2021, 95000.00, 3500.00, new Categoria("SUV"), "Compra");
		
		assertEquals("Duster", carro.getNome());
		assertEquals("Renault", carro.getMarca());
		assertEquals(2021, carro.getAno());
		assertEquals(95000.00, carro.getPrecoVenda());
		assertEquals(3500.00, carro.getPrecoAluguel());
		
	}

}
