package br.com.triersistemas.andromeda.controller;

import br.com.triersistemas.andromeda.domain.Farmaceutico;
import br.com.triersistemas.andromeda.domain.Fornecedor;
import br.com.triersistemas.andromeda.model.FarmaceuticoModel;
import br.com.triersistemas.andromeda.model.FornecedorModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
        FORNECEDORES.add(new Fornecedor(model.getNome(), model.getNiver(), model.getCnpj()));
        return FORNECEDORES;
    }

    @PostMapping("/cadastro")
    public List<Fornecedor> cadastro() {
        FORNECEDORES.add(new Fornecedor());
        return FORNECEDORES;
    }

    @PutMapping("/alterar/{index}")
    public List<Fornecedor> alterar(@PathVariable int index, @RequestBody FornecedorModel model) {
        FORNECEDORES.remove(index);
        FORNECEDORES.add(new Fornecedor(model.getNome(), model.getNiver(), model.getCnpj()));
        return FORNECEDORES;
    }

    @DeleteMapping("/remover/{index}")
    public List<Fornecedor> remover(@PathVariable int index) {
        FORNECEDORES.remove(index);
        return FORNECEDORES;
    }

}
