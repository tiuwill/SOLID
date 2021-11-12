package br.com.exemplo.solid.liskov.bom;

public class Aluno extends Pessoa {

    private String matricula;

    public Aluno(String nome, Integer idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
}

