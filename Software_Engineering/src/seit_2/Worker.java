package seit_2;

import java.io.PrintStream;

public class Worker extends Person{
	private Boss boss;
	public Worker(String n, Date b, Boss boss) {
		super(n, b);
		this.boss = boss;
	}
	
	public void new_boss(Boss b) {
		boss = b;
	}
	
	public Boss get_boss() {
		return boss;
	}
	
	public void print(PrintStream ps) {
		super.print(ps);
		ps.print(" is bossed by " + boss.getName() + "\n");
	}

}
