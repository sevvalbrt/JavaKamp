package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setFirstName("sevval");
		student.setLastName("barut");
		student.setEmail("sevval@sevval.com");
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("engin");
		instructor.setLastName("demirog");
		instructor.setEmail("engin@engin.com");
		instructor.setAbout("Engin");
		
		StudentManager studentManager = new StudentManager();
		studentManager.login(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.updateAbout(instructor);

	}

}
