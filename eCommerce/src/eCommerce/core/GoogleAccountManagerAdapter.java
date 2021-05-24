package eCommerce.core;

import eCommerce.entities.concretes.User;
import eCommerce.googleAccount.GoogleAccountManager;

public class GoogleAccountManagerAdapter implements AccountService{

	@Override
	public void register(User user) {
		
		GoogleAccountManager manager=new GoogleAccountManager();
		manager.register(user.getEmail());
	}

	@Override
	public void login(User user) {
		
		GoogleAccountManager manager=new GoogleAccountManager();
		manager.login(user.getEmail());
	}
	
}
