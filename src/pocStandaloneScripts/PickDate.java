package pocStandaloneScripts;

import java.util.Calendar;

public class PickDate {

	public static void main(String[] args) {
		
		
		System.out.println(java.time.LocalDate.now());  
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.getTime());

	}

}
