package br.com.exemplo.solid.liskov.bom;

public class Pessoa {

    private final String nome;
    private final Integer idade;

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
