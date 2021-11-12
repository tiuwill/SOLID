package br.com.exemplo.solid.interfacesegregation;

public class Ortopedista implements AcoesMedicas, FazCirurgias {

    @Override
    public void executaPrimeirosSocorros() {
        System.out.println("Primeiros Socorros");
    }

    @Override
    public void receitaMedicacao() {
        System.out.println("Receita medicacao");
    }

    public void pedeRadiografia() {
        System.out.println("Radiografias");
    }

    @Override
    public void fazCirurgia() {
        System.out.println("Faz cirurgia no Joelho");
    }
}
