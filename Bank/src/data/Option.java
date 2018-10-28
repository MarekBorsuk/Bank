package data;

import java.util.NoSuchElementException;

public enum Option {
	EXIT(0, "Wyj�cie z programu"),
	ADD_USER(1, "Zarejestr�j si�"),
	LOGIN(2, "Zaloguj si�"),
	PAY_IN_CASH(3, "Wp�a� got�wk�"),
	WITHDRAW_CASH(4, "Wyp�a� got�wk�"),
	CHACKING_THE_BALANCE(5, "Sprawd� saldo"),
	LOGOUT(6, "Wyloguj si�");
	
	private int value;
	private String description;
	
	Option(int value, String desc) {
		this.value = value;
		this.description = desc;
	}
	
	@Override
	public String toString() {
		return value + " - " + description;
	}
	
	public static Option createFromInt(int option) throws NoSuchElementException{
		Option result = null;
		try {
			result = Option.values()[option];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new NoSuchElementException("Brak elementu o wskazanym ID");
		}
		return result;
	}
}
