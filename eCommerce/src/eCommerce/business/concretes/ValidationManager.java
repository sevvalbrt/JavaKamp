package eCommerce.business.concretes;

import eCommerce.business.abstracts.ValidationService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationManager implements ValidationService{

	@Override
	public String checkValues(User user) {
		
		if (user.getPassword().length() < 6) {
			
			return "Sifre en az 6 karakterden olusmalidir";
		}
		
		String emailPattern = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern p = Pattern.compile(emailPattern);
		Matcher m = p.matcher(user.getEmail());
		
		if (!m.matches()) {
			
			return "Email alaný email formatýnda olmalýdýr";
		}
		if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			
			return "Ad ve soyad en az iki karakterden olusmalidir.";
		}
		
		return null;
	}

	@Override
	public boolean checkEmail(User user, List<User> users) {
		
		for (User userEmail : users) {
			
			if (user.getEmail() == userEmail.getEmail()) {
				
				return true;
			}
		}
		return false;
	}
	
	

	

}
