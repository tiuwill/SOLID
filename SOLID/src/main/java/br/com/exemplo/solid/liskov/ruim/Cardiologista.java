package br.com.exemplo.solid.liskov.ruim;

public class Cardiologista extends Ortopedista {

    @Override
    public void fazCirurgiaNoJoelho() {
        throw new RuntimeException("Não faz cirurgia no joelho");
    }

    @Override
    public void pedeRadiografia() {
        throw new RuntimeException("Não pede radiografia");
    }

    public void examinaCoracao() {
        System.out.println("Examinar coração");
    }
}
