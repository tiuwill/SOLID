package br.com.exemplo.solid.openclosed.ruim;

import br.com.exemplo.solid.openclosed.common.Pedido;
import br.com.exemplo.solid.openclosed.common.PedidoRepository;
import br.com.exemplo.solid.openclosed.ruim.service.*;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        PedidoService pedidoService = new PedidoService(new TopicService(),
                new EmailService(), new QueueService());
        pedidoService.salvarPedido(new Pedido(1, new BigDecimal(500)));
    }

}
