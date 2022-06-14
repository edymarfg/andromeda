package br.com.triersistemas.andromeda.repository;

import br.com.triersistemas.andromeda.domain.Cliente;
import br.com.triersistemas.andromeda.domain.Farmaceutico;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface FarmaceuticoRepository {

    List<Farmaceutico> consultar();
    Optional<Farmaceutico> consultar(UUID id);
    void cadastrar(Farmaceutico farmaceutico);
    void excluir(Farmaceutico farmaceutico);
}
