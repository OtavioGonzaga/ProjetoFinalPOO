// Otavio Luiz Gonzaga - RA: a2648920

public class Controlado extends Medicamento implements Receituavel {
	private String tipoReceita = "";
	private boolean necessitaRetencaoReceita = false;

	public Controlado() {
		super();
	}

	// Sobreescrita
	@Override
	public float calcDosagem(float peso) throws NumeroNegativoException, DosagemExcedidaException {
		if (peso <= 0) {
			throw new NumeroNegativoException();
		}

		// Reflexividade com super
		float dose = peso * super.getDosagemMg() / 1000;

		if (dose > 500) {
			throw new DosagemExcedidaException(
					"Dosagem calculada (" + dose + "mg) excede o limite seguro de 500mg.");
		}

		return dose;
	}

	// Sobrecarga
	public static float calcDosagem(float peso, float dosagemMg)
			throws NumeroNegativoException, DosagemExcedidaException {
		if (peso <= 0) {
			throw new NumeroNegativoException();
		}

		float dose = peso * dosagemMg / 1000;

		if (dose > 500) {
			throw new DosagemExcedidaException(
					"Dosagem calculada (" + dose + "mg) excede o limite seguro de 500mg.");
		}

		return dose;
	}

	public boolean precisaReceita() {
		return true;
	}

	public String getTipoReceita() {
		return tipoReceita;
	}

	public void setTipoReceita(String tipoReceita) {
		this.tipoReceita = tipoReceita;
	}

	public boolean getNecessitaRetencaoReceita() {
		return necessitaRetencaoReceita;
	}

	public void setNecessitaRetencaoReceita(boolean necessitaRetencaoReceita) {
		this.necessitaRetencaoReceita = necessitaRetencaoReceita;
	}

}