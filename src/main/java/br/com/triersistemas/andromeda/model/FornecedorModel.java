package br.com.triersistemas.andromeda.model;

import br.com.triersistemas.andromeda.domain.Fornecedor;
import br.com.triersistemas.andromeda.domain.Produto;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Getter
public class FornecedorModel {
    private UUID id;
    private String nome;
    private LocalDate niver;
    private String cnpj;
    private List<Produto> produtos;
    private Long idade;
    private String documento;
    private Boolean documentoValido;

    public FornecedorModel(Fornecedor fornecedor) {
        this.id = fornecedor.getId();
        this.nome = fornecedor.getNome();
        this.niver = fornecedor.getNiver();
        this.cnpj = fornecedor.getDocumento();
        this.produtos = fornecedor.getProdutos();
        this.idade = fornecedor.getIdade();
        this.documento = fornecedor.getDocumento();
        this.documentoValido = fornecedor.getDocumentoValido();
    }
}
