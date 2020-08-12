import javax.swing.SwingUtilities;

public class Exam1 {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			new SwingThread();
		});
		
		int x, y;
		
		if (x == 3) // The "Check"
		{
		   y = x * 5; // The "Act"   // If another thread changed x in between "if (x == 3)" and "y = x * 5" above,
		   // y will not be equal to 15.
		}
		
		// Obtain lock for x
		if (x == 3)
		{
		   y = x * 5; // Now, nothing can change x until the lock is released. 
		              // Therefore y = 15
		}
		// release lock for x


	}
}
