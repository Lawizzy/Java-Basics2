package staticKeyword;

public class StaticMain {

	public static void main(String[] args) {


		Student student1 = new Student();
		Student student2 = new Student();
		
		Student.name = "Luxor"; //The static variable is accessed directly from the class
		student1.age = 12;
		student1.grade = "2nd";
		
		Student.name = "Luther";
		student2.age = 13;
		student2.grade = "3rd";
		
		student1.displayStudent();
		student2.displayStudent();
		
	
		Student.staticMethod();

	}

}
