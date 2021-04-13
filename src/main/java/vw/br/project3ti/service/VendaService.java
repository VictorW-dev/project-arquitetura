package vw.br.project3ti.service;

import vw.br.project3ti.entity.Venda;

public class VendaService {
	
	private Venda venda;

	public VendaService(Venda venda) {
		this.venda = venda;
	}
	
	public double pegaValorComReajuste() {
		var valorTotal = venda.calculaValorTotal();
		switch (venda.getFormaPagamento()) {
		case CREDITO:
			valorTotal += venda.calculaValorTotal() * 0.1;
			break;
		case DEBITO:
			valorTotal -= venda.calculaValorTotal() * 0.05;
			break;
		default:
			break;
		}
		return valorTotal;
	}

}
