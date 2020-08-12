
public class Days_3 {
	public static void main(String[] args) {
		String month = "Feb";
		int thisyear = 2019;
		
		System.out.println(countdays(thisyear, month));
		
	}

	public static int countdays(int thisyear, String month) {
		
			if (month.equals("Jan") || month.equals("Mar") || month.equals("May") 
					|| month.equals("Jul")
					|| month.equals("Aug") || month.equals("Oct") 
					|| month.equals("Dec")||month.equals("Feb")) {
		
				if (((thisyear % 4 == 0 && thisyear % 100 != 0) || thisyear % 400 == 0) 
						&& month.equals("Feb")) {
					return 29;
				} else if (!((thisyear % 4 == 0 && thisyear % 100 != 0) 
						|| thisyear % 400 == 0) && month.equals("Feb")){
					return 28;
			}else {
					return 31;
					}
				
			} else {
					return 30;
			}

			}

}


