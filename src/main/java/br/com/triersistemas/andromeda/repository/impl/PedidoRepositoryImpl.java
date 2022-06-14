package br.com.triersistemas.andromeda.repository.impl;

import br.com.triersistemas.andromeda.domain.Pedido;
import br.com.triersistemas.andromeda.domain.Produto;
import br.com.triersistemas.andromeda.repository.PedidoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class PedidoRepositoryImpl implements PedidoRepository {

    private static final List<Pedido> LIST = new ArrayList<>();

    @Override
    public List<Pedido> consultar() {
        return null;
    }

    @Override
    public Optional<Pedido> consultar(UUID id) {
        return Optional.empty();
    }

    @Override
    public void cadastrar(Pedido pedido) {

    }

    @Override
    public void adicionarProdutos(List<Produto> produtos) {

    }

    @Override
    public void removerProduto(UUID id) {

    }

    @Override
    public void excluir(Pedido pedido) {

    }
}
