package br.com.reidobolo.clientepedido.pedido.application.api;

import java.util.UUID;

import br.com.reidobolo.clientepedido.pedido.domain.Pedido;
import br.com.reidobolo.clientepedido.pedido.domain.Sabor;
import lombok.Value;

@Value
public class PedidoClienteDetalhadoResponse {
	
	private UUID idPedido;
	private Sabor sabor;
	private int quantidade;
	
	public PedidoClienteDetalhadoResponse(Pedido pedido) {
		this.idPedido = pedido.getIdPedido();
		this.sabor = pedido.getSabor();
		this.quantidade = pedido.getQuantidade();	
	}	

}