// Otavio Luiz Gonzaga - RA: a2648920

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author otavio
 */
public class ConflitoException extends Exception {
	public ConflitoException() {
		super("Entidade já cadastrada");
	}

	public ConflitoException(String message) {
		super(message);
	}
}
