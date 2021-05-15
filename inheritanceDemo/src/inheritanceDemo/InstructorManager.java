package inheritanceDemo;

public class InstructorManager{
	
	public void updateAbout(Instructor instructor) {
		instructor.setAbout("Engin Demirog");
		System.out.println("Updated: "+ instructor.getAbout());
	}

}
