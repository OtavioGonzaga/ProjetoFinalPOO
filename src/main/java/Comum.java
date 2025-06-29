// Otavio Luiz Gonzaga - RA: a2648920

public class Comum extends Medicamento implements Receituavel {

    private boolean vendidoSemReceita = false;
    private String viaAdministracao = "";

    public Comum() {
        super();
    }

    // Sobreescrita
    @Override
    protected float calcDosagem(float peso) throws NumeroNegativoException, DosagemExcedidaException {
        if (peso <= 0) {
            throw new NumeroNegativoException();
        }

        // Reflexividade com super
        float dose = peso * super.getDosagemMg();

        if (dose > 1000) {
            throw new DosagemExcedidaException(
                    "Dosagem calculada (" + dose + "mg) excede o limite seguro de 1000mg.");
        }

        return dose;
    }

    @Override
    public boolean precisaReceita() {
        return !vendidoSemReceita;
    }

    public boolean getVendidoSemReceita() {
        return vendidoSemReceita;
    }

    public void setVendidoSemReceita(boolean vendidoSemReceita) {
        this.vendidoSemReceita = vendidoSemReceita;
    }

    public String getViaAdministracao() {
        return viaAdministracao;
    }

    public void setViaAdministracao(String viaAdministracao) {
        this.viaAdministracao = viaAdministracao;
    }
}
