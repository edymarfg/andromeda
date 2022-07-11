package br.com.triersistemas.andromeda.service;

import br.com.triersistemas.andromeda.domain.Cliente;
import br.com.triersistemas.andromeda.model.ClienteModel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

public interface ClienteService {
    List<ClienteModel> consultar();
    ClienteModel consultar(UUID id);
    ClienteModel cadastrar(ClienteModel model);
    ClienteModel alterar(ClienteModel model);
    ClienteModel remover(UUID id);
}
