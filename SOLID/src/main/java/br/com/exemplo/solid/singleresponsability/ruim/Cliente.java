package br.com.exemplo.solid.singleresponsability.ruim;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Cliente {

    private Integer id;
    private String nome;
    private String categoria;
    private LocalDateTime dataUltimoAjuste;

    public Cliente(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void atualizarCategoria(Pedido pedido) {
        if(pedido.getValor().compareTo(new BigDecimal(-1)) < 0) throw new IllegalArgumentException("Valor do pedido é negativo");
        if (pedido.getValor().compareTo(new BigDecimal(1000)) < 0) {
            this.categoria = "Básico";
        } else if (pedido.getValor().compareTo(new BigDecimal(1000)) > 0
                && pedido.getValor().compareTo(new BigDecimal(5000)) < 0) {
            this.categoria = "Ouro";
        } else {
            this.categoria = "VIP";
        }
        this.dataUltimoAjuste = LocalDateTime.now();
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        if(this.categoria != null) return categoria;
        throw new RuntimeException("Cliente ainda não categorizado");
    }
}
