package br.com.triersistemas.andromeda.model;

import br.com.triersistemas.andromeda.domain.Produto;
import lombok.Getter;

import java.util.UUID;

@Getter
public class ItemPedidoModel {

    private UUID idProduto;
    private Integer quantidade;

}
