package ucuncuGunOdev;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setId(1);
		instructor.setMyLesson("Java");
		
		Student student = new Student();
		student.setFirstName("Yusuf");
		student.setId(1);
		student.setLastName("Açmacı");
		student.setLessonsAttended("Java");

		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		
	}

}
