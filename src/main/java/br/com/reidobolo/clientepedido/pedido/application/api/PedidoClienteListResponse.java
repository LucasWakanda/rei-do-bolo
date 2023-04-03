package br.com.reidobolo.clientepedido.pedido.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.reidobolo.clientepedido.pedido.domain.Pedido;
import br.com.reidobolo.clientepedido.pedido.domain.Sabor;
import lombok.Value;
@Value
public class PedidoClienteListResponse {
	private Sabor sabor;
	private UUID idPedido;
	private int quantidade;
	
	
	
	public static List<PedidoClienteListResponse> converte(List<Pedido> pedidosDoCliente) {
		return pedidosDoCliente.stream()
				.map(PedidoClienteListResponse::new)
				.collect(Collectors.toList());
	}

	public PedidoClienteListResponse(Pedido pedido) {
		this.idPedido = pedido.getIdClientePedido();
		this.sabor = pedido.getSabor();
		this.quantidade = pedido.getQuantidade();
	}
}
