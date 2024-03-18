package studentRegistrationSystem;

import java.util.HashMap;

public class ScheduleOfClasses {

	/**
	 * ScheduleofClasses attributes
	 */
	private String semester;
	private HashMap <String, Section> sectionsOffered;
	
	/**
	 * ScheduleOfClasses constructor(s)
	 */
	public ScheduleOfClasses(String semester) {
		
		this.semester = semester;
		sectionsOffered = new HashMap<String, Section>();
		
	}
	
	/**
	 * ScheduleOfClasses accessors
	 */
	public String getSemester() {
		return semester;
	}
	
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public HashMap<String, Section> getSectionsOffered() {
		return sectionsOffered;
	}
//	public void setSectionsOffered(HashMap<String, Section> sectionsOffered) {
//		this.sectionsOffered = sectionsOffered;
//	}
	
	
	/**
	 * ScheduleOfClasses methods
	 */
	public void addSection(Section sec) {
		
		String key = sec.getRepresentedCourse().getCourseNo()+"-"+sec.getSectionNo();
		sectionsOffered.put(key, sec);
		
		sec.setOfferedIn(this);
	}
	
	public Section findSection(String fullSectionNo) {
		
		return sectionsOffered.get(fullSectionNo);
	}
	
	public boolean isEmpty() {
		
		if(sectionsOffered.size() == 0) {
			
			return true;
		}
		else {
			
			return false;
		}
	}
	
	public void display() {
		
		System.out.println("Schedule of classes for "+getSemester());
		
		System.out.println();
		
		for(Section sec : sectionsOffered.values()) {
			
			sec.display();
			System.out.println();
		}
	}
	
}
