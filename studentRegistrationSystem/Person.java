package studentRegistrationSystem;

public abstract class Person {
	
	/**
	 * Person attributes
	 */
	private String name;
	private String schoolSecurityNumber;
	
	/**
	 * Person constructor(s)
	 */
	
	public Person (String name, String schoolSecurityNumber){
		
		this.setName(name);;
		this.setSchoolSecurityNumber(schoolSecurityNumber);
	}
	
	public Person (){
		
		this.setName("?");
		this.setSchoolSecurityNumber("???-???-???");
	}

	/**
	 * Person accessor methods
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchoolSecurityNumber() {
		return schoolSecurityNumber;
	}

	public void setSchoolSecurityNumber(String schoolSecurityNumber) {
		this.schoolSecurityNumber = schoolSecurityNumber;
	}
	
	/**
	 * Person overriding the toString method(for all children usage)
	 */
	@Override
	public abstract String toString();
	
	/**
	 * Display method for testing purposes
	 */
	public void display() {
		System.out.println("--------Personal Information--------");
		System.out.println("\tName(s): "+ this.getName()+"\tSSN: "+this.getSchoolSecurityNumber());
	}
}
