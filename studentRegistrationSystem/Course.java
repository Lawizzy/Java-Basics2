package studentRegistrationSystem;

import java.util.ArrayList;
import java.util.Collection;

public class Course {

	/**
	 * Course attributes
	 */
	private String courseNo;
	private String courseName;
	private double credits;
	private ArrayList <Section> offeredAsSection;
	private ArrayList <Course> prerequisites;
	private static int newSectionNumber = 0;
	
	/**
	 * Course constructors
	 */
	public Course(String courseNo, String courseName, double credits) {
		this.courseNo = courseNo;
		this.courseName = courseName;
		this.credits = credits;
		
		offeredAsSection = new ArrayList<Section>();
		prerequisites = new ArrayList<Course>();
	}
	
	
	/**
	 * Course accessor methods
	 */
	public String getCourseNo() {
		return courseNo;
	}

	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}

	public ArrayList<Section> getOfferedAsSection() {
		return offeredAsSection;
	}

	public void setOfferedAsSection(ArrayList<Section> offeredAsSection) {
		this.offeredAsSection = offeredAsSection;
	}

	public void setPrerequisites(ArrayList<Course> prerequisites) {
		this.prerequisites = prerequisites;
	}

	public Collection <Course> getPrerequisites(){
		
		return prerequisites;
	}

	
	/**
	 * Course methods
	 */
	public boolean hasPrerequisites() {
		
		if(prerequisites.size() > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void addPrerequisites(Course course) {
		
		
		if(course != this) {
			
			prerequisites.add(course);

		}
		else {
			
			System.out.println("Course "+course.getCourseName()+" cants be added as its own prerequisite");
		}

	}
	
		
	public Section scheduleSection(char day, String time, String room, int capacity) {
		
		Section section = new Section(offeredAsSection.size() + newSectionNumber++, day, time, this, room, capacity);
		this.addSection(section);
		
		return section;
	}
	
	public void addSection(Section section) {
		
		offeredAsSection.add(section);
	}
	
	public void cancelSection(Section section) {
		
		System.out.println("Section "+section.getSectionNo()+" has been removed");
		offeredAsSection.remove(section);
	}

}
