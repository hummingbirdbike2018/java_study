import java.time.*;
import java.time.format.*;

public class TimePractice {
	public static void main(String[] args) {
        // TimeAPI
        // 現在日時取得 エポック準拠
        Instant i1 = Instant.now();
        // long->Instant
        Instant i2 = Instant.ofEpochMilli(1600705425827L);
        // Instant->long
        long l = i2.toEpochMilli(); 
        // 現在日時を取得 ZoneId準拠
        ZonedDateTime z1 = ZonedDateTime.now();
        // 日指定して取得
        ZonedDateTime z2 = ZonedDateTime.of(2020,6,6,22,43,10, 11, ZoneId.of("Asia/Tokyo"));
        // ZonedDateTime->Instant
        Instant i3 = z2.toInstant();
        // Instant->ZonedDateTime
        ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
        // ZonedDateTimeのもつ日時情報を取り出す
        System.out.println("東京:"+ z1.getYear() + z1.getMonth() + z1.getDayOfMonth() + z1.getHour() + z1.getMinute());
        
        // 同じ瞬間か判定 isEqual
        if(z2.isEqual(z3)) {
            System.out.println("同じ瞬間である");  
        }

        //ZonedDateTimeのZoneIdなし版->曖昧な時間
        //現在日時取得 
        LocalDateTime l1 = LocalDateTime.now();
        System.out.println(l1);
        // LocalDateTime->ZonedDateTime ZoneId情報を付与
        ZonedDateTime z4 = l1.atZone(ZoneId.of("Asia/Tokyo"));
        // ZonedDateTime->LocalDateTime 
        LocalDateTime l2 = z4.toLocalDateTime();
        // フォーマット形式を設定
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        // フォーマット形式がきかない
        LocalDate l3 = LocalDate.parse("2020/06/10", fmt);
        System.out.println(l3);  
        String today = l2.format(fmt);
        System.out.println(today);

        // 未来の日付を取得
        // 10日後
        l1 = l1.plusDays(10);
        System.out.println(l1.format(fmt));
        // 1ヶ月後
        l1 = l1.plusMonths(1);
        System.out.println(l1.format(fmt));
        
        //過去の日付を取得
        // 1週間前
        l1 = l1.minusWeeks(1);
        System.out.println(l1.format(fmt));
        // １年前
        l1 = l1.minusYears(1);
        System.out.println(l1.format(fmt));
        
        // 現在の日付
        LocalDate now = LocalDate.now();
        // 現在から100日後の日付
        LocalDate pdate = now.plusDays(100);
        // nowがpdateより前の日付けにあたるか
        if(now.isBefore(pdate)) {
            System.out.println("100日後は未来の日付");
        }
        // nowがpdateより後の日付けにあたるか
        if(now.isAfter(pdate)) {
            System.out.println("100日後は過去の日付");
        }

        /*
        期間を表すクラス
        Duration:時・分・秒
        Period:日数ベース
        */
        LocalDate d1 = LocalDate.of(2020,6,1);
        LocalDate d2 = LocalDate.of(2020,6,30);
        
        //引数の値を日数換算
        Period p1 = Period.ofDays(7);
        // 引数１、２期間の日数
        Period p2 = Period.between(d1, d2);
        // 引数の値を年換算
        Period p3 = Period.ofMonths(1);

        System.out.println(p1); //P7D 
        System.out.println(p2); //P29D
        System.out.println(p3); //P1M
        
        LocalDateTime ldt1 = LocalDateTime.of(2020, 06, 01, 10, 00, 00);
        LocalDateTime ldt2 = LocalDateTime.of(2020, 06, 01, 11, 30, 30);
        // 引数１、２の期間の差分日数分秒
        Duration dr1 = Duration.between(ldt1, ldt2); 
        // 指定xxxx分をn時m分の単位にする
        Duration dr2 = Duration.ofMinutes(999999L); 

        System.out.println(dr1);  //PT1H30M30S
        System.out.println(dr2);  //PT16666H39M


	}
}