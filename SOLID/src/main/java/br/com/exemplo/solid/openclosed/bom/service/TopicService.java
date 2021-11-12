package br.com.exemplo.solid.openclosed.bom.service;

import br.com.exemplo.solid.openclosed.common.Pedido;

public class TopicService implements AcoesDeEnvio {

    @Override
    public void enviar(Pedido pedido) {
        System.out.printf("Mandando pedido para %s para o kafka%n", pedido.getId());
    }
}
