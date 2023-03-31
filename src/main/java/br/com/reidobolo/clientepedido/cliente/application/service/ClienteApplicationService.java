package br.com.reidobolo.clientepedido.cliente.application.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.reidobolo.clientepedido.cliente.application.api.ClienteRequest;
import br.com.reidobolo.clientepedido.cliente.application.api.ClienteResponse;
import br.com.reidobolo.clientepedido.cliente.application.repository.ClienteRepository;
import br.com.reidobolo.clientepedido.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {

	private final  ClienteRepository clienteRepository;

	@Override
	public ClienteResponse criaCliente(@Valid ClienteRequest clienteRequest) {
		log.info("[Start]ClienteApplicationService criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finish]ClienteApplicationService criaCliente");
		return ClienteResponse.builder()
				.idCliente(cliente.getIdCliente())
				.build();
	}
}
