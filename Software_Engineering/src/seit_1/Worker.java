package seit_1;

import java.io.PrintStream;

public class Worker extends Person {
	private Person boss;
	
	public Worker(String n, int d, int m, int y) {
		super(n, d, m, y);
		boss = null;
	}

	public void print(PrintStream ps) {
		super.print(ps);
		ps.print(" is bossed by " + boss.getName() + "\n");
	}
	
	public void whoIsBoss(Person b) {
		boss = b;
	}

}
