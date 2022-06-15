package br.com.triersistemas.andromeda.repository.impl;

import br.com.triersistemas.andromeda.domain.Farmaceutico;
import br.com.triersistemas.andromeda.repository.FarmaceuticoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository
public class FarmaceuticoRepositoryImpl implements FarmaceuticoRepository {

    private static final List<Farmaceutico> LIST = new ArrayList<>();

    @Override
    public List<Farmaceutico> consultar() {
        return LIST;
    }

    @Override
    public Optional<Farmaceutico> consultar(UUID id) {
        return LIST.stream()
                .filter(f -> f.getId().equals(id))
                .findFirst();
    }

    @Override
    public void cadastrar(Farmaceutico farmaceutico) {
        LIST.add(farmaceutico);
    }

    @Override
    public void excluir(Farmaceutico farmaceutico) {
        LIST.remove(farmaceutico);
    }
}
