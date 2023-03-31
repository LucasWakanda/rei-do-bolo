package br.com.reidobolo.clientepedido.cliente.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.reidobolo.clientepedido.cliente.domain.Cliente;
import lombok.Value;

@Value
public class ClienteListResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String telefone;
	private String cpf;
	

	public ClienteListResponse(Cliente cliente) {
		super();
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.telefone = cliente.getTelefone();
		this.cpf = cliente.getCpf();
	}


	public static List<ClienteListResponse> converte(List<Cliente> clientes) {
		return clientes.stream().map(ClienteListResponse::new).collect(Collectors.toList());


	}
}
