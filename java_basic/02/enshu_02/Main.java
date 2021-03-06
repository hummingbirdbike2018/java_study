import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;

/*
2回目だがDate, Calendarの扱いは難しい
*/
public class Main {
	public static void main(String[] args) {
        // 2-1
        Date now = new Date();                  //現在日時
        Calendar cl = Calendar.getInstance();   //箱準備
        cl.setTime(now);                        //Date->Calendarへ
        cl.add(Calendar.DAY_OF_MONTH, 100);     //100日追加
        Date future = cl.getTime();             //Calendar->Dateへ
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(fmt.format(now));
        System.out.println(fmt.format(future));
        



        // 2-2 TimeAPIは直感的にわかりやすい
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt2 = ldt.plusDays(100);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        System.out.println(ldt2.format(dtf));  
	}
}