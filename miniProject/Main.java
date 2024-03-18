package miniProject;

public class Main {

	public static void main(String[] args) {

		ContactManager manager = new ContactManager();
		Contact contact1 = new Contact("Luxor", "ll@gmail.com", "+26774789956");
		Contact contact2 = new Contact("Lex", "lex@gmail.com", "+26774999999");
		Contact contact3 = new Contact("Luther", "luther@gmail.com", "+26774000000");

		
		manager.addContact(contact1);
		manager.addContact(contact2);
		manager.addContact(contact3);

		manager.searchContact("Luther");
		//manager.showContacts();
	}

}
