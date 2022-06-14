package br.com.triersistemas.andromeda.repository;

import br.com.triersistemas.andromeda.domain.Fornecedor;
import br.com.triersistemas.andromeda.domain.Pedido;
import br.com.triersistemas.andromeda.domain.Produto;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PedidoRepository {

    List<Pedido> consultar();
    Optional<Pedido> consultar(UUID id);
    void cadastrar(Pedido pedido);
    void adicionarProdutos(List<Produto> produtos);
    void removerProduto(UUID id);
    void excluir(Pedido pedido);
}
