package eCommerce.business.abstracts;

import java.util.List;

import eCommerce.entities.concretes.User;

public interface ValidationService {

	String checkValues(User user);
	
	boolean checkEmail(User user, List<User> users);
}
