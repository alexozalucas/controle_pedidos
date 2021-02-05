package com.comercio.controle.gateways.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.comercio.controle.domain.Cliente;
import com.comercio.controle.gateways.database.repository.ClienteRepository;

@Repository
public class ClienteDataBaseGatewaysImp implements ClienteDataBaseGateways {

	@Autowired
	private ClienteRepository clienteRepository;
	
	
	public Cliente salvar(Cliente cliente) {
		
		return clienteRepository.save(cliente);
	}

}
