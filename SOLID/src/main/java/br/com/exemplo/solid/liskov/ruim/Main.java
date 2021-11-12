package br.com.exemplo.solid.liskov.ruim;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        var drFulano = new Ortopedista();
        var drCiclano = new Cardiologista();
        HospitalService hospitalService = new HospitalService();
        hospitalService.executarCirurgias(List.of(drFulano, drCiclano));
    }
}
