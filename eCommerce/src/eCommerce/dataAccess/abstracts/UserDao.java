package eCommerce.dataAccess.abstracts;

import java.util.ArrayList;
import java.util.List;

import eCommerce.entities.concretes.User;

public interface UserDao {

	void register(User user);
	void login(User user);
	
	ArrayList<User> users = new ArrayList<>();
	
	User get(int id);
	List<User> getAll();
}
