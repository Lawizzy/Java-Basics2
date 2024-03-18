package srcTest;

public class Professor extends Teacher{
	
	private String name;
	private String employeeId;
	private String dateOfBirth;
	private String address;
	private Student advisee;
	private Department worksFor;
	
	public Professor(String name, String employeeId, String dateOfBirth, String address, Student advisee,
			Department worksFor) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.advisee = advisee;
		this.worksFor = worksFor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
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

	public Student getAdvisee() {
		return advisee;
	}

	public void setAdvisee(Student advisee) {
		this.advisee = advisee;
	}

	public Department getWorksFor() {
		return worksFor;
	}

	public void setWorksFor(Department worksFor) {
		this.worksFor = worksFor;
	}

	//method testing, foo can see both bar and bar2 because they are within the same scope
	public void bar2() {
		
	}
	
	public void foo() {
		
		bar();
		bar2();
	}
	
	public void bar() {
		
	}

}
