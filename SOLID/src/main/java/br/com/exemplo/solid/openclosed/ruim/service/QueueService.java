package br.com.exemplo.solid.openclosed.ruim.service;

import br.com.exemplo.solid.openclosed.common.Pedido;

public class QueueService {

    public void enviar(Pedido pedido) {
        System.out.printf("Mandando pedido para %s para o sqs%n", pedido.getId());
    }

}
