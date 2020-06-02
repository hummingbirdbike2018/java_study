import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 現在日時をdate型で取得
        Date now = new Date();
        Calendar c = Calendar.getInstance();
        // 取得した日時情報をCalenderにセット
        c.setTime(now);
        // Calenderから日の数値を取得
        int day = c.get(Calendar.DAY_OF_MONTH);
        // 取得した値に＋100してCalenderの日にセット
        //  day += 100;
        //  c.add(Calendar.DAY_OF_MONTH);
        c.add(Calendar.DAY_OF_MONTH, 100);
        // Calender日時情報をDate型に変換
        // Date future = c.getTime();
        now = c.getTime();
        // SimpleDataFormatで指定された形式でDateインスタンスの内容表示
        SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日");
        String s = f.format(now);
        // System.out.println(f.format(future);
        System.out.println(s);
    }
}