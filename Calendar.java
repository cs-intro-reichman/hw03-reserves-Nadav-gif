/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	// static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
        int year = Integer.parseInt(args[0]);
        advance(year);
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance(int year) {
		for (int i = 1900; i <= year; i++) {
            for (int j = 1; j <= 12; j++) {
                for (int k = 1; k <= nDaysInMonth(month, year); k++) {
                    if (dayOfWeek % 7 == 0) {
                        if (i == year) {
                            System.out.println(k + "/" + j + "/" + i + " Sunday");
                        }
                        dayOfWeek = 0;
                    } else {
                        if (i == year) {
                            System.out.println(k + "/" + j + "/" + i);
                        }
                    }
                    dayOfWeek++;
                }
            }
        }
	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
        boolean leap_year = ((year % 400) == 0 ) || ((year % 4) == 0) && ((year % 100 != 0));
        return leap_year;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
        int days = 0;
        switch (month) {
            case 1:
                days = 31;
                break;
            case 2:
                if (isLeapYear(year) == true) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;
        }
        return days;
	}
}
