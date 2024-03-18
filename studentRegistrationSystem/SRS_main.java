package studentRegistrationSystem;

import java.util.ArrayList;

public class SRS_main {
	
	public static ArrayList<Professor> faculty;
	public static ArrayList<Student> studentBody;
	public static ArrayList<Course> courseCatalog;
	
	public static ScheduleOfClasses thisYearSchedule = new ScheduleOfClasses("SP-2023");
	public static ScheduleOfClasses nextYearSchedule = new ScheduleOfClasses("SP-2024");
	
	//Housekeeping methods, to make things easier
	
	private static void reportStatus(EnrollmentStatus es, Student s) {
		
		System.out.println("Status report for "+s.getName()+" is: "+es.value()+"\n");
	}
	
	private static void attemptToEnroll(Student st, Section sec, Course cos) {
		
		System.out.println("Student: "+st.getName()+" is attempting to enroll in "+sec.toString()+"\n");
		
		reportStatus(sec.enroll(st, cos), st);
	}
	
	

	public static void main(String[] args) {

		Professor p1, p2, p3;
		Student st1, st2, st3, st4;
		Course c1, c2, c3, c4, c5, c6;
		Section s1, s2, s3, s4, s5, s6, s7, s8, s9, s10;
		

		/**
		 * Professors
		 */
		p1 = new Professor("Dr Luther", "124-08i-4fg", "full-time", "Computing");
		p2 = new Professor("Dr Moses", "844-08i-3hb", "part-time", "Law");
		p3 = new Professor("Dr Hunter", "555-fbi-653", "full-time", "Medicine");
		
		faculty = new ArrayList<Professor>();
		faculty.add(p1);
		faculty.add(p2);
		faculty.add(p3);
		
		
		/**
		 * Students
		 */
		st1 = new Student("Kago somebody", "404-404-404", "Mobile development", "Mobile systems degree");
		st2 = new Student("Letlamoreng More", "404-987-404", "Data analysis", "Computer science degree");
		st3 = new Student("Sesegolo Dijo", "404-404-098", "Android development", "Computer systems degree");
		st4 = new Student("Mosetsanagape Dumelang", "876-404-404", "Accounting", "ATT degree");
		
		studentBody = new ArrayList<Student>();
		studentBody.add(st1);
		studentBody.add(st2);
		studentBody.add(st3);
		studentBody.add(st4);

		/**
		 * Courses
		 */
		c1 = new Course("CMP555", "Early childhood", 3.5);
		c2 = new Course("OBJ905", "Programming", 3.5);
		c3 = new Course("CMP888", "String Theory", 3.5);
		c4 = new Course("LMS455", "Gray matter", 3.5);
		c5 = new Course("AWS422", "Black hole", 3.5);
		c6 = new Course("COM320", "Quantum Physics", 3.5);
		
		courseCatalog = new ArrayList<Course>();
		courseCatalog.add(c1);
		courseCatalog.add(c2);
		courseCatalog.add(c3);
		courseCatalog.add(c4);
		courseCatalog.add(c5);
		courseCatalog.add(c6);
		
		/**
		 * Course Prerequisites
		 */
		c1.addPrerequisites(c1);
		c2.addPrerequisites(c6);
		c3.addPrerequisites(c2);
		c4.addPrerequisites(c3);
		//c5.addPrerequisites(c4);

		/**
		 * Sections
		 */
		s1 = c1.scheduleSection('M', "1700hrs-1900hrs", "Room 2", 5000);
		s2 = c2.scheduleSection('W', "1500hrs-1700hrs", "Lab 6", 500);
		s3 = c2.scheduleSection('T', "1700hrs-1900hrs", "Lecture theatre", 50000);
		s4 = c3.scheduleSection('F', "1500hrs-1700hrs", "Lab 6", 500);
		s5 = c4.scheduleSection('M', "1700hrs-2100hrs", "Lab 5", 745);
		s6 = c6.scheduleSection('T', "1500hrs-1700hrs", "Lab 12", 200);
		s7 = c5.scheduleSection('W', "1700hrs-2000hrs", "Room 7", 85);
		s8 = c2.scheduleSection('F', "1500hrs-1700hrs", "Lab 66", 8500);
		s9 = c5.scheduleSection('F', "1500hrs-1700hrs", "Room 66", 85);
		s10 = c2.scheduleSection('T', "1900hrs-2100hrs", "Room 67", 90);


		
		thisYearSchedule.addSection(s1);
		thisYearSchedule.addSection(s2);
		thisYearSchedule.addSection(s3);
		thisYearSchedule.addSection(s4);
		thisYearSchedule.addSection(s5);
		thisYearSchedule.addSection(s6);
		thisYearSchedule.addSection(s7);
		thisYearSchedule.addSection(s8);
		
		nextYearSchedule.addSection(s9);
		nextYearSchedule.addSection(s10);
//		nextYearSchedule.addSection(s3);
//		nextYearSchedule.addSection(s4);
//		nextYearSchedule.addSection(s5);
//		nextYearSchedule.addSection(s6);
//		nextYearSchedule.addSection(s7);
//		nextYearSchedule.addSection(s8);
		
		/**
		 * Recruit a professor to teach
		 */
		p1.agreeToTeach(s8);
		p2.agreeToTeach(s7);
		p3.agreeToTeach(s6);
		p2.agreeToTeach(s5);
		p2.agreeToTeach(s4);
		p3.agreeToTeach(s3);
		p1.agreeToTeach(s2);
		p2.agreeToTeach(s1);
		p1.agreeToTeach(s9);
		p2.agreeToTeach(s10);

		System.out.println("################################################");
		System.out.println("STUDENT REGISTRATION HAS BEGUN");
		System.out.println("################################################");
		
//		System.out.println("Student: "+st1.getName()+" is attempting to register for "+s7.toString());
//		System.out.println("Student: "+st4.getName()+" is attempting to register for "+s7.toString());
//		EnrollmentStatus status = s7.enroll(st1);
//		EnrollmentStatus status1 = s7.enroll(st4);
//
//		System.out.println("The enrollmentStatus is: "+status);
//		System.out.println("The enrollmentStatus is: "+status1+" for "+st4.getName());
		
		attemptToEnroll(st1, s2, c6);
		attemptToEnroll(st2, s5, c1);
		attemptToEnroll(st3, s4, c3);
		attemptToEnroll(st4, s7, c4);	
		attemptToEnroll(st4, s9, c1);
		
		System.out.println();
		
		System.out.println("################################################");
		System.out.println("STUDENT GRADING HAS BEGUN");
		System.out.println("################################################");
		
		s7.postGrade(st4, "F");
		
		
		System.out.println();
		
		System.out.println("################################################");
		System.out.println("STUDENT SCHEDULE OF CLASSES");
		System.out.println("################################################");
		
		thisYearSchedule.display();
		
		System.out.println();
		
		nextYearSchedule.display();
		
		System.out.println();
		
		System.out.println("################################################");
		System.out.println("STUDENTS INFORMATION");
		System.out.println("################################################");
		
		st1.display();
		st2.display();
		st3.display();
		st4.display();
		
		System.out.println();
		
		System.out.println("################################################");
		System.out.println("PROFESSORS INFORMATION");
		System.out.println("################################################");
		
		p1.display();
		p2.display();
		p3.display();
				
		System.out.println();
	}

}
