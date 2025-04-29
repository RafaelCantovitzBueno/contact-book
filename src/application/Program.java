package application;

import java.util.Scanner;

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
			System.out.println("4 - Edit a registered contact");
			System.out.println("5 - Remove a contact");
			System.out.println("0 - Exit");
			System.out.print("Enter a number:");
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
