package prescriptionSystem;

public class Person {
	
	private String name;
	private String workPlace;
	private String title;
	private int tellphoneNumber;
	
	public Person(String name, String workPlace, String title, int tellphoneNumber) {
		
		this.name = name;
		this.workPlace = workPlace;
		this.title = title;
		this.tellphoneNumber = tellphoneNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWorkPlace() {
		return workPlace;
	}
	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getTellphoneNumber() {
		return tellphoneNumber;
	}
	public void setTellphoneNumber(int tellphoneNumber) {
		this.tellphoneNumber = tellphoneNumber;
	}
	
	

}
