package br.com.exemplo.solid.openclosed.ruim.service;

import br.com.exemplo.solid.openclosed.common.Pedido;

public class TopicService {

    public void enviar(Pedido pedido) {
        System.out.printf("Mandando pedido para %s para o kafka%n", pedido.getId());
    }
}
