package br.com.triersistemas.andromeda.controller;

import br.com.triersistemas.andromeda.domain.Fornecedor;
import br.com.triersistemas.andromeda.model.FornecedorModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {

    private static final List<Fornecedor> FORNECEDORES = new ArrayList<>();

    @GetMapping("/consultar")
    public List<Fornecedor> consultar() {
        return FORNECEDORES;
    }

    @PostMapping("/cadastrar")
    public List<Fornecedor> cadastrar(@RequestBody FornecedorModel model) {
        FORNECEDORES.add(new Fornecedor(model.getNome(), model.getNiver(), model.getCnpj(), model.getId()));
        return FORNECEDORES;
    }

    @PostMapping("/cadastro")
    public List<Fornecedor> cadastro() {
        FORNECEDORES.add(new Fornecedor());
        return FORNECEDORES;
    }

    @PutMapping("/alterar/{id}")
    public List<Fornecedor> alterar(@PathVariable UUID id, @RequestBody FornecedorModel model) {
        FORNECEDORES.remove(id);
        FORNECEDORES.add(new Fornecedor(model.getNome(), model.getNiver(), model.getCnpj(), model.getId()));
        return FORNECEDORES;
    }

    @DeleteMapping("/remover/{id}")
    public List<Fornecedor> remover(@PathVariable UUID id) {
        FORNECEDORES.remove(id);
        return FORNECEDORES;
    }

}
