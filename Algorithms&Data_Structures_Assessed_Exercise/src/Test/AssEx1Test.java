package Test;

import org.junit.jupiter.api.Test;

import guodong.com.AssEx1;

class AssEx1Test {
	String fileName = "./birds.txt";
	AssEx1 a = new AssEx1();
	
	@Test
	 void test() {
		String[] originalArray = a.readFromFile(fileName);
		System.out.println("the array has length " + originalArray.length + "\n");
		String[] newArray1 = originalArray.clone();
		String[] newArray2 = originalArray.clone();
		
		a.jumbleArray(newArray1);
		a.jumbleArray(newArray2);
		
		System.out.print("The original array is:\n");
		System.out.print(a.arrayToString(originalArray) + "\n");
		
		System.out.print("The frst jumbled array is:\n");
		System.out.print(a.arrayToString(newArray1) + "\n");
		System.out.print("The corresponding set is:\n");
		System.out.print(a.setToString(a.arrayToSet(newArray1))+"\n");
//		
		System.out.print("The second jumbled array is:\n");
		System.out.print(a.arrayToString(newArray2) + "\n");
		System.out.print("The corresponding set is:\n");
		System.out.print(a.setToString(a.arrayToSet(newArray2)) + "\n");
	}

}

