package prescriptionSystem;

import java.util.ArrayList;

public class SystemMain {
	
	public static ArrayList<Physician> physicianUnion;
	public static ArrayList<Pharmacy> pharmacyRep;
	public static ArrayList<Customer> people;
	public static ArrayList<Insurance> insuranceProvider;
	public static ArrayList<Medication> pharmaceticals;

	public static void main(String[] args) {
		
		Physician pu1, pu2, pu3;
		Pharmacy pr1, pr2;
		Customer p1, p2, p3, p4;
		Insurance i1, i2;
		Medication m1, m2, m3, m4;
		
		pu1 = new Physician("Luxor Luther", "Mogoditshane", "Pharmacist", 74782256, "wecr5567");
		pu2 = new Physician("Kamogelo Mosh", "Tsabong", "Physician", 71835968, "oigiiu788");
		pu3 = new Physician("Klaus Drac", "London", "Surgen", 78963514, "weovg675v");
		
		pr1 = new Pharmacy("Tsoga O Tsamaye Pharmacy");
		pr2 = new Pharmacy("One apple Pharmacy");
		
		i1 = new Insurance("BIPOMAS Insurance", 34896521, "Gaborone");
		i2 = new Insurance("PULA Insurance", 34789422, "Kgalagadi");
		
		p1 = new Customer("Kerileng Gontsejang", "G North", "Police Officer", 7895412, "20/09/1930", "13343g", i1, pr2);
		p2 = new Customer("Gopadile Lekagape", "Block 5", "Nurse", 39874521, "05/12/2000", "1234t", i2, pr1);
		p3 = new Customer("Malome Kenna", "G west", "Self employeed", 74125489, "13/02/1903", "1234b", i1, pr2);
		p4 = new Customer("Kganka Yomongwe", "Mmopane", "Accountant", 77895412, "04/03/1980", "1234v", i2, pr1);
		
		m1 = new Medication("Paracetamol", "24/07/2023", "24/07/2025", 2, 45, true, "3 times per day", 2);
		m2 = new Medication("Penicelin", "24/07/2023", "24/07/2025", 6, 10, true, "2 times per day", 5);
		m3 = new Medication("Amoxycilin", "24/07/2023", "24/07/2025", 3, 5, false, "3 times per day", 7);
		m4 = new Medication("Cough syrup", "24/07/2023", "24/07/2025", 1, 85, false, "Once per day", 1);
		
		
		
		physicianUnion = new ArrayList<Physician>();
		physicianUnion.add(pu1);
		physicianUnion.add(pu2);
		physicianUnion.add(pu3);
		
		pharmacyRep = new ArrayList<Pharmacy>();
		pharmacyRep.add(pr1);
		pharmacyRep.add(pr2);
		
		people = new ArrayList<Customer>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		
		insuranceProvider = new ArrayList<Insurance>();
		insuranceProvider.add(i1);
		insuranceProvider.add(i2);
		
		pharmaceticals = new ArrayList<Medication>();
		pharmaceticals.add(m1);
		pharmaceticals.add(m2);
		pharmaceticals.add(m3);
		pharmaceticals.add(m4);

		
		
		pr1.addEmployee(pu1);
		pr2.addEmployee(pu2);
		pr1.addEmployee(pu3);
		
		pr1.allPharmacyEmployees();
		pr2.allPharmacyEmployees();
		
		pr1.registerCustomer(p4);
		pr1.registerCustomer(p3);
		pr2.registerCustomer(p2);
		pr2.registerCustomer(p1);
		
		i1.registerClient(p1);
		i2.registerClient(p3);
		i1.registerClient(p4);
		i1.registerClient(p2);
		
		pr1.allPharmacyClients();
		pr2.allPharmacyClients();
		
		pr1.stockMedication(m1);
		pr1.stockMedication(m2);
		pr1.stockMedication(m3);
		pr2.stockMedication(m4);
		
		pr1.allPharmacyMedication();
		pr2.allPharmacyMedication();
		
		pr1.registerPrescription(p4, pu3, m2, i2, "CheckUpDate");
		pr1.registerPrescription(p4, pu3, m3, i2, "CheckUpDate");

		//pr2.registerPrescription(p2, pu1, m1, i1, "CheckUpDate");
		pr2.registerPrescription(p2, pu2, m4, i1, "CheckUpDate");

		
		pr1.allPharmacyDocs();
		pr2.allPharmacyDocs();
		
		pr1.allPharmacyMedication();
		
		//pr2.removePrescription(1);
		
		pr2.allPharmacyDocs();
		
		pr1.eachClientPrescription("1234v");
		pr2.eachClientPrescription("1234b");
		
		

		
	}

}
