// Otavio Luiz Gonzaga - RA: a2648920

public class NumeroNegativoException extends Exception {
	public NumeroNegativoException() {
		super("O valor deve ser maior que zero");
	}

	public NumeroNegativoException(String message) {
		super(message);
	}
}
