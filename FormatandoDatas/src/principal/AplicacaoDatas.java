package principal;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class AplicacaoDatas {

	public static void main(String[] args) {
		
//		//Trabalhando com Date
//		Date data = new Date();
//		System.out.println(data);
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		System.out.println(sdf.format(data));
		
//		//Trabalhando com GregorianCalendar
//		GregorianCalendar calendar = new GregorianCalendar();
//		calendar.add(calendar.DAY_OF_YEAR, 10);
//		System.out.println(calendar.getTime());
//		System.out.println(sdf.format(calendar.getTime()));
		
		//Trabalhando com LocalDate e LocalDatetime
		LocalDate ld = LocalDate.now();
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("LocalDate: "+ld);
		System.out.println("LocalDateTime: "+ldt);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println("LocalDate: "+ld.format(dtf));
		System.out.println("LocalDateTime: "+ldt.format(dtf2));
		
		
	}

}
