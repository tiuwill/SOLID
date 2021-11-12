package br.com.exemplo.solid.openclosed.bom;

import br.com.exemplo.solid.openclosed.bom.service.EmailService;
import br.com.exemplo.solid.openclosed.bom.service.QueueService;
import br.com.exemplo.solid.openclosed.bom.service.TopicService;
import br.com.exemplo.solid.openclosed.common.Pedido;

import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        PedidoService pedidoService = new PedidoService(
                List.of(new TopicService(), new EmailService(), new QueueService())
        );
        pedidoService.salvarPedido(new Pedido(1, new BigDecimal(500)));
    }

}
