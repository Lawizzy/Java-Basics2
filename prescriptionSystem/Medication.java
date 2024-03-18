package prescriptionSystem;

import java.util.ArrayList;

public class Medication {
	
	private String name;
	private String issueDate;
	private String expiryDate;
	private int numberOfRefill;
	private int numberOfUnitOfRefill;
	private boolean hasGeneric;
	private ArrayList<String> sideEffects;
	private ArrayList<Medication> genericMedication;
	private String dosage;
	private int quantity;
	
	public Medication(String name, String issueDate, String expiryDate, int numberOfRefill,
			int numberOfUnitOfRefill, boolean hasGeneric, String dosage, int quantity) {
		
		this.name = name;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
		this.numberOfRefill = numberOfRefill;
		this.numberOfUnitOfRefill = numberOfUnitOfRefill;
		this.hasGeneric = hasGeneric;
		sideEffects = new ArrayList<String>();
		genericMedication = new ArrayList<Medication>();
		this.dosage = dosage;
		this.quantity = quantity;
	}
	
	public Medication() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getNumberOfRefill() {
		return numberOfRefill;
	}

	public void setNumberOfRefill(int numberOfRefill) {
		this.numberOfRefill = numberOfRefill;
	}

	public int getNumberOfUnitOfRefill() {
		return numberOfUnitOfRefill;
	}

	public void setNumberOfUnitOfRefill(int numberOfUnitOfRefill) {
		this.numberOfUnitOfRefill = numberOfUnitOfRefill;
	}

	public boolean isHasGeneric() {
		return hasGeneric;
	}

	public void setHasGeneric(boolean hasGeneric) {
		this.hasGeneric = hasGeneric;
	}

	public ArrayList<String> getSideEffects() {
		return sideEffects;
	}
	
	public ArrayList<Medication> getGenericMedication() {
		return genericMedication;
	}

	public void setGenericMedication(ArrayList<Medication> genericMedication) {
		this.genericMedication = genericMedication;
	}

	public void setSideEffects(ArrayList<String> sideEffects) {
		this.sideEffects = sideEffects;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
