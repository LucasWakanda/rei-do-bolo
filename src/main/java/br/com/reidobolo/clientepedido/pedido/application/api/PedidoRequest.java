package br.com.reidobolo.clientepedido.pedido.application.api;

import br.com.reidobolo.clientepedido.pedido.domain.Sabor;
import lombok.Value;
@Value
public class PedidoRequest {
	private Sabor sabor;
	private int quantidade;
}
