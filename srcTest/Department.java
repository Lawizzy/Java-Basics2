package srcTest;

public class Department {
	
	private String name;
	private Professor chairman;
	
	public Department(String name) {
		super();
		this.name = name;
	}
	
	public Department(String name, Professor chairman) {
		super();
		this.name = name;
		this.chairman = chairman;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Professor getChairman() {
		return chairman;
	}
	public void setChairman(Professor chairman) {
		this.chairman = chairman;
	}
	
	

}
