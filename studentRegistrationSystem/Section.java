package studentRegistrationSystem;

import java.util.HashMap;

public class Section {

	/**
	 * Section attributes
	 */
	private int sectionNo;
	private char dayOfWeek;
	private String timeOfDay;
	private String room;
	private int seatingCapacity;
	private HashMap<String, Student> enrolledStudents;
	private HashMap<Student, TranscriptEntry> assignedGrade;
	private Course representedCourse;
	private Professor instructor;
	private ScheduleOfClasses offeredIn;
	
	/**
	 * Section constructor(s)
	 */
	public Section(int sectionNo, char dayOfWeek, String timeOfDay, Course course, String room, int seatingCapacity) {
		
		this.sectionNo = sectionNo;
		this.dayOfWeek = dayOfWeek;
		this.timeOfDay = timeOfDay;
		this.representedCourse = course;
		this.room = room;
		this.seatingCapacity = seatingCapacity;
		
		this.setInstructor(null);
		
		enrolledStudents = new HashMap<String, Student>();
		assignedGrade = new HashMap<Student, TranscriptEntry>();
	}
	
	/**
	 * Section accessor methods
	 */
	public int getSectionNo() {
		return sectionNo;
	}

	
	public void setSectionNo(int sectionNo) {
		this.sectionNo = sectionNo;
	}

	public char getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(char dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public String getTimeOfDay() {
		return timeOfDay;
	}

	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public HashMap<String, Student> getEnrolledStudent() {
		return enrolledStudents;
	}

	public void setEnrolledStudent(HashMap<String, Student> enrolledStudent) {
		this.enrolledStudents = enrolledStudent;
	}

	public HashMap<Student, TranscriptEntry> getAssignedGrade() {
		return assignedGrade;
	}

	public void setAssignedGrade(HashMap<Student, TranscriptEntry> assignedGrade) {
		this.assignedGrade = assignedGrade;
	}
	
	public Course getRepresentedCourse() {
		return representedCourse;
	}

	public void setRepresentedCourse(Course representedCourse) {
		this.representedCourse = representedCourse;
	}

	public Professor getInstructor() {
		return instructor;
	}

	public void setInstructor(Professor instructor) {
		this.instructor = instructor;
	}

	public ScheduleOfClasses getOfferedIn() {
		return offeredIn;
	}

	public void setOfferedIn(ScheduleOfClasses offeredIn) {
		this.offeredIn = offeredIn;
	}

	/**
	 * Section methods
	 */
	public EnrollmentStatus enroll(Student student, Course prerequisites) {
		
		Transcript transcript = student.getTranscript();
		
		if(student.isCurrentllyEnrolledInSimilar(this) || transcript.verifyCompletion(this.getRepresentedCourse())) {
			
			return EnrollmentStatus.prevEnroll;
		}
		
		Course course = this.getRepresentedCourse();
		
		if(course.hasPrerequisites()) {
			
			for(Course pre : course.getPrerequisites()) {
				
				if(!transcript.verifyCompletion(pre)) {
					
					return EnrollmentStatus.prereq;
				}
				
			}
		}
		
		if(!this.confirmSeatAvailability()) {
			
			return EnrollmentStatus.secFul;
		}
		
		enrolledStudents.put(student.getSchoolSecurityNumber(), student);
		student.addSection(this);
		
		return EnrollmentStatus.success;
	}
	
	
	public boolean drop(Student student) {
		
		if(!student.isEnrolledIn(this)) {
			return false;
		}
		else {
			enrolledStudents.remove(student.getSchoolSecurityNumber());
			student.dropSection(this);
			return true;
		}
	}
	
	public boolean postGrade(Student student, String grade) {
		
		if(!TranscriptEntry.validateGrade(grade)) {
			
			return false;
		}
		else {
			
			if(assignedGrade.get(student) != null) {
				
				return false;
			}
			else {
				
				TranscriptEntry te = new TranscriptEntry(student, grade, this);
				assignedGrade.put(student, te);
				return true;
			}
		}
	}
	
//	public boolean eraseGrade(Student student, String grade) {
//		
//		
//	}
	
	public String getGrade(Student student) {
		
		String grade = null;
		
		TranscriptEntry te = assignedGrade.get(student);
		
		if(te != null) {
			
			grade = te.getGrade();
		}
		
		return grade;
	}
	
	private boolean confirmSeatAvailability() {
		
		if(enrolledStudents.size() < this.getSeatingCapacity()) {
			
			return true;
		}
		else {
			
			return false;
		}
	}
	
	public boolean isSectionOf(Course course) {
		
		if(course == representedCourse) {
			
			return true;
		}
		else {
			
			return false;
		}
	}
	
	public int getTotalEnrollments() {
		return enrolledStudents.size();
	}
	
	public void display() {
		
		System.out.println("Section Info:");
		System.out.println("\t Course preRequisite: "+getRepresentedCourse().hasPrerequisites());
		System.out.println("CourseNo.: "+getRepresentedCourse().getCourseNo()+"\nSection No.: "+getSectionNo()+
				"\nCourse Name: "+getRepresentedCourse().getCourseName()+"\nMeeting Day and Time Held: "+getDayOfWeek()+"-"+getTimeOfDay()+
				"\nRoom Location: "+getRoom()+"\nProfessor's Name: "+getInstructor().getName());
		System.out.println("-------------------------");
		displayStudentRoster();
	}
	
	public void displayStudentRoster() {
		
		if(getTotalEnrollments() == 0) {
			
			System.out.println("No students yet");
		}
		else {
			
			System.out.println("Total of "+getTotalEnrollments()+" students enrolled");
			
			System.out.println("Namely: ");
			
			for(Student st : enrolledStudents.values()) {
				
				System.out.println("\t"+st.getName());
			}

		}
		
	}
	
	/**
	 * Section toString method
	 */
	public String toString() {
		
		return "Course: "+getRepresentedCourse().getCourseNo()+
				" -Section No.: "+getSectionNo()+" -Day of the week: "+getDayOfWeek()+" -Time: "+getTimeOfDay();
	}
	
	
}
