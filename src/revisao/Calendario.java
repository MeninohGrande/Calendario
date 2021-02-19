package revisao;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Calendario {

	public static void main(String[] args) {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
	Date d = Date.from(Instant.parse("2020-01-18T16:57:00Z"));
	System.out.println(sdf.format(d));

	
	Calendar cal = Calendar.getInstance();
	cal.setTime(d);
	cal.add(Calendar.HOUR_OF_DAY, 5);
	System.out.println(" Hora antes do calendario: " + sdf.format(d));
	d = cal.getTime();
	System.out.println(" Hora depois do calendario: " + sdf.format(d));
	
	Integer dia = cal.get(Calendar.DAY_OF_MONTH);
	
	Integer hora = cal.get(Calendar.HOUR_OF_DAY);
	
	Integer minutos = cal.get(Calendar.MINUTE);
	
	System.out.println	(	"Dia: " + dia +
							", Hora: " + hora + 
							", Minutos: " + minutos);
	System.out.println(sdf.format(cal.getTime()));
	}

}
