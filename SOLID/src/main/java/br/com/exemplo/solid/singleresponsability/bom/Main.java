package br.com.exemplo.solid.singleresponsability.bom;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(1,"Joao");
        Pedido pedido = new Pedido(1, new BigDecimal(5000));
        ValidaCategoria validaCategoria = new ValidaCategoria();
        String categoria = validaCategoria.validarCategoriaCliente(pedido);
        cliente.atualizarCategoria(categoria);
        System.out.printf("O cliente %s é da categoria %s%n", cliente.getNome(), cliente.getCategoria());
    }


}
