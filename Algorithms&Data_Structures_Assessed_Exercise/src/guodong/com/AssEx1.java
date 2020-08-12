//Guodong Yang	2431298y
package guodong.com; // Remember to remove the package name

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

//add any import statements you need here


public class AssEx1 {
    
	
	/** read strings from file 
     * and add them to an array. Assume that in the file there is one string
     * per line.
     * @param filename
     * return array
     */
	public static String[] readFromFile(String fileName){
		File file = new File(fileName);
		BufferedReader br = null;
		String myArray[] = new String[69];
		
		try {
			br = new BufferedReader(new FileReader(file));
			String birdsInfo = null;
			int i = 0;

			while((birdsInfo = br.readLine()) != null) {
				myArray[i] = birdsInfo;
				i++;
				birdsInfo = "";
			}
			
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return myArray; 
	}
	
	
	/**
	 * Add all of the elements of an array of Strings
	 * to a set of strings - note repeats will disappear
	 * your set should be instantiated as a TreeSet (see lecture 1)
	 */
	public static Set<String> arrayToSet(String[] myArray){
		Set<String> stringSet = new TreeSet<String>();
		String content = null;
		int counter = 0;
		
		while(counter < myArray.length){
			for (int i = 0; i < myArray.length; i++) {
				content = myArray[i];
				
				if (!stringSet.contains(content)) {
					stringSet.add(content);
				}
			}
			counter ++;
		}
		return stringSet;
	}
	
	
	/** randomly re-order an array
	 * 
	 * @param origArray
	 */
	public static void jumbleArray(String[] origArray){
		ArrayList<String> jumList = new ArrayList<String>();
		for (int i = 0; i < origArray.length; i++) {
			jumList.add(origArray[i]);
		}
		Collections.shuffle(jumList);
		
		for (int i = 0; i < origArray.length; i++) {
			origArray[i] = jumList.get(i);
		}
	}
		
	
	
	/** create a string consisting all of the elements in an array,
	 * one element per row.
	 * Use a for--each loop to return them in the order in which they 
	 * are stored
	 */
	public static String arrayToString(String[] stringArray){
		String stringContent = "";
			for (String stringPerRow : stringArray) {
				stringPerRow += "\n";
				stringContent += stringPerRow;
			}
		return stringContent;
	}
	
	/** create a string consisting of all of the elements in a set,
	 * one element per row.
	 * Use a for--each loop to return them in the order in which they 
	 * are stored
	 */
	public static String setToString(Set<String> stringSet){
		String setContent = "";
			for (String stringPerRow : stringSet) {
				stringPerRow += "\n";
				setContent += stringPerRow;
			}
			return setContent;
	}
	
	
	
	/**
	 * main method - do not edit this
	 * @param args
	 */
	public static void main(String[] args){
		String fileName = args[0];
		String[] originalArray = readFromFile(fileName);
		System.out.println("the array has length " + originalArray.length + "\n");
		String[] newArray1 = originalArray.clone();
		String[] newArray2 = originalArray.clone();
		
		jumbleArray(newArray1);
		jumbleArray(newArray2);
		
		System.out.print("The original array is:\n");
		System.out.print(arrayToString(originalArray) + "\n");
		
		System.out.print("The frst jumbled array is:\n");
		System.out.print(arrayToString(newArray1) + "\n");
		System.out.print("The corresponding set is:\n");
		System.out.print(setToString(arrayToSet(newArray1))+"\n");
		
		System.out.print("The second jumbled array is:\n");
		System.out.print(arrayToString(newArray2) + "\n");
		System.out.print("The corresponding set is:\n");
		System.out.print(setToString(arrayToSet(newArray2)) + "\n");
		
		
		
		}
	
}
