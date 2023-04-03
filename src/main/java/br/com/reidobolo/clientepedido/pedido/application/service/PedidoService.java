package br.com.reidobolo.clientepedido.pedido.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.reidobolo.clientepedido.pedido.application.api.PedidoClienteListResponse;
import br.com.reidobolo.clientepedido.pedido.application.api.PedidoRequest;
import br.com.reidobolo.clientepedido.pedido.application.api.PedidoResponse;

public interface PedidoService {
	PedidoResponse criaPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest);
	List<PedidoClienteListResponse> buscaPedidosDoClienteComId(UUID idCliente);
}
