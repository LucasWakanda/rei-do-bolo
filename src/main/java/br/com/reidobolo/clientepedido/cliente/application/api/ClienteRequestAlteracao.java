package br.com.reidobolo.clientepedido.cliente.application.api;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import br.com.reidobolo.clientepedido.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteRequestAlteracao {
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	@NotBlank
	private String telefone;
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	@NotNull
	private LocalDate dataNascimento;
}
