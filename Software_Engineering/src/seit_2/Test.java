package seit_2;


public class Test {
	public static void main(String[] args) {
		Date currentDate = new Date(20, 1, 2020);
		Date dateOfBirth = new Date(19, 12, 1995);
		Person p1 = new Person("Gordon", dateOfBirth);
		Person p2 = new Person("Baby", currentDate);
		Lop personList = new Lop();
		
		System.out.println("----------Date Test-----------");
		currentDate.print(System.out);
		System.out.println("\n" + currentDate.getDay());
		System.out.println(currentDate.getMonth());
		System.out.println(currentDate.getYear());
		
		System.out.println("\n" + currentDate.diffInYears(dateOfBirth));
		
		System.out.println("----------Person Test-----------");
		p1.print(System.out);
		System.out.println("\n" + p1.getName());
		System.out.println(p1.getAge(currentDate));
		
		System.out.println("----------Lop Test-------------");
		System.out.println(" Test add()");
		personList.add(p1);
		personList.add(p2);
		personList.print();
		
		System.out.println("----Test find()----");
		Person p3 = personList.find("Gordon");
		p3.print(System.out);
		
		System.out.println("\n" + "----Test remove()----");
		personList.remove(p1);
		personList.print();
		
	}
}
