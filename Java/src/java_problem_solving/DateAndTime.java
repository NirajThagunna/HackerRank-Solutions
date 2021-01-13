package java_problem_solving;

import java.util.Calendar;

// date and time
public class DateAndTime {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 22);
		cal.set(Calendar.MONTH,6);
		cal.set(Calendar.YEAR,2011);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	}
}
