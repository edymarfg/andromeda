package br.com.triersistemas.andromeda.repository;

import br.com.triersistemas.andromeda.domain.Farmaceutico;
import br.com.triersistemas.andromeda.domain.Fornecedor;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface FornecedorRepository {

    List<Fornecedor> consultar();
    Optional<Fornecedor> consultar(UUID id);
    void cadastrar(Fornecedor fornecedor);
    void excluir(Fornecedor fornecedor);
}
