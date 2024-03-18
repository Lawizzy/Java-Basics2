package prescriptionSystem;

import java.util.ArrayList;

public class Insurance {
	
	private String name;
	private int tellphoneNumber;
	private String location;
	private ArrayList<Customer> clients;
	
	public Insurance(String name, int tellphoneNumber, String location) {
		
		this.name = name;
		this.tellphoneNumber = tellphoneNumber;
		this.location = location;
		clients = new ArrayList<Customer>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTellphoneNumber() {
		return tellphoneNumber;
	}

	public void setTellphoneNumber(int tellphoneNumber) {
		this.tellphoneNumber = tellphoneNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public ArrayList<Customer> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Customer> clients) {
		this.clients = clients;
	}
	
	
	public void registerClient(Customer customer) {
		
		clients.add(customer);
	}
	

}
