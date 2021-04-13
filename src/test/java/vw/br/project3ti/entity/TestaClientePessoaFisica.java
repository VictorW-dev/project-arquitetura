package vw.br.project3ti.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestaClientePessoaFisica {
	
	@Test
	public void testaClientePfTemNomeCpf() {
		ClientePessoaFisica cliente = new ClientePessoaFisica("Victor Winicius B Santos", "133.422.633-69", "23/12/2001",
				"87 99999-9999");
	
		assertEquals("Victor Winicius B Santos", cliente.getNome());
		assertEquals("133.422.633-69", cliente.getCpf());
		assertEquals("23/12/2001", cliente.getDataDeNascimento());
	}

}
