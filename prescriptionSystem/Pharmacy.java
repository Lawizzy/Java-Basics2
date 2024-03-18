package prescriptionSystem;

import java.util.ArrayList;

public class Pharmacy {
	
	/**
	 * Attributes
	 */
	private String name;
	private ArrayList<Medication> medicationInStore;
	private static int prescriptionId = 0;
	private ArrayList<Physician> employees;
	private ArrayList<Customer> customers;
	private ArrayList<PharmacyDoc> pharmacyDocs;
	private ArrayList<Medication> prescribedMedication;	
	private ArrayList<String> customerCheckupDate;
	
	/**
	 * Constructor
	 * @param name
	 */
	public Pharmacy(String name) {
		
		this.name = name;
		medicationInStore = new ArrayList<Medication>();
		employees = new ArrayList<Physician>();
		customers = new ArrayList<Customer>();
		pharmacyDocs = new ArrayList<PharmacyDoc>();
		prescribedMedication = new ArrayList<Medication>();
		customerCheckupDate = new ArrayList<>();
	}

	/**
	 * Accessor methods
	 * @return
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Medication> getMedicationInStore() {
		return medicationInStore;
	}

	public void setMedicationInStore(ArrayList<Medication> medicationInStore) {
		this.medicationInStore = medicationInStore;
	}

	public int getPrescriptionId() {
		return prescriptionId;
	}

	public ArrayList<Physician> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Physician> employees) {
		this.employees = employees;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}
	
	public ArrayList<PharmacyDoc> getPharmacyDocs() {
		return pharmacyDocs;
	}

	public void setPharmacyDocs(ArrayList<PharmacyDoc> pharmacyDocs) {
		this.pharmacyDocs = pharmacyDocs;
	}

	public ArrayList<Medication> getPrescribedMedication() {
		return prescribedMedication;
	}

	public void setPrescribedMedication(ArrayList<Medication> prescribedMedication) {
		this.prescribedMedication = prescribedMedication;
	}

	public ArrayList<String> getCustomerCheckupDate() {
		return customerCheckupDate;
	}

	public void setCustomerCheckupDate(ArrayList<String> customerCheckupDate) {
		this.customerCheckupDate = customerCheckupDate;
	}

	/**
	 * Methods
	 */
	public void registerCustomer(Customer customer) {
		
		customers.add(customer);
	}
	
	public void stockMedication(Medication meds) {
		
		medicationInStore.add(meds);
	}
	
	public void addGenericMeds(Medication med, Medication generic) {
		
		for(int i = 0; i < medicationInStore.size(); i++) {
			
			Medication meds = medicationInStore.get(i);
			
			
			if(meds.isHasGeneric() == true && medicationInStore.contains(meds)) {
				
				//meds.setGenericMedication();
				if(medicationInStore.contains(generic)) {
					
					//ArrayList<Medication> gen = new Medication.
					
				}
			}
		}
	}
	
	public void addEmployee(Physician employee) {
		
		employees.add(employee);
	}
	
	public PharmacyDoc registerPrescription(Customer customer, Physician physician, Medication meds, Insurance insurance, String checkupdate) {
		
		
		PharmacyDoc doc = new PharmacyDoc(customer.getCustomerId(), customer.getName(), physician.getName(), 
				meds.getName(), insurance.getName(), prescriptionId++);
		if(meds.getQuantity() != 0) {

			this.addPrescription(doc);
			this.customers.add(customer);
			this.prescribedMedication.add(meds);
			
			while(meds.getNumberOfRefill() < customerCheckupDate.size()) {
				
				customerCheckupDate.add(checkupdate);
			}
			
			int minus = meds.getQuantity();
			minus--;

			meds.setQuantity(minus);
		}
		if(meds.getQuantity() == 0 && meds.isHasGeneric() == true) {
			
			System.out.println(meds.getName()+" is sold Out but Has generic, will be given a subtitute medication");
			
		}
		if(meds.getQuantity() == 0 && meds.isHasGeneric() == false){
			System.out.println(meds.getName()+" is Sold Out, please try next pharmacy");
			this.autoRemovePrescription(doc);
			
		}
		return doc;
		
	}
	
	private void addPrescription(PharmacyDoc doc) {
		
		pharmacyDocs.add(doc);
	}
	
	private void autoRemovePrescription(PharmacyDoc doc) {
		
		pharmacyDocs.remove(doc);
	}
	
	public void removePrescription(int prescritiionId) {
		
		for (int i = 0; i < pharmacyDocs.size(); i++) {
			
			PharmacyDoc doc = pharmacyDocs.get(i);
			
			if(prescritiionId == doc.getPrescriptionId()) {
				
				this.autoRemovePrescription(doc);
			}
			else {
				
				System.out.println("No id exists");
			}
		}
	}
	
	public void refillMedication(int prescrictionId) {
		
		for(int i = 0; i < pharmacyDocs.size(); i++) {
			
			PharmacyDoc doc = pharmacyDocs.get(i);
			
			
			
			if(doc.getPrescriptionId() == prescriptionId) {
				
				for(int j = 0; i < prescribedMedication.size(); j++) {
					
					Medication meds = prescribedMedication.get(j);
					
					if(doc.getCheckupDates().size() <= meds.getNumberOfRefill()) {
						
						System.out.println("Authorised for refill");
					}
					else {
						
						System.out.println("Sorry, more than authorised refill");
					}
				}				
				
			}
			
		}
		
	}
	
	public void allPharmacyEmployees() {
		
		for(Physician physician : employees) {
			
			System.out.println("************************************************");
			System.out.println("Employees from: "+this.name+"\nWork ID: "+physician.getWorkId()+
					"\nEmployee Name: "+physician.getName()+"\nTitle: "+physician.getTitle());
			System.out.println("************************************************\n");

		}
	}
	
	public void allPharmacyClients() {
		
		for(Customer customer : customers) {
			
			System.out.println("************************************************");
			System.out.println("Client of: "+this.name+"\nClient's ID: "+customer.getCustomerId()+"\nName(s): "+customer.getName()+
					"\nWork place: "+customer.getWorkPlace()+"\nTitle: "+customer.getTitle()+"\nTel/Cell Number: "+customer.getTellphoneNumber()+
					"\nDate of Birth: "+customer.getDOB()+"\nInsurance provider: "+customer.getInsuranceProvider().getName());
			System.out.println("************************************************\n");

		}
	}
	
	public void allPharmacyMedication() {
		
		for(Medication meds : medicationInStore) {
			
			System.out.println("************************************************");
			System.out.println("Medication from: "+this.name+"\nMedication Name: "+meds.getName()+
					"\nExpiry Date: "+meds.getExpiryDate()+"\nDosage: "+meds.getDosage()+"\nInStock: "+meds.getQuantity()+" left");
			System.out.println("************************************************\n");

		}
	}
	
	public void allPharmacyDocs() {
		
		
		
		for(int i = 0; i < pharmacyDocs.size(); i++) {
			
			PharmacyDoc doc = pharmacyDocs.get(i);
			
			System.out.println("************************************************");
			System.out.println("Prescription from: "+this.name+"\nCustomer ID: "+doc.getPatientId()+"\nCustomer Name: "+doc.getPatientName()+"\nPatient prescriptionId: "+doc.getPrescriptionId()+
					"\nIssued by: "+doc.getPrescriberName()+"\nPrescribed Medication: "+doc.getMedsName()+"\nInsurance covered: "+doc.getInsuranceName());
			System.out.println("************************************************\n");

		}
	}
	
	public void eachClientPrescription(String clientId) {

		for(int i = 0; i < pharmacyDocs.size(); i++) {

			PharmacyDoc doc = pharmacyDocs.get(i);

			if(doc.getPatientId().equals(clientId)) {

				for(Medication meds: prescribedMedication) {

					System.out.println("************************************************");
					System.out.println("Prescription for: "+doc.getPatientName()+"\nCustomer ID: "+
							doc.getPatientId()+"\nPatient prescriptionId: "+doc.getPrescriptionId()+
							"\nIssued by: "+doc.getPrescriberName()+"\nPrescribed Medication: "+
							doc.getMedsName()+"\nDosage: "+meds.getDosage()+"\nIssue date: "+meds.getIssueDate()+"\nExpiry Date: "+meds.getExpiryDate()+"\nMedication left: "+
							meds.getNumberOfUnitOfRefill()+"\nNumber of refills authorised: "+meds.getNumberOfRefill()+
							"\nInsurance covered: "+doc.getInsuranceName());
					System.out.println("************************************************\n");

				}

			}

		}


	}
	

}
