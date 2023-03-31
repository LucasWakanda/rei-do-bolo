package br.com.reidobolo.clientepedido.cliente.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.reidobolo.clientepedido.cliente.application.api.ClienteDetalhadoResponse;
import br.com.reidobolo.clientepedido.cliente.application.api.ClienteListResponse;
import br.com.reidobolo.clientepedido.cliente.application.api.ClienteRequest;
import br.com.reidobolo.clientepedido.cliente.application.api.ClienteResponse;
import br.com.reidobolo.clientepedido.cliente.application.repository.ClienteRepository;
import br.com.reidobolo.clientepedido.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {

	private final  ClienteRepository clienteRepository;

	@Override
	public ClienteResponse criaCliente(@Valid ClienteRequest clienteRequest) {
		log.info("[Start]ClienteApplicationService criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finish]ClienteApplicationService criaCliente");
		return ClienteResponse.builder()
				.idCliente(cliente.getIdCliente())
				.build();
	}

	@Override
	public List<ClienteListResponse> buscaTodosClientes() {
		log.info("[inicia] ClienteApplicationService -  buscaTodosClientes ");
		List<Cliente> clientes = clienteRepository.buscaTodosClientes();
		log.info("[finaliza] ClienteApplicationService -  buscaTodosClientes ");
		return ClienteListResponse.converte(clientes);
	}
		@Override
		public ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente) {
			log.info("[inicia] ClienteApplicationService -  buscaClienteAtravesId ");
			Cliente cliente = clienteRepository.buscaClienteAtravesId(idCliente);
			log.info("[finaliza] ClienteApplicationService -  buscaClienteAtravesId ");
			return new ClienteDetalhadoResponse(cliente);
		}

		@Override
		public void deletaClienteAtravesId(UUID idCliente) {
			log.info("[inicia] ClienteApplicationService -  deletaClienteAtravesId ");
			Cliente cliente = clienteRepository.buscaClienteAtravesId(idCliente);
			clienteRepository.deletaCliente(cliente);
			log.info("[finaliza] ClienteApplicationService -  deletaClienteAtravesId ");
	}
}
