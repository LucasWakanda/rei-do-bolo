package br.com.reidobolo.clientepedido.cliente.infra;

import org.springframework.stereotype.Repository;

import br.com.reidobolo.clientepedido.cliente.application.repository.ClienteRepository;
import br.com.reidobolo.clientepedido.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Log4j2
@Repository
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {

	private final ClienteSpringDataJPARepository clienteSpringDataJPARepository;

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[Start]ClienteInfraRepository salva");
		clienteSpringDataJPARepository.save(cliente);
		log.info("[finish]ClienteInfraRepository salva");
		return cliente;
	}

}
