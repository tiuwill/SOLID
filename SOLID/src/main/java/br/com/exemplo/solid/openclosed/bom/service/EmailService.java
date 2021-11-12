package br.com.exemplo.solid.openclosed.bom.service;

import br.com.exemplo.solid.openclosed.common.Pedido;

public class EmailService implements AcoesDeEnvio {

    @Override
    public void enviar(Pedido pedido) {
        System.out.printf("Mandando email do pedido %s%n", pedido.getId());
    }
}
