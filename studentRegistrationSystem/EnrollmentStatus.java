package studentRegistrationSystem;

public enum EnrollmentStatus {

	success("enrollemnt successful!! :o"),
	secFul("enrollment failed!! As no seats left :p"),
	prereq("enrollment failed as prerequisites not satisfied!! :p"),
	prevEnroll("enrollement failed!! As was previouly enrolled :p");
	
	private final String value;
	
	EnrollmentStatus(String value){
		
		this.value = value;
	}
	
	public String value() {
		
		return value;
	}
	
}
