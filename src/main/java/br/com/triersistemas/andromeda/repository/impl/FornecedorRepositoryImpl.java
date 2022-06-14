package br.com.triersistemas.andromeda.repository.impl;

import br.com.triersistemas.andromeda.domain.Fornecedor;
import br.com.triersistemas.andromeda.repository.FornecedorRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class FornecedorRepositoryImpl implements FornecedorRepository {

    private static final List<Fornecedor> LIST = new ArrayList<>();

    @Override
    public List<Fornecedor> consultar() {
        return LIST;
    }

    @Override
    public Optional<Fornecedor> consultar(UUID id) {
        return LIST.stream()
                .filter(f -> f.getId().equals(id))
                .findFirst();
    }

    @Override
    public void cadastrar(Fornecedor fornecedor) {
        LIST.add(fornecedor);
    }

    @Override
    public void excluir(Fornecedor fornecedor) {
        LIST.remove(fornecedor);
    }
}
