package eCommerce.business.concretes;

import eCommerce.business.abstracts.UserService;
import eCommerce.business.abstracts.ValidationService;
import eCommerce.core.AccountService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	private AccountService accountService;
	private ValidationService validationService;
	
	public UserManager(UserDao userDao, AccountService accountService, ValidationService validatonService) {
		super();
		this.userDao = userDao;
		this.accountService=accountService;
		this.validationService=validatonService;
	}

	@Override
	public void login(User user) {
		
		if(!validationService.checkEmail(user, userDao.getAll())) {
			
			System.out.println("Email not found. Please check your information.");
			return;
			
		}else {
			
			userDao.login(user);
			accountService.login(user);
		}
		
	}

	@Override
	public void register(User user) {
		
		if(validationService.checkValues(user)!=null) {
			System.out.println(validationService.checkValues(user));
		}
		
		userDao.register(user);
		accountService.register(user);
		
	}

	

	
}
