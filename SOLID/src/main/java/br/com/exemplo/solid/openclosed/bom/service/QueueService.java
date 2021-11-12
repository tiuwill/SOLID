package br.com.exemplo.solid.openclosed.bom.service;

import br.com.exemplo.solid.openclosed.common.Pedido;

public class QueueService implements AcoesDeEnvio {

    @Override
    public void enviar(Pedido pedido) {
        System.out.printf("Mandando pedido para %s para o sqs%n", pedido.getId());
    }

}
