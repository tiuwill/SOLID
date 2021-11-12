package br.com.exemplo.solid.interfacesegregation;

public class ClinicoGeral implements AcoesMedicas {
    @Override
    public void executaPrimeirosSocorros() {
        System.out.println("Primeiros socorros");
    }

    @Override
    public void receitaMedicacao() {
        System.out.println("Receita Medicacao");
    }
}
