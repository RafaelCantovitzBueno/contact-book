package services;

import java.util.Scanner;

import entities.ListContact;
import entities.Person;

public class ContactServices {
		Scanner sc = new Scanner(System.in);
		int option;
		
		ListContact listContact = new ListContact();
		
		public void addContact() {
			System.out.println("--- Add a Person ---");
			System.out.print("First Name: ");
			String name = sc.nextLine();
			System.out.print("Last Name: ");
			String lastName = sc.nextLine();
			System.out.print("Telephony Number: ");
			String number = sc.nextLine();
			System.out.print("About: ");
			String description = sc.nextLine();
			Person person = new Person(name, lastName, number, description);
			listContact.addContact(person);
		}
		
		public void viewContact() {
			listContact.showContacts();
		}

}
