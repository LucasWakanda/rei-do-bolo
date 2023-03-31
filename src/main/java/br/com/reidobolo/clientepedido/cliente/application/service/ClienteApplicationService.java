package br.com.reidobolo.clientepedido.cliente.application.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.reidobolo.clientepedido.cliente.application.api.ClienteRequest;
import br.com.reidobolo.clientepedido.cliente.application.api.ClienteResponse;
import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
public class ClienteApplicationService implements ClienteService {

	@Override
	public ClienteResponse criaCliente(@Valid ClienteRequest clienteRequest) {
		log.info("[Start]ClienteApplicationService criaCliente");
		log.info("[finish]ClienteApplicationService criaCliente");
		return null;
	}

}
