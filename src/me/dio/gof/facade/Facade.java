package me.dio.gof.facade;

import me.dio.gof.facade.subsistema1.crm.CrmService;
import me.dio.gof.facade.subsistema2.cep.CepApi;

public class Facade {

	public void migraCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperaCidade(cep);
		String estado = CepApi.getInstancia().recuperaEstado(cep);
		
		CrmService.gravaCliente(nome, cep, estado, cidade);
	}
	
}
