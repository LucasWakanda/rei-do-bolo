package br.com.reidobolo.clientepedido.cliente.application.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.reidobolo.clientepedido.cliente.domain.Cliente;

public interface ClienteSpringJPARepository extends JpaRepository<Cliente, UUID>{
}
