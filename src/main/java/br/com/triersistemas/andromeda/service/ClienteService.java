package br.com.triersistemas.andromeda.service;

import br.com.triersistemas.andromeda.domain.Cliente;
import br.com.triersistemas.andromeda.model.ClienteModel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

public interface ClienteService {
    List<Cliente> consultar();
    Cliente consultar(UUID id);
    Cliente cadastrar(ClienteModel model);
    Cliente alterar(UUID id, ClienteModel model);
    Cliente remover(UUID id);
}
