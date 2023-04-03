package br.com.reidobolo.clientepedido.pedido.application.api;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@RestController
@Log4j2
@RequiredArgsConstructor
public class PedidoControlller implements PedidoAPI {


	@Override
	public PedidoResponse postPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest) {
		log.info("[Start]ClienteController postPedido");
		log.info("[Start]ClienteController postPedido");
		return null;
	}

}
