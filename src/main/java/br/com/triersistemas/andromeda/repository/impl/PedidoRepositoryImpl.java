package br.com.triersistemas.andromeda.repository.impl;

import br.com.triersistemas.andromeda.domain.Pedido;
import br.com.triersistemas.andromeda.repository.PedidoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class PedidoRepositoryImpl implements PedidoRepository {

    private static final List<Pedido> LIST = new ArrayList<>();

    @Override
    public List<Pedido> consultar() {
        return LIST;
    }

    @Override
    public Optional<Pedido> consultar(UUID id) {
        return LIST.stream().filter(pedido -> id.equals(pedido.getId())).findFirst();
    }

    @Override
    public void cadastrar(Pedido pedido) {
        LIST.add(pedido);
    }

    @Override
    public void excluir(Pedido pedido) {
        LIST.remove(pedido);
    }
}