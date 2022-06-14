package br.com.triersistemas.andromeda.repository.impl;

import br.com.triersistemas.andromeda.domain.Cliente;
import br.com.triersistemas.andromeda.domain.Produto;
import br.com.triersistemas.andromeda.repository.ClienteRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ClienteRepositoryImpl implements ClienteRepository {

    private static final List<Cliente> LIST = new ArrayList<>();

    @Override
    public List<Cliente> consultar() {
        return LIST;
    }

    @Override
    public Optional<Cliente> consultar(UUID id) {
        return LIST.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();
    }

    @Override
    public void cadastrar(Cliente cliente) {
        LIST.add(cliente);
    }

    @Override
    public void excluir(Cliente cliente) {
        LIST.remove(cliente);
    }
}
