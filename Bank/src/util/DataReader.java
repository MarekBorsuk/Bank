package util;

import java.util.InputMismatchException;
import java.util.Scanner;


import data.User;

public class DataReader {
	Scanner sc;
	
	public DataReader() {
		sc = new Scanner(System.in);
	}
	
	public void close() {
		sc.close();
	}
	
	public int getInt() throws NumberFormatException{
		int number = 0;
		try {
			number = sc.nextInt();
		} catch (InputMismatchException e) {
			throw new NumberFormatException("Liczba wprowadzona w niepoprawnej formie");
		}finally {
			sc.nextLine();
		}
		return number;
	}

	public User createUser() {
		System.out.println("Podaj login: ");
		String login = sc.nextLine();
		System.out.println("Podaj has³o: ");
		String password = sc.nextLine();
		
		return new User(login, password);
	}
	
	public boolean checkUser(User user) {
		return true;
	}

}
