package AssessedExercise;

public class CalculateAndCount {
	public static void main(String[] args) {
		int[] X = {3, -6, 27, 101, 50, 0, -20, -21, 19, 6, 4, -10};
		int n = 12;
		int possum = 0;
		int negcount = 0;
		int oddcount = 0;
		
		for (int i = 0; i < n; i++) {
			if (X[i]>=0) { // Calculate the sum of all the elements of x that are nonnegative.
				possum += X[i];
				if (X[i]>=0 && X[i]%2 != 0) { //Count the number of positive elements of X that are odd numbers. 
					oddcount++;
				}
			}else { // Count the number of elements of X that are negative.
				negcount++;
			}
			
		}
		System.out.println("possum :" + possum + " oddcount:"+ oddcount + " negcount:"+ negcount);
	}
	}
	
