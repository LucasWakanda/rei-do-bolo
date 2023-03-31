package br.com.reidobolo.clientepedido.cliente.application.api;

import java.util.UUID;

import lombok.Value;

@Value
public class ClienteListResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String telefone;
	private String cpf;
}
