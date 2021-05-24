package eCommerce.dataAccess.concretes;

import java.util.List;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void register(User user) {
		
		users.add(user);
		System.out.println("Üye olundu: "+ user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public void login(User user) {
		System.out.println("Giriþ baþarýlý: "+ user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public User get(int id) {
		
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}

	

	

}
