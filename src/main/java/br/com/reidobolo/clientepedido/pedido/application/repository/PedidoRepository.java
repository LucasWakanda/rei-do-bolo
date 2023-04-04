package br.com.reidobolo.clientepedido.pedido.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.reidobolo.clientepedido.pedido.domain.Pedido;

public interface PedidoRepository {
	Pedido salvaPedido(Pedido pedido);
	List<Pedido> buscaPedidosDoClienteComId(UUID idCliente);
	Pedido buscaPedidoPeloId(UUID idPedido);
	void deletaPedido(Pedido pedido);
}

