// 自力で解決できなかった演習
import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeApi {
    public static void main(String[] args) {   
        // 現在日を取得(yyyyーMMーdd）
        LocalDate now = LocalDate.now();
        // 100日後の日を取得
        LocalDate future = now.plusDays(100);
        // 書式設定
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        // 100日後の日付を定義した書式に置き換える
        System.out.println(future.format(fmt));
    }  
}