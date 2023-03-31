package br.com.reidobolo.clientepedido.cliente.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.reidobolo.clientepedido.cliente.application.api.ClienteDetalhadoResponse;
import br.com.reidobolo.clientepedido.cliente.application.api.ClienteListResponse;
import br.com.reidobolo.clientepedido.cliente.application.api.ClienteRequest;
import br.com.reidobolo.clientepedido.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(@Valid ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
	void deletaClienteAtravesId(UUID idCliente);
}
