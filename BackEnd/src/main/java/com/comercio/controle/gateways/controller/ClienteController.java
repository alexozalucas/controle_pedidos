package com.comercio.controle.gateways.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.comercio.controle.domain.Cliente;
import com.comercio.controle.usecase.ClienteSalvarUserCase;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

	@Autowired
	private ClienteSalvarUserCase clienteSalvarUserCase;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente salve(@RequestBody @Valid Cliente client) {

		return this.clienteSalvarUserCase.salvar(client);
	}
	
	
	@GetMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente get(@RequestBody @Valid Cliente client) {

		// TODO falta implementar
		return null;
	}

}
