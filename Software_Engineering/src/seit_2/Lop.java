package seit_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Lop {
	ArrayList<Person> personList;
	
	public Lop() {
		this.personList = new ArrayList<Person>();
	}
			
	public void add(Person p) {
		personList.add(p);
	}
	
	public void remove(Person p) {
		personList.remove(p);
	}
	
	public Person find(String name) {
		for (int i = 0; i < personList.size(); i++) {
			if (personList.get(i).getName().equals(name)) {
				return personList.get(i);
			}
		} return null;
	}
	
	public void print() {
		Iterator<Person> itr = personList.iterator();
		while(itr.hasNext()) {
			Person p = (Person)itr.next();
			System.out.println(p.getName());
		}
//		for (int i = 0; i < personList.size(); i++) {
//			personList.get(i).print(System.out);
//			System.out.println("\n");
//		}
	}
	
	
	
}
