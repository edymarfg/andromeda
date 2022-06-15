package br.com.triersistemas.andromeda.repository;

import br.com.triersistemas.andromeda.domain.Produto;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProdutoRepository {
    List<Produto> consultar();
    Optional<Produto> consultar(UUID id);
    List<Produto> consultar(List<UUID> ids);
    void cadastrar(Produto produto);
    void excluir(Produto produto);
}
