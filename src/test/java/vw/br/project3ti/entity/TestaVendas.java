package vw.br.project3ti.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import vw.br.project3ti.service.VendaService;

public class TestaVendas {
	
	Venda venda;
	Carro carro;
	Item item;
	VendaService vendaService;
	
	@BeforeEach
	public void initialize() {
		carro = new Carro("Duster", "Renalt", 2021, 95000.00, 3500.00, new Categoria("SUV"), Opcao.COMPRA);
		item = new Item(carro, 2);
		venda = new Venda();
		vendaService = new VendaService(venda);
	}
	
	@Test
	public void testaTotalDaVenda() {
		
		Carro carro2 = new Carro("Duster Oroch", "Renalt", 2021, 100000.00, 50000.00, new Categoria("SUV"), Opcao.COMPRA);
		Item item2 = new Item(carro2, 1);	
		item.setQuantidade(3);
		venda.addItem(item);
		venda.addItem(item2);
		
		assertEquals(385000.00, venda.calculaValorTotal());
		System.out.println("Valor total da compra: " + venda.calculaValorTotal());
	}
	
	@Test
	public void testaInsercaoDeProdutosIguaisNaVenda() {
		venda.addItem(item);
		venda.addItem(item);
		venda.addItem(item);
		venda.addItem(item);
		venda.addItem(item);

		assertEquals(1, venda.listaItens().size());

	}
	
	@Test
	public void testaQuantidadeDeItens() {
		venda.addItem(item);
		venda.addItem(item);
		venda.addItem(item);
		venda.addItem(item);

		assertEquals(5, venda.listaItens().get(0).getQuantidade());
	}
	
	@Test
	public void testaSeProdutoExisteNaVenda() {

		Item item2 = new Item(new Carro("Kwid", "Renault", 2021, 52000.00, 25000.00, new Categoria("Compacto"), Opcao.COMPRA), 1);

		assertThrows(UnsupportedOperationException.class, () -> venda.listaItens().add(item2));
		assertEquals(false, venda.tem(item2));

	}

}
