package entities;

import java.util.ArrayList;
import java.util.List;

public class ListContact {

	List<Person> list = new ArrayList<>();

	public void addContact(Person person) {
		list.add(person);
	}

	public List<Person> getContacts() {
		return list;
	}

	public void showContacts() {
		for (Person p : list) {
			System.out.println(p);
		}
	}
	
	public int sizeContact() {
		return list.size();
	}
	
	public Person removeContact(int index) {
		return list.remove(index);
	}

}
