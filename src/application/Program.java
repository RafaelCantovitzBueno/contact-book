package application;

import java.util.Scanner;

import entities.Person;
import services.ContactServices;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int option;
		
		ContactServices contactServices = new ContactServices();
		Person found = new Person();

		do {
			System.out.println("--- Contact Book ---");
			System.out.println("1 - Add a new contact");
			System.out.println("2 - View all contacts");
			System.out.println("3 - Search a contact");
			System.out.println("4 - Edit a registered contact");
			System.out.println("5 - Remove a contact");
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
				System.out.println("2 - Last Name (WIP)");
				System.out.println("3 - Full name (WIP)");
				System.out.println("Enter your choice: ");
				option = sc.nextInt();
				sc.nextLine();
				if(option == 1) {
					System.out.println("Enter the name to search: ");
					String name = sc.nextLine();
					found = contactServices.searchContactByName(name);
					if(found == null) {
						System.out.println("No contact with the name '" + name + "' was found.");
					}
					else {
						System.out.println(found);
					}
				}
				if(option == 2) {
					System.out.println("Sorry, this option is currently unavailable.");
				}
				if(option == 3) {
					System.out.println("Sorry, this option is currently unavailable.");
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
