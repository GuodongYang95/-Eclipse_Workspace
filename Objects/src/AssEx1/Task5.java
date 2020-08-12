package AssEx1;

public class Task5 {
	public static void main(String[] args) {
        table(13,5);
        table(-2,7);
        table(3,6);
	}
	public static void table(int x, int y) {
		if ((x < 0 || x >=10)||(y < 0 || y >= 10)){
			System.out.println("Error, rows and columns must be >0 and <10");
			return;
		}else {
			int i = 0;
			while(i<x) {
				int j = 0;
				System.out.print(" ");
				while(j<y) {
					System.out.print("(" + i + "," + j + ")");
					System.out.print("\t");
					j++;
				}System.out.print("\n");
				i++;
				
			}
		}
	}
}
