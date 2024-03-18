package studentRegistrationSystem;

import java.util.ArrayList;
import java.util.Collection;

public class Student extends Person{
	
	/**
	 * Student attributes
	 */
	private String major;
	private String degree;
	private Transcript transcript;
	private ArrayList<Section> attends;
	
	/**
	 * Student constructor(s)
	 */
	public Student(String name, String schoolSecurityNumber, String major, String degree) {
		super(name, schoolSecurityNumber);
		
		this.setMajor(major);
		this.setDegree(degree);
		this.setTranscript(new Transcript(this));
		//Transcript trans = new Transcript();
		//this.setTranscript(trans);
		attends = new ArrayList<Section>();
	}
	
	public Student() {
		super();
		
		this.setMajor("?");
		this.setDegree("?");

	}
	
	public Student(String ssn) {
		super();
		
		this.setMajor("?");
		this.setDegree("?");
	}

	
	/**
	 * Student accessor methods
	 */
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Transcript getTranscript() {
		return transcript;
	}

	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
	}

	public ArrayList<Section> getAttends() {
		return attends;
	}

	public void setAttends(ArrayList<Section> attends) {
		this.attends = attends;
	}

	/**
	 * Student overriding the toString method from Person
	 */
	@Override
	public String toString() {
		return this.getName()+"("+this.getSchoolSecurityNumber()+")"+"["+this.getDegree()+"-"+this.getMajor()+"]";
	}
	
	/**
	 * Student overriding the Display method from Person
	 */
	public void display() {
		super.display();
		System.out.println("--------Student Personal Information--------");
		System.out.println("\tMajoring: "+ this.getMajor()+"\tDegree: "+this.getDegree());
		this.displayCourseSchedule();
		this.printTranscript();
		
		System.out.println();
	}
	
	/**
	 * Delegated method(s)
	 */
	public void addSection(Section section) {
		
		attends.add(section);
	}
	
	public void dropSection(Section section) {
		
		attends.remove(section);
	}
	
	public boolean isEnrolledIn(Section section) {
		if(attends.contains(section)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isCurrentllyEnrolledInSimilar(Section section1) {
		boolean foundMatch = false;
		
		Course course1 = section1.getRepresentedCourse();
		
		for(Section section2 : attends) {
			Course course2 = section2.getRepresentedCourse();
			
			// There is indeed a Section in the attends()
		    // ArrayList representing the same Course.
		    // Check to see if the Student is CURRENTLY
		    // ENROLLED (i.e., whether or not he or she has
		    // yet received a grade).  If there is no
	        // grade, he/she is currently enrolled; if
	        // there is a grade, then he/she completed
			// the course sometime in the past.
			if(course1 == course2) {
				if(section2.getGrade(this) == null) {
					
					// No grade was assigned!  This means
				    // that the Student is currently
					// enrolled in a Section of this
					// same Course.
					foundMatch = true;
					break;
				}
			}
		}
		return foundMatch;
	}
	
	public Collection <Section> getEnrolledSections(){
		
		return attends;
	}
	
	public void printTranscript() {
		
		this.getTranscript().display();
		
		//Long alternative
		//Transcript t = this.getTranscript();
		//t.display();
	}
	
	/**
	 * Student methods
	 */
	public void displayCourseSchedule() {
		
		//Intended output
		
//		Course Schedule for Fred Schnurd
//		  Course No.:  CMP101
//		  Section No.:  2
//		  Course Name:  Beginning Computer Technology
//		  Meeting Day and Time Held:  W - 6:10 - 8:00 PM
//		  Room Location:  GOVT202
//		  Professor's Name:  Claudio Cioffi
		
		System.out.println("Course schedule for "+this.getName());
		
		for(Section sec : attends) {
			if(sec.getGrade(this) == null) { 
				System.out.println("CourseNo.: "+sec.getRepresentedCourse().getCourseNo()+"\nSection No.: "+sec.getSectionNo()+
						"\nCourse Name: "+sec.getRepresentedCourse().getCourseName()+"\nMeeting Day and Time Held: "+sec.getTimeOfDay()+
						"\nRoom Location: "+sec.getRoom()+"\nProfessor's Name: "+sec.getInstructor().getName());
				System.out.println("-------------------------");
			}
		}
	}

}
