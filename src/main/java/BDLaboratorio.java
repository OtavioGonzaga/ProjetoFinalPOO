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
public class BDLaboratorio {

    private final List<Laboratorio> laboratorios;

    private BDLaboratorio() {
        this.laboratorios = new ArrayList<>();
    }

    private static class LaboratorioDBHolder {
        private static final BDLaboratorio INSTANCE = new BDLaboratorio();
    }

    // MÉTODO SINGLETON
    public static BDLaboratorio getInstance() {
        return LaboratorioDBHolder.INSTANCE;
    }

    public List<Laboratorio> getLaboratorios() {
        return laboratorios;
    }

    public Optional<Laboratorio> buscarPeloNome(String nome) {
        return laboratorios.stream()
                .filter(lab -> lab.getNome().equalsIgnoreCase(nome))
                .findFirst();
    }

    public void addLaboratorio(Laboratorio laboratorio) throws ConflitoException {
        if (this.buscarPeloNome(laboratorio.getNome()).isPresent()) {
            throw new ConflitoException("Laboratório já cadastrado");
        }

        laboratorios.add(laboratorio);
    }
}
