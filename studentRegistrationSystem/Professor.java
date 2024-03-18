package studentRegistrationSystem;

import java.util.ArrayList;

public class Professor extends Person{
	
	/**
	 * Professor attributes
	 */
	private String title;
	private String department;
	private ArrayList<Section> teaches;
	
	/**
	 * Professor constructor(s)
	 */
	public Professor(String name, String schoolSecurityNumber, String title, String department) {
		super(name, schoolSecurityNumber);

		this.setTitle(title);
		this.setDepartment(department);
		teaches = new ArrayList<>();
		
	}
	
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Professor accessor methods
	 */
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public ArrayList<Section> getTeaches() {
		return teaches;
	}

	public void setTeaches(ArrayList<Section> teaches) {
		this.teaches = teaches;
	}
	
	/**
	 * Professor methods
	 */
	public void agreeToTeach(Section section) {
		
		boolean hasMatch = false;
		
		for(Section sec : teaches) {
			
			if(section.getTimeOfDay() == sec.getTimeOfDay() && section.getDayOfWeek() == sec.getDayOfWeek()) {
				
				//System.out.println("Checking from professor");
				hasMatch = true;
				break;
			}
		}
		
		if(!hasMatch) {
			
			teaches.add(section);
			section.setInstructor(this);
			
		}
		else {
			teaches.remove(section);
			section.setInstructor(this);
			System.out.println("Due to a clashing date and time "+section.getRepresentedCourse().getCourseName()+" was removed from session for "+this.getName());
		}

		

	}

	public void displayTeachingAssignments() {
		
		System.out.println("Teaching assignments for "+getName()+" :");
		
		if(teaches.size() == 0) {
			
			System.out.println("\tNone");
		}
		else {
			
			for(Section sec : teaches) {
				
				System.out.println("Course No.: "+sec.getRepresentedCourse().getCourseNo()+
						"\nSection No.: "+sec.getSectionNo()+"\nCourse Name: "+
						sec.getRepresentedCourse().getCourseName()+"\nTime and Day: "+
						sec.getTimeOfDay()+"-"+sec.getDayOfWeek()+"\n-----------------");
			}
		}
		
	}


	/**
	 * Professor overriding the toString method from Person
	 */
	@Override
	public String toString() {
		return this.getTitle()+"["+this.getDepartment()+"]";
	}
	
	/**
	 * Professor overriding the Display method from Person
	 */
	public void display() {
		super.display();
		System.out.println("--------Professor Personal Information--------");
		System.out.println("\tTitle: "+ this.getTitle()+"\tDepartment: "+this.getDepartment());
		displayTeachingAssignments();
		
		System.out.println();
	}
	
}
