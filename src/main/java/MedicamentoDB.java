// Otavio Luiz Gonzaga - RA: a2648920

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Singleton.java to edit this template
 */

/**
 *
 * @author otavio
 */
public class MedicamentoDB {
    private final List<Medicamento> medicamentos;

    private MedicamentoDB() {
        this.medicamentos = new ArrayList<>();
    }

    // MÉTODO SINGLETON
    public static MedicamentoDB getInstance() {
        return MedicamentoDBHolder.INSTANCE;
    }

    private static class MedicamentoDBHolder {

        private static final MedicamentoDB INSTANCE = new MedicamentoDB();
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public Optional<Medicamento> buscarPeloNome(String nome) {
        return medicamentos.stream().filter(medicamento -> medicamento.getNome().equals(nome)).findFirst();
    }

    public void addMedicamento(Medicamento medicamento) throws ConflitoException {
        if (this.buscarPeloNome(medicamento.getNome()).isPresent()) {
            throw new ConflitoException("Medicamento já cadastrado");
        }

        medicamentos.add(medicamento);
    }
}
