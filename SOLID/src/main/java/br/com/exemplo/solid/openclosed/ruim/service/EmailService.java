package br.com.exemplo.solid.openclosed.ruim.service;

import br.com.exemplo.solid.openclosed.common.Pedido;

public class EmailService {

    public void enviar(Pedido pedido) {
        System.out.printf("Mandando email do pedido %s%n", pedido.getId());
    }
}
