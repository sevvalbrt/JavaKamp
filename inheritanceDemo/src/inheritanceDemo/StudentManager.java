package inheritanceDemo;

public class StudentManager {
	
	public void login(User user) {
		System.out.println("Login successful: "+ user.getFirstName() +""+ user.getLastName());
	}

}
