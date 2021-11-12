package br.com.exemplo.solid.singleresponsability.ruim;

import java.math.BigDecimal;

public class Pedido {

    private Integer id;
    private BigDecimal valor;

    public Pedido(Integer id, BigDecimal valor) {
        this.id = id;
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
