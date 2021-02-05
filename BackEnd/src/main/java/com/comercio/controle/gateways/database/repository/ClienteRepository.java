package com.comercio.controle.gateways.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comercio.controle.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	

}
