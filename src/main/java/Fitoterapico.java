// Otavio Luiz Gonzaga - RA: a2648920

public class Fitoterapico extends Medicamento {

	private String plantaOrigem;
	private boolean exigeRegistroAnvisa;

	public Fitoterapico() {
		super();
	}

	// Sobreecrita
	@Override
	public float calcDosagem(float peso) {
		return peso * this.getDosagemMg() * 0.9f;
	}

	public String getPlantaOrigem() {
		return plantaOrigem;
	}

	public void setPlantaOrigem(String plantaOrigem) {
		this.plantaOrigem = plantaOrigem;
	}

	public boolean getExigeRegistroAnvisa() {
		return exigeRegistroAnvisa;
	}

	public void setExigeRegistroAnvisa(boolean exigeRegistroAnvisa) {
		this.exigeRegistroAnvisa = exigeRegistroAnvisa;
	}
}
