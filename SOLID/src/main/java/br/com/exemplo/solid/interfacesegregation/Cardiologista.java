package br.com.exemplo.solid.interfacesegregation;

public class Cardiologista implements AcoesMedicas, FazCirurgias {

    public void examinaCoracao() {
        System.out.println("Examinar coração");
    }

    @Override
    public void executaPrimeirosSocorros() {
        System.out.println("Primeiros Socorros");
    }

    @Override
    public void receitaMedicacao() {
        System.out.println("Receita medicacao");
    }

    @Override
    public void fazCirurgia() {
        System.out.println("Faz cirurgia no coração");
    }
}
