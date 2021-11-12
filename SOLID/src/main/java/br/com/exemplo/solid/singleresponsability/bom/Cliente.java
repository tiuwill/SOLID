package br.com.exemplo.solid.singleresponsability.bom;

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

    public void atualizarCategoria(String categoria) {
        this.categoria = categoria;
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
