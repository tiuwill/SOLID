package br.com.exemplo.solid.singleresponsability.bom;

import java.math.BigDecimal;

public class ValidaCategoria {

    public String validarCategoriaCliente(Pedido pedido){
        if(pedido.getValor().compareTo(new BigDecimal(-1)) < 0) throw new IllegalArgumentException("Valor do pedido é negativo");
        if (pedido.getValor().compareTo(new BigDecimal(1000)) > 0) {
            return "Básico";
        } else if (pedido.getValor().compareTo(new BigDecimal(1000)) > 0
                && pedido.getValor().compareTo(new BigDecimal(5000)) < 0) {
            return  "Ouro";
        }
        return  "VIP";
    }


}
