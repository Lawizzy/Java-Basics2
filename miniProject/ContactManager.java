package miniProject;

public class ContactManager {
	
	//Contact contact = new Contact();
	
	Contact [] myFriends;
	
	int friendsCount = 0;
	
	ContactManager(){
		
		this.friendsCount = 0;
		this.myFriends = new Contact[200];
	}
	
	void addContact(Contact contact) {
		
		myFriends[friendsCount] = contact;
		friendsCount ++;
		
	}
	
	void showContacts() {
		
		for(int i = 0; i < myFriends.length; i++) {
			
			System.out.println(myFriends[i].name);
		}
	}
	
	Contact searchContact(String searchName) {
		
		for(int i = 0; i < friendsCount; i++) {
			
			if (myFriends[i].name.equalsIgnoreCase(searchName)) {
				
				System.out.println("Yes " + searchName+ " is there");
				System.out.println("And their number is: "+ myFriends[i].cellNumber);
				return myFriends[i];
			}
		}
		
		System.out.println("Name doest exist");
		return null;	
	}
	
	

}
