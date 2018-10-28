package app;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

import data.BankUser;
import data.Option;
import data.User;
import util.DataReader;

public class BankControl {
	
	private DataReader dataReader;
	
	private BankUser bankUser;
	
	public BankControl() {
		dataReader = new DataReader();
	}
	
	public void controlLoop() {
		Option option = null;
        while (option != Option.EXIT) {
			try {
				printOptions();
				option = Option.createFromInt(dataReader.getInt());
				switch (option) {
				case ADD_USER:
					addUser();
					break;
				case LOGIN:
					login();
					break;
				case PAY_IN_CASH:
					break;
				case WITHDRAW_CASH:
					break;
				case CHACKING_THE_BALANCE:
					break;
				case LOGOUT:
					break;
				case EXIT:
					exit();
								
				}
			} catch (InputMismatchException e) {
				System.out.println("Wprowadzono niepoprawne dane.");
			}catch (NumberFormatException | NoSuchElementException e) {
				System.out.println("Wybrana opcja nie istnieje, wybierz ponownie: ");
			}
			
		}	
		
		dataReader.close();
	}

	private void login() {
		
		
	}

	private void exit() {
		// TODO Auto-generated method stub
		
	}

	private void addUser() {
		bankUser.creatUserAcount(dataReader.createUser());
		
	}

	private void printOptions() {
		System.out.println("Wybierz opcjê: ");
		for (Option o : Option.values()) {
			System.out.println(o);
		}
		
	}	
}
