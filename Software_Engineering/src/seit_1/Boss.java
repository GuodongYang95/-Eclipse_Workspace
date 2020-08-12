package seit_1;

import java.io.PrintStream;

public class Boss extends Person {
	private int nworkers;
	private Person[] worker;
	
	public Boss(String n, int d, int m, int y) {
		super(n, d, m, y);
		worker = new Person[10];
		nworkers = 0;	
	}
	
	public void print(PrintStream ps) {
			super.print(ps);
			ps.print(" bosses: ");
			for (int i = 0; i < nworkers; i++) {
				ps.print(worker[i].getName() + " ");
			}ps.print("\n");
	}
	
	public void numberOfWokers(Worker... workers) {
		for (int j = 0; j < workers.length; j++) {
			worker[nworkers++] = workers[j];
			workers[j].whoIsBoss(this);
		}
	}
}
