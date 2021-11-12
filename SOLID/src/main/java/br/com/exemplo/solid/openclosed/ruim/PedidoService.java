package br.com.exemplo.solid.openclosed.ruim;

import br.com.exemplo.solid.openclosed.common.Pedido;
import br.com.exemplo.solid.openclosed.common.PedidoRepository;
import br.com.exemplo.solid.openclosed.ruim.service.*;

public class PedidoService {

    private final TopicService topicService;
    private final EmailService emailService;
    private final QueueService queueService;
    private final PedidoRepository pedidoRepository;

    public PedidoService(TopicService topicService, EmailService emailService,
                         QueueService queueService) {
        this.topicService = topicService;
        this.emailService = emailService;
        this.queueService = queueService;
        this.pedidoRepository = new PedidoRepository();
    }

    public void salvarPedido(Pedido pedido) {
        pedidoRepository.salvar(pedido);
        topicService.enviar(pedido);
        emailService.enviar(pedido);
        queueService.enviar(pedido);
    }

}
