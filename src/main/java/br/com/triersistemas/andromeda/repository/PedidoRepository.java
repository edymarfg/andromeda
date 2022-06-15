package br.com.triersistemas.andromeda.repository;

import br.com.triersistemas.andromeda.domain.Pedido;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PedidoRepository {
    List<Pedido> consultar();
    Optional<Pedido> consultar(UUID id);
    void cadastrar(Pedido pedido);
    void excluir(Pedido pedido);
}