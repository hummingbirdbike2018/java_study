import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;

/*
2��ڂ���Date, Calendar�̈����͓��
*/
public class Main {
	public static void main(String[] args) {
        // 2-1
        Date now = new Date();                  //���ݓ���
        Calendar cl = Calendar.getInstance();   //������
        cl.setTime(now);                        //Date->Calendar��
        cl.add(Calendar.DAY_OF_MONTH, 100);     //100���ǉ�
        Date future = cl.getTime();             //Calendar->Date��
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy�NMM��dd��");
        System.out.println(fmt.format(now));
        System.out.println(fmt.format(future));
        



        // 2-2 TimeAPI�͒����I�ɂ킩��₷��
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt2 = ldt.plusDays(100);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        System.out.println(ldt2.format(dtf));  
	}
}