package br.com.reidobolo.clientepedido.pedido.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class PedidoResponse {
	private UUID idPedido;
}