package studentRegistrationSystem;

import java.util.ArrayList;

public class Transcript {
	
	/**
	 * Transcript attributes
	 */
	private ArrayList <TranscriptEntry> transcriptEntries;
	private Student studentOwner;
	
	/**
	 * Transcript constructor(s)
	 */
	public Transcript(Student studentOwner) {
		
		this.studentOwner = studentOwner;
		
		transcriptEntries = new ArrayList<TranscriptEntry>();

	}
	
	/**
	 * Transcript methods
	 */
	public boolean verifyCompletion(Course course) {
		
		boolean outcome = false;
		
		for(TranscriptEntry te : transcriptEntries) {
			
			Section section = te.getSection();
			
			if(section.isSectionOf(course)) {
				
				if(TranscriptEntry.isPassingGrade(te.getGrade())) {
					
					outcome = true;
					break;
				}
			}
		}
		
		return outcome;
	}
	

	public void addTranscriptEntry(TranscriptEntry te) {
		
		transcriptEntries.add(te);
	}
	
	public void display() {
		
		System.out.println("Transcript for "+studentOwner.getName());
		
		if(transcriptEntries.size() == 0) {
			
			System.out.println("NO transcript entries");
		}
		else {
			
			for(TranscriptEntry te : transcriptEntries) {
				
				Section sec = te.getSection();
				
				Course course = sec.getRepresentedCourse();
				
				ScheduleOfClasses soc = sec.getOfferedIn();
				
				System.out.println("Semester: "+ soc.getSemester()+"\nCourse No.: "+
				course.getCourseNo()+"\nCredits: "+course.getCredits()+"\nGrade received: "+te.getGrade());
				System.out.println("--------------------------");
			}
		}
	}

}
