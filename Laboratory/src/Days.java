
public class Days {
	
	public static void main(String[] args) {
		
		String month = "Feb";
		int thisyear = 2020;
		boolean isLeap;
		isLeap = (thisyear % 4 == 0 && thisyear % 100 != 0)|| thisyear % 400 == 0;
		
		if (isLeap) {
			System.out.println(thisyear + " is a leap year.");
		}else {
			System.out.println(thisyear +" is not a leap year. ");
		}
		
		if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul")
				|| month.equals("Aug") || month.equals("Oct") || month.equals("Dec") ) {
			System.out.println(month + " has 31 days.");
			
		}else if (month.equals("Feb") && (isLeap == true) ){
			System.out.println(month + " has 29 days.");
		}else if (month.equals("Feb") && (isLeap == false)) {
			System.out.println(month + " has 28 days.");
		}
		else {
			System.out.println(month +" has 30 days.");
			
		}
	}


	
}
