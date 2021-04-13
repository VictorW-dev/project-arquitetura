package vw.br.project3ti.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestaClientePessoaJuridica {
	
	@Test
	public void testaClientePjTemCnpjRazaoSocial() {
		
		ClientePessoaJuridica cliente = new ClientePessoaJuridica("14.123.365/0001-36", "VeA Cars", "87 99999-9999");
		
		assertEquals("14.123.365/0001-36", cliente.getCnpj());
		assertEquals("VeA Cars", cliente.getRazaoSocial());
		assertEquals("87 99999-9999", cliente.getTelefone());
		
	}

}
