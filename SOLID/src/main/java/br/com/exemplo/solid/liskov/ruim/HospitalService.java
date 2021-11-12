package br.com.exemplo.solid.liskov.ruim;

import java.util.List;

public class HospitalService {

    public void executarCirurgias(List<Ortopedista> medicos) {
        medicos.forEach(Ortopedista::fazCirurgiaNoJoelho);
    }

}
