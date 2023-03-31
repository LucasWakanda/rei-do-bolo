package br.com.reidobolo.clientepedido.cliente.application.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {

	@Override
	public ClienteResponse postCliente(@Valid ClienteRequest clenteRequest) {
		log.info("[Start]ClienteController postCliente");
		log.info("[finish]ClienteController postCliente");
		return null;
		
	}

}
