package model.exceptions;

public class InvalidAmmountException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public InvalidAmmountException(String msg) {
		super(msg);
	}
}
