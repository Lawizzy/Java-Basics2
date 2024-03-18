package srcTest;

public class Student extends Teacher{
	
	private String name;
	private String studentId;
	private String dateOfBirth;
	private String address;
	private Department major;
	private double gpa;
	private Professor advicer;
	
	public Student(String name, String studentId, String dateOfBirth, String address, Department major, double gpa,
			Professor advicer) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.major = major;
		this.gpa = gpa;
		this.advicer = advicer;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Department getMajor() {
		return major;
	}
	public void setMajor(Department major) {
		this.major = major;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public Professor getAdvicer() {
		return advicer;
	}
	public void setAdvicer(Professor advicer) {
		this.advicer = advicer;
	}
	
	public void print() {
		System.out.println("****************************\n-BAC student-\nStudent Name: "+ this.getName()+
				"\nStudent ID: "+this.getStudentId()+
				"\nDate of birth: "+this.getDateOfBirth()+
				"\nAddress: "+this.getAddress()+
				"\nMajor: "+this.getMajor().getName()+
				"\nGPA: "+this.getGpa()+
				"\nAdviser: "+this.getAdvicer().getName());
	}
	
	
	
}
