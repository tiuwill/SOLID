package br.com.exemplo.solid.openclosed.common;

import br.com.exemplo.solid.openclosed.common.Pedido;

public class PedidoRepository {

    public void salvar(Pedido pedido) {
        System.out.printf("Salvando pedido %s%n", pedido.getId());
    }

}
