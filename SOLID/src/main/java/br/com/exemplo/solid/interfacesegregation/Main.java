package br.com.exemplo.solid.interfacesegregation;


import java.util.List;

public class Main {

    public static void main(String[] args) {
        var drFulano = new Ortopedista();
        var drCiclano = new Cardiologista();
        var drBeltrano = new ClinicoGeral();
        HospitalService hospitalService = new HospitalService();
        hospitalService.executarCirurgias(List.of(drFulano, drCiclano));
    }
}
