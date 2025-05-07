package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ListContact;
import entities.Person;

public class ContactServices {
		Scanner sc = new Scanner(System.in);
		int option;
		
		ListContact listContact = new ListContact();
		Person p = new Person();
		int listSize = listContact.sizeContact();
		
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
			p = new Person(name, lastName, number, description);
			listContact.addContact(p);
			listSize+=1;
		}
		
		public void viewContact() {
			listContact.showContacts();
		}
		
		public List<Person> searchContactByName(String name) {
			List<Person> result = new ArrayList<>();
			for(Person p : listContact.getContacts()) {
				if(p.getName().equalsIgnoreCase(name)) {
					result.add(p);
				}
			}
			return result;
		}
		
		public List<Person> searchContactByLastName(String lastName){
			List<Person> result = new ArrayList<>();
			for(Person p : listContact.getContacts()) {
				if(p.getLastName().equalsIgnoreCase(lastName)) {
					result.add(p);
				}
			}
			return result;
		}
		
		public List<Person> seachContactByFullName(String name, String lastName){
			List<Person> result = new ArrayList<>();
			for(Person p: listContact.getContacts()) {
				if(p.getName().equalsIgnoreCase(name)) {
					if(p.getLastName().equalsIgnoreCase(lastName)) {
						result.add(p);
					}
				}
			}
			return result;
		}
}
