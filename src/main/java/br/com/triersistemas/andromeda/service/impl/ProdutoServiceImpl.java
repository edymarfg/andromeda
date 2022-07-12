package br.com.triersistemas.andromeda.service.impl;

import br.com.triersistemas.andromeda.domain.Farmaceutico;
import br.com.triersistemas.andromeda.domain.Produto;
import br.com.triersistemas.andromeda.exceptions.NaoExisteException;
import br.com.triersistemas.andromeda.model.FarmaceuticoModel;
import br.com.triersistemas.andromeda.model.ProdutoModel;
import br.com.triersistemas.andromeda.repository.ProdutoRepository;
import br.com.triersistemas.andromeda.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public List<ProdutoModel> consultar() {
        return produtoRepository.findAll().stream().map(ProdutoModel::new).collect(Collectors.toList());
    }

    @Override
    public ProdutoModel consultar(UUID id) {
        return new ProdutoModel(buscarPorId(id));
    }

    @Override
    public List<ProdutoModel> consultar(List<UUID> ids) {
        return produtoRepository.findAllById(ids).stream().map(ProdutoModel::new).toList();
    }

    @Override
    public ProdutoModel cadastrar(ProdutoModel model) {
        Produto produto = new Produto(model);
        return new ProdutoModel(produtoRepository.save(produto));
    }

    @Override
    public ProdutoModel alterar(ProdutoModel model) {
        Produto produto = buscarPorId(model.getId());
        produto.editar(model.getNome(), model.getValor());
        return new ProdutoModel(this.produtoRepository.save(produto));
    }

    @Override
    public ProdutoModel remover(UUID id) {
        Produto produto = buscarPorId(id);
        produtoRepository.delete(produto);
        return new ProdutoModel(produto);
    }

    private Produto buscarPorId(UUID id){
        return this.produtoRepository.findById(id).orElseThrow(NaoExisteException::new);
    }
}
