package application;

import java.util.List;
import java.util.Scanner;

import entities.Person;
import services.ContactServices;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int option;
		
		ContactServices contactServices = new ContactServices();

		do {
			System.out.println("--- Contact Book ---");
			System.out.println("1 - Add a new contact");
			System.out.println("2 - View all contacts");
			System.out.println("3 - Search a contact");
			System.out.println("4 - Edit a registered contact (WIP)");
			System.out.println("5 - Remove a contact (WIP)");
			System.out.println("0 - Exit");
			System.out.print("Choose an option: ");
			option = sc.nextInt();
			sc.nextLine();
			switch (option) {
			case 1:
				contactServices.addContact();
				break;
			case 2:
				System.out.println("--- Contacts ---");
				contactServices.viewContact();
				break;
			case 3:
				System.out.println("--- Search a Contact ---");
				System.out.println("Search contact by: ");
				System.out.println("1 - Name");
				System.out.println("2 - Last Name");
				System.out.println("3 - Full name");
				System.out.println("Enter your choice: ");
				option = sc.nextInt();
				sc.nextLine();
				if(option == 1) {
					System.out.println("Enter the name to search: ");
					String name = sc.nextLine();
					List<Person> found = contactServices.searchContactByName(name);
					if(found.isEmpty()) {
						System.out.println("No contact with the name '" + name + "' was found.");
					}
					else {
						System.out.println("--- Contacts ---");
						for(Person p : found) {
							System.out.println(p);
						}
					}
				}
				if(option == 2) {
					System.out.println("Enter the last name to search: ");
					String lastName = sc.nextLine();
					List<Person> found = contactServices.searchContactByLastName(lastName);
					if(found.isEmpty()) {
						System.out.println("No contact with the last name '" + lastName + "' was found.");
					}
					else {
						System.out.println("--- Contacts ---");
						for(Person p : found) {
							System.out.println(p);
						}
					}
				}
				if(option == 3) {
					System.out.println("Enter the name to search: ");
					String name = sc.nextLine();
					System.out.println("Enter the last name to search: ");
					String lastName = sc.nextLine();
					List<Person> found = contactServices.seachContactByFullName(name, lastName);
					if(found.isEmpty()) {
						System.out.println("No contact with the name '" + name + "' and the last name '" + lastName + "' was found.");
					}
					else {
						System.out.println("--- Contacts ---");
						for(Person p : found) {
							System.out.println(p);
						}
					}
				}
				break;
			case 4:
				break;
			case 5:
				break;
			case 0:
				System.out.println("Thanks to use! Exiting...");
				break;
			default:
				System.out.println("Prease input a valid number!");
				break;
			}
		} while (option != 0);

		sc.close();

	}
}
