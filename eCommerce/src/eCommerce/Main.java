package eCommerce;

import eCommerce.business.abstracts.UserService;
import eCommerce.business.concretes.UserManager;
import eCommerce.business.concretes.ValidationManager;
import eCommerce.core.GoogleAccountManagerAdapter;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new HibernateUserDao(),
				new GoogleAccountManagerAdapter(), new ValidationManager());
		
		User user=new User(1,"sevval","barut","sevval@gmail.com","111111");
		
		userService.register(user);
		
		userService.login(user);

	}

}
