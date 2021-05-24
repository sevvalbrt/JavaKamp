package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

public interface UserService {

	void login(User user);
	
	void register(User user);
}
