import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;

/*
2‰ñ–Ú‚¾‚ªDate, Calendar‚Ìˆµ‚¢‚Í“ï‚µ‚¢
*/
public class Main {
	public static void main(String[] args) {
        // 2-1
        Date now = new Date();                  //Œ»Ý“úŽž
        Calendar cl = Calendar.getInstance();   //” €”õ
        cl.setTime(now);                        //Date->Calendar‚Ö
        cl.add(Calendar.DAY_OF_MONTH, 100);     //100“ú’Ç‰Á
        Date future = cl.getTime();             //Calendar->Date‚Ö
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy”NMMŒŽdd“ú");
        System.out.println(fmt.format(now));
        System.out.println(fmt.format(future));
        



        // 2-2 TimeAPI‚Í’¼Š´“I‚É‚í‚©‚è‚â‚·‚¢
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt2 = ldt.plusDays(100);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        System.out.println(ldt2.format(dtf));  
	}
}