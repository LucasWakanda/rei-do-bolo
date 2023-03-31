package br.com.reidobolo.clientepedido.cliente.application.infra;

import org.springframework.stereotype.Repository;

import br.com.reidobolo.clientepedido.cliente.application.repository.ClienteRepository;
import br.com.reidobolo.clientepedido.cliente.domain.Cliente;
import lombok.extern.log4j.Log4j2;
@Log4j2
@Repository
public class ClienteInfraRepository implements ClienteRepository {

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[Start]ClienteInfraRepository salva");
		log.info("[finish]ClienteInfraRepository salva");
		return cliente;
	}

}
