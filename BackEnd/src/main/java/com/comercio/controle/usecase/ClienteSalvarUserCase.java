package com.comercio.controle.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comercio.controle.domain.Cliente;
import com.comercio.controle.gateways.database.ClienteDataBaseGateways;

@Service
public class ClienteSalvarUserCase {
	
	@Autowired
	private ClienteDataBaseGateways clienteDataBaseGateways;
	
	public Cliente salvar(Cliente cliente) {
		
		return clienteDataBaseGateways.salvar(cliente);
	}
	

}
