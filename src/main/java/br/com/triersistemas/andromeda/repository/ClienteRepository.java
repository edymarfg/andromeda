package br.com.triersistemas.andromeda.repository;

import br.com.triersistemas.andromeda.domain.Cliente;
import br.com.triersistemas.andromeda.domain.Produto;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ClienteRepository {
    List<Cliente> consultar();
    Optional<Cliente> consultar(UUID id);
    void cadastrar(Cliente cliente);
    void excluir(Cliente cliente);
}
