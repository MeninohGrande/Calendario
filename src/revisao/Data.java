package revisao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Data {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		SimpleDateFormat dataformat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat TimeZoneFomart = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		TimeZoneFomart.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = dataformat.parse("25/06/2018 16:10:00");
		
		Date d1 = new Date();
		@SuppressWarnings("deprecation")
		Date d = new Date("25/10/2020 11:55:00");
		Date d2 = new Date(System.currentTimeMillis());
		
		System.out.println("y1 = " + y1);
		System.out.println("y2 = " + dataformat.format(y2));
		System.out.println("d = " + dataformat.format(d));
		System.out.println("d1 = " + dataformat.format(d1));
		System.out.println("d2 = " + dataformat.format(d2));
	
		
		
	}

}
