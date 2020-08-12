package seit_2;

public class Test2 {
	public static void main(String[] args) {
		Date d1 = new Date(19, 12, 1995);
		Date d2 = new Date(11, 10, 2000);
		Date d3 = new Date(23, 8, 1999);
		Boss b1 = new Boss("Vayne", d1);
		Worker w1 = new Worker("Raven", d2, b1);
		Worker w2 = new Worker("Ezreal", d3, b1);
		
//		b1.add_worker(w1);
//		b1.add_worker(w2);
//		System.out.println(b1.next().getName());
//		b1.print(System.out);
		
		Lop personList = new Lop();
		personList.add(b1);
		personList.add(w1);
		personList.add(w2);
		
		personList.print();
	}
}
