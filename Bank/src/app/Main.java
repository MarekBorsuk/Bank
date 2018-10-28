package app;

public class Main {
	public static final String APP_NAME = "Bank_v0.1";
	public static void main(String[] args) {
		
		System.out.println(APP_NAME);
		BankControl bankControl = new BankControl();
		bankControl.controlLoop();
	}

}
