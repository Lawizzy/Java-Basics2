package prescriptionSystem;

public class Physician extends Person{
	
	private String workId;

	public Physician(String name, String workPlace, String title, int tellphoneNumber, String workId) {
		super(name, workPlace, title, tellphoneNumber);

		this.workId = workId;
	}

	public String getWorkId() {
		return workId;
	}

	public void setWorkId(String workId) {
		this.workId = workId;
	}

}
