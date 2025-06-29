// Otavio Luiz Gonzaga - RA: a2648920

public class Generico extends Comum {
	private String nomeGenerico;
	private String nomeComercial;
	private Laboratorio laboratorioOriginal;

	public Generico() {
		super();

		this.nomeGenerico = "";
		this.nomeComercial = "";
		this.laboratorioOriginal = new Laboratorio();
	}

	public String getNomeGenerico() {
		return nomeGenerico;
	}

	public void setNomeGenerico(String nomeGenerico) {
		this.nomeGenerico = nomeGenerico;
	}

	public String getNomeComercial() {
		return nomeComercial;
	}

	public void setNomeComercial(String nomeComercial) {
		this.nomeComercial = nomeComercial;
	}

	public Laboratorio getLaboratorioOriginal() {
		return laboratorioOriginal;
	}

	public void setLaboratorioOriginal(Laboratorio laboratorioOriginal) {
		this.laboratorioOriginal = laboratorioOriginal;
	}
}