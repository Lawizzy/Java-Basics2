package prescriptionSystem;

import java.util.ArrayList;
import java.util.HashMap;

public class PharmacyDoc {
	
	private String patientName;
	private String patientId;
	private String prescriberName;
	private String medsName;
	private String insuranceName;
	private HashMap<String, Customer> patient;
	private HashMap<String, Physician> pharmasist;
	private HashMap<Customer, Medication> prescription;
	private int prescriptionId;
	private ArrayList<String> checkupDates;
	
	public PharmacyDoc(String patientId, String patientName, String prescriberName, String medsName, String insuranceName, int prescriptionId) {
		
		this.patientId = patientId;
		this.patientName = patientName;
		this.prescriberName = prescriberName;
		this.medsName = medsName;
		this.insuranceName = insuranceName;
		this.prescriptionId = prescriptionId;
		
		patient = new HashMap<String, Customer>();
		pharmasist = new HashMap<String, Physician>();
		prescription = new HashMap<Customer, Medication>();
		
		checkupDates = new ArrayList<String>();
	}

	public PharmacyDoc(String customerId, String name, Object object, Object object2, Insurance insuranceProvider) {
		// TODO Auto-generated constructor stub
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPrescriberName() {
		return prescriberName;
	}

	public void setPrescriberName(String prescriberName) {
		this.prescriberName = prescriberName;
	}

	public String getMedsName() {
		return medsName;
	}

	public void setMedsName(String medsName) {
		this.medsName = medsName;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public HashMap<String, Customer> getPatient() {
		return patient;
	}

	public void setPatient(HashMap<String, Customer> patient) {
		this.patient = patient;
	}

	public HashMap<String, Physician> getPharmasist() {
		return pharmasist;
	}

	public void setPharmasist(HashMap<String, Physician> pharmasist) {
		this.pharmasist = pharmasist;
	}

	public HashMap<Customer, Medication> getPrescription() {
		return prescription;
	}

	public void setPrescription(HashMap<Customer, Medication> prescription) {
		this.prescription = prescription;
	}

	public int getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(int prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public ArrayList<String> getCheckupDates() {
		return checkupDates;
	}

	public void setCheckupDates(ArrayList<String> checkupDates) {
		this.checkupDates = checkupDates;
	}

}
