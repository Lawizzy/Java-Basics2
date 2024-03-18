package studentRegistrationSystem;

public class TranscriptEntry {
	
	/**
	 * TranscriptEntry attributes
	 */
	private String grade;
	private Student student;
	private Section section;
	private Transcript transcript;
	
	/**
	 * TranscriptEntry constructor(s)
	 */
	public TranscriptEntry(Student student, String grade, Section section){
		
		this.setStudent(student);
		this.setGrade(grade);
		this.setSection(section);
		
		Transcript ts = student.getTranscript();
		this.setTranscript(ts);
		ts.addTranscriptEntry(this);
	}
	
	/**
	 * TranscriptEntry accessors
	 */
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public Transcript getTranscript() {
		return transcript;
	}

	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
	}
	
	/**
	 * TranscriptEntry methods
	 */
	public static boolean validateGrade(String grade) {
		
		boolean outcome = false;
		
		if(grade.equals("F") || grade.equals("I")) {
			
			outcome = true;
		}
		if(grade.startsWith("A") || grade.startsWith("B") || grade.startsWith("C") || grade.startsWith("D")) {
			
			if(grade.length() == 2) {
				
				if(grade.endsWith("+") || grade.endsWith("-")) {
					
					outcome = true;
				}
			}
		}
		
		return outcome;
	}
	
	public static boolean isPassingGrade(String grade) {
		
		boolean outcome = false;
		
		if(validateGrade(grade)) {
			
			if(grade.startsWith("A") || grade.startsWith("B") || grade.startsWith("C") || grade.startsWith("D")) {
				
				outcome = true;
			}
		}
		
		return outcome;
	}
	
	

}
