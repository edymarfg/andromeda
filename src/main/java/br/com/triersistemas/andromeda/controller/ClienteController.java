package br.com.triersistemas.andromeda.controller;

import br.com.triersistemas.andromeda.domain.Cliente;
import br.com.triersistemas.andromeda.exceptions.NaoExisteException;
import br.com.triersistemas.andromeda.model.ClienteModel;
import br.com.triersistemas.andromeda.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/consultar")
    public List<ClienteModel> consultar() {
        return clienteService.consultar();
    }

    @GetMapping("/consultar/{id}")
    public ClienteModel consultarPorId(@PathVariable UUID id){
        return clienteService.consultar(id);
    }

    @PostMapping("/cadastrar")
    public ClienteModel cadastrar(@RequestBody ClienteModel model) {
        return clienteService.cadastrar(model);
    }

    @PutMapping("/alterar")
    public ClienteModel alterar(@RequestBody ClienteModel model) {
        return clienteService.alterar(model);
    }

    @DeleteMapping("/remover/{id}")
    public ClienteModel remover(@PathVariable UUID id) {
        return clienteService.remover(id);
    }
}
