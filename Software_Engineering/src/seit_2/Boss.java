package seit_2;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.ListIterator;

public class Boss extends Person{
	int nWorker;
	private ArrayList<Worker> worker;
	ListIterator<Worker> itr;
	
	public Boss(String n, Date b) {
		super(n, b);
		nWorker=0;
		worker = new ArrayList<Worker>();
		itr = worker.listIterator();
	}
	
	public void add_worker(Worker w) {
		worker.add(w);
	}
	
	public void sub_worker(Worker w) {
		worker.remove(w);
		}
	
	public Worker next() {
		if(itr.hasNext()) {
			Worker w = (Worker)itr.next();
			nWorker++;
				return w;
		}else {
				return null;
		}
	}
	
	public void reset() {
		while(itr.hasPrevious()) {
			itr.previous();
			nWorker--;
			if (nWorker == 1) {
				break;
			}
		}
	}
	
	public void print(PrintStream ps) {
		super.print(ps);
		ps.print(" bosses: ");
		for (int i = 0; i < nWorker; i++) {
			ps.print(worker.get(i).getName() + " ");
		}ps.print("\n");
}
	
	
}
	

