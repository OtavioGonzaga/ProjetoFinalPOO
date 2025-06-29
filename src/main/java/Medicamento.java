// Otavio Luiz Gonzaga - RA: a2648920

public abstract class Medicamento {
	private float preco;
	private String nome;
	private String principioAtivo;
	private float dosagemMg;

	protected Medicamento() {
		this.preco = 0f;
		this.nome = "";
		this.principioAtivo = "";
		this.dosagemMg = 0f;
	}

	protected abstract float calcDosagem(float peso) throws NumeroNegativoException,
			DosagemExcedidaException;

	// Sobrecarga
	// Método estático
	public static float calcDosagem(float peso, float dosagem) throws NumeroNegativoException,
			DosagemExcedidaException {
		if (peso <= 0) {
			throw new NumeroNegativoException("O peso deve ser maior que zero");
		}

		float dose = peso * dosagem;

		if (dose > 1000) {
			throw new DosagemExcedidaException(
					"Dosagem calculada (" + dose + "mg) excede o limite seguro de 1000mg.");
		}

		return peso * dosagem;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) throws NumeroNegativoException {
		if (preco <= 0) {
			throw new NumeroNegativoException("O preço deve ser maior que zero");
		}

		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPrincipioAtivo() {
		return principioAtivo;
	}

	public void setPrincipioAtivo(String principioAtivo) {
		this.principioAtivo = principioAtivo;
	}

	public float getDosagemMg() {
		return dosagemMg;
	}

	public void setDosagemMg(float dosagemMg) throws NumeroNegativoException {
		if (dosagemMg <= 0) {
			throw new NumeroNegativoException();
		}

		this.dosagemMg = dosagemMg;
	}
}
