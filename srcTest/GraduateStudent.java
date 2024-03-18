package srcTest;

public class GraduateStudent extends Student{
	
	private String undergraduateDegree;
	private String undergraduateInstitution;
	
	public GraduateStudent(String name, String studentId, String dateOfBirth, String address, Department major,
			double gpa, Professor advicer, String undergraduateDegree, String undergraduateInstitution) {
		
		super(name, studentId, dateOfBirth, address, major, gpa, advicer);

		this.undergraduateDegree = undergraduateDegree;
		this.undergraduateInstitution = undergraduateInstitution;
	
	}
	
	public String getUndergraduateDegree() {
		return undergraduateDegree;
	}
	public void setUndergraduateDegree(String undergraduateDegree) {
		this.undergraduateDegree = undergraduateDegree;
	}
	public String getUndergraduateInstitution() {
		return undergraduateInstitution;
	}
	public void setUndergraduateInstitution(String undergraduateInstitution) {
		this.undergraduateInstitution = undergraduateInstitution;
	}
	
	public void print() {
		super.print();
		System.out.println("Undergraduate Degree: "+this.getUndergraduateDegree()+
				"\nUndergraduate Institution: "+this.getUndergraduateInstitution());
	}
	
	

}
