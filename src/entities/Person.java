package entities;

public class Person {

	private String name;
	private String lastName;
	private String number;
	private String description;
	
	public Person() {
		
	}
	
	public Person(String name, String lastName, String number, String description) {
		this.name = name;
		this.lastName = lastName;
		this.number = number;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return 	"Name: " + name + "\n"
				+ "Last name: " + lastName + "\n"
				+ "Phone number: " + number + "\n"
				+ "About: " + description + "\n"
				+ "-----------------------------";
	}
	
}
