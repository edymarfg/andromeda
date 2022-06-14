/*package br.com.triersistemas.andromeda.domain;

import br.com.triersistemas.andromeda.enums.EnumStatusPedido;
import br.com.triersistemas.andromeda.model.ItemPedidoModel;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Getter
public class AdicionarProduto {

    private List<ItemPedidoModel> itensPedidos;

    public Pedido adicionarProduto(final Produto produto) {
            this.itensPedidos.addAll(produtos);
            this.valor = this.produtos.stream()
                    .map(Produto::getValor)
                    .reduce(BigDecimal.ZERO, BigDecimal::add);
        }
        return this;
    }

    public List<UUID> getItensPedidos() {
        return itensPedidos;
    }
}*/
