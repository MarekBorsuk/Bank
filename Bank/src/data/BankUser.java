package data;

import java.util.HashMap;
import java.util.Map;

public class BankUser extends User{
	
	private Map<User, Integer> userAccountBalance;
	
	public BankUser(User user) {
		userAccountBalance = new HashMap<User, Integer>();
	}
		
	public Map<User, Integer> getAccountBalance() {
		return userAccountBalance;
	}

	public void setAccountBalance(Map<User, Integer> accountBalance) {
		this.userAccountBalance = accountBalance;
	}

	public void creatUserAcount(User user) {
		userAccountBalance.put(user, 0);
		
	}
	
	
	
	
}
