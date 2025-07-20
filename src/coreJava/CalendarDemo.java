package coreJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cl = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat sdf = new SimpleDateFormat();
				
		System.out.println(sd.format(cl.getTime()));
		System.out.println(sdf.format(cl.getTime()));
		System.out.println(cl.get(Calendar.DAY_OF_MONTH));
		System.out.println(cl.get(Calendar.DAY_OF_WEEK));
		System.out.println(cl.get(Calendar.AM));
		System.out.println(cl.get(Calendar.AM_PM));
		System.out.println(cl.get(Calendar.MARCH));

	}

}
