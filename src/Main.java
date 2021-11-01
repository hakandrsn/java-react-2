
public class Main {

	public static void main(String[] args) {
		UserManager user = new UserManager();
		user.setId(1);
		user.setUserNumber("789");
		user.show(user);
		
		StudentManager student = new StudentManager();
		student.setFirstName("Hakan");
		student.setLastName("Dursun");
		student.setId(2);
		student.show(student);
		
		InstructorManager instructor = new InstructorManager();
		instructor.setFirstName("Esmeray");
		instructor.setLastName("Dursun");
		instructor.setId(3);
		instructor.setLesson("matematik");
		instructor.show(instructor);
		
	}

}
