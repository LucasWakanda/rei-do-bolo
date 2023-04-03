package br.com.reidobolo.clientepedido.cliente.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.reidobolo.clientepedido.cliente.domain.Cliente;
import br.com.reidobolo.clientepedido.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	public ClienteDetalhadoResponse(Cliente cliente) {
		super();
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.email = cliente.getEmail();
		this.telefone = cliente.getTelefone();
		this.sexo = cliente.getSexo();
		this.dataNascimento = cliente.getDataNascimento();
		this.cpf = cliente.getCpf();
		this.dataHoraDoCadastro = cliente.getDataHoraDoCadastro();
	}
	private UUID idCliente;
	private String nomeCompleto;
	private String  email;
	private String telefone;
	private Sexo sexo;
	private LocalDate dataNascimento;
	private String cpf;
	private LocalDateTime dataHoraDoCadastro;
}
