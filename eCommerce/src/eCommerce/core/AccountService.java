package eCommerce.core;

import eCommerce.entities.concretes.User;

public interface AccountService {
	
	void register(User user);
	void login(User user);

}
