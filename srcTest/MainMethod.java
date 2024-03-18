package srcTest;

import java.util.*;

public class MainMethod {

	public static void main(String[] args) {

		//Bad practice, object name should use camel casing
		Department Programming = new Department("Java");
		//Programming.name = "Java";
		
		Professor Luxor = new Professor("Dr Luxor Luther", "2dfghy78", "Feb 02 05", "Serowe", null, Programming);
		//Luxor.name = "Dr Luxor Luther";
		//Luxor.worksFor = Programming; 
		
		Student Lame = new Student("Lame Segametsi", "wo124bgt344", "Jan 04 88", "Block 8", Programming, 5, Luxor);
//		Lame.name = "Lame Segametsi";
//		Lame.studentId = "wo124bgt344";
//		Lame.advicer =  Luxor;
//		Lame.major = Programming;
		
		GraduateStudent rex = new GraduateStudent("Reedemer Hunter", "4tg67yhrgf", "Dec 25 93", "Phakalane", Programming, 7.7, Luxor, "Accounting", "UB");
		
		Luxor.setAdvisee(Lame);	
		
		System.out.println("First professor is: "+ Luxor.getName() + " and is adviser to "+ Luxor.getAdvisee().getName());
		System.out.println("Student named "+ Lame.getName()+ " has an advercer called "+ Lame.getAdvicer().getName());
		System.out.println(Lame.getName()+ " majors is "+ Lame.getMajor().getName());
		System.out.println("Professor named "+ Luxor.getName()+ " works in the "+ Luxor.getWorksFor().getName()+" department");
		
		Lame.print();
		rex.print();
		
		//ORDERED LIST
		
		//Array
		
		Student[] students = new Student[10];
		
		students[0] = new Student("One ones", "rut7b8f9d", "Apr 2 90", "Mmopane", Programming, 8.4, Luxor);
		students[1] = new Student("Nkamo Mosh", "u8fuer8e9", "Dec 24 98", "G north", Programming, 8.7, Luxor);
		students[2] = new Student("Katso Foreman", "4rtig9tir", "Apr 29 2005", "B hurst", Programming, 0, Luxor);


		for(int i=0; i < students.length; i++) {
			
			if(students[i] != null) {
				System.out.println("\nBAC students:\n"+ students[i].getName()+"\n");
			}
		}
		
		//Arraylist
		
		ArrayList<Student> students1 = new ArrayList<>();
		
		Student a = new Student("Kao Foreman", "btgitdo", "Dec 27 2016", "Block 10", Programming, 7.4, Luxor);
		Student b = new Student("Mpho Mosh", "c6tty7uh", "Sep 27 93", "Block 9", Programming, 9.4, Luxor);
		Student c = new Student("Katlo Foreman", "a7788gggitgit", "May 27 2004", "Block 8", Programming, 7.9, Luxor);
		
		students1.add(a);
		students1.add(b);
		students1.add(c);
		
		for(Student s : students1) {
			
			System.out.println("Student name: "+s.getName()+ "\nResidence: "+s.getAddress()+"\n");
		}
		
		
		//DICTIONARY(maps)
		
		//Hashmap

		HashMap<String, Student> students2 = new HashMap<>();
		
		students2.put(a.getStudentId(), a);
		students2.put(b.getStudentId(), b);
		students2.put(c.getStudentId(), c);
		
		String checkId = "6tty7uh";
		Student x = students2.get(checkId);
		
		if (x != null) {
			System.out.println("Id of "+checkId+" belong to: "+ x.getName());
		}
		else {
			
			System.out.println("Id of "+checkId+" Not found in the DB");
		}
		
		//Value in the sense the content without the key or the contents that the key is pointing to
		for(Student st : students2.values()) {
			
			System.out.println("\nID: "+ st.getStudentId()+"\nName: "+ st.getName()+"\nGPA: "+st.getGpa());
		}
		
		//TreeMap (outputs in ascending order according to key)
		
		TreeMap<String, Student> students3 = new TreeMap<>();
		
		students3.put(a.getStudentId(), a);
		students3.put(b.getStudentId(), b);
		students3.put(c.getStudentId(), c);
		
		System.out.println("\nFrom TreeMap");

		
		for(Student st1 : students3.values()) {

			
			System.out.println("\nID: "+ st1.getStudentId()+"\nName: "+ st1.getName()+"\nGPA: "+st1.getGpa());

		}

	}

}
