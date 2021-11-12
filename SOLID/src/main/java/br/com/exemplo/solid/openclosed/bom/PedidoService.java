package br.com.exemplo.solid.openclosed.bom;

import br.com.exemplo.solid.openclosed.bom.service.AcoesDeEnvio;
import br.com.exemplo.solid.openclosed.common.Pedido;
import br.com.exemplo.solid.openclosed.common.PedidoRepository;

import java.util.List;

public class PedidoService {

    private List<AcoesDeEnvio> acoesDeEnvios;
    private final PedidoRepository pedidoRepository;

    public PedidoService(List<AcoesDeEnvio> acoesDeEnvios) {
        this.acoesDeEnvios = acoesDeEnvios;
        this.pedidoRepository = new PedidoRepository();
    }

    public void salvarPedido(final Pedido pedido) {
        pedidoRepository.salvar(pedido);
        this.acoesDeEnvios.forEach(acao -> acao.enviar(pedido));
    }

}
