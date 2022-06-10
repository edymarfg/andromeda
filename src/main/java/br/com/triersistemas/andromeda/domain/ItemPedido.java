package br.com.triersistemas.andromeda.domain;

import lombok.Getter;

import java.math.BigDecimal;
@Getter
public class ItemPedido {

    private Produto produto;
    private Integer quantidade;
    private BigDecimal valor;

    public ItemPedido(Produto produto, Integer quantidade, BigDecimal valor){
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
    }
}
