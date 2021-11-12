package br.com.exemplo.solid.interfacesegregation;


import java.util.List;

public class HospitalService {

    public void executarCirurgias(List<FazCirurgias> medicos) {
        medicos.forEach(FazCirurgias::fazCirurgia);
    }

}
