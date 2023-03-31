package br.com.reidobolo.clientepedido.cliente.application.repository;

import br.com.reidobolo.clientepedido.cliente.domain.Cliente;
public interface ClienteRepository {
	Cliente salva(Cliente cliente);
}
