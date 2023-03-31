package br.com.reidobolo.clientepedido.cliente.application.service;

import javax.validation.Valid;

import br.com.reidobolo.clientepedido.cliente.application.api.ClienteRequest;
import br.com.reidobolo.clientepedido.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(@Valid ClienteRequest clienteRequest);
}
