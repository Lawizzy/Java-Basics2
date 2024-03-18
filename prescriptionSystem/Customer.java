package prescriptionSystem;

import java.util.ArrayList;

public class Customer extends Person{
	
	private String DOB;
	private Insurance insuranceProvider;
	private ArrayList<PharmacyDoc> prescriptionHistory;
	private String customerId;
	private Pharmacy pharmacy;
	
	public Customer(String name, String workPlace, String title, int tellphoneNumber, String DOB, String customerId, Insurance insuranceProvider, Pharmacy pharmacy) {
		super(name, workPlace, title, tellphoneNumber);

		this.DOB = DOB;
		this.insuranceProvider = insuranceProvider;
		this.pharmacy = pharmacy;
		prescriptionHistory = new ArrayList<PharmacyDoc>();
		this.customerId = customerId;
		
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public Insurance getInsuranceProvider() {
		return insuranceProvider;
	}

	public void setInsuranceProvider(Insurance insuranceProvider) {
		this.insuranceProvider = insuranceProvider;
	}

	public ArrayList<PharmacyDoc> getPrescriptionHistory() {
		return prescriptionHistory;
	}

	public void setPrescriptionHistory(ArrayList<PharmacyDoc> prescriptionHistory) {
		this.prescriptionHistory = prescriptionHistory;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public Pharmacy getPharmacy() {
		return pharmacy;
	}

	public void setPharmacy(Pharmacy pharmacy) {
		this.pharmacy = pharmacy;
	}
	

}
