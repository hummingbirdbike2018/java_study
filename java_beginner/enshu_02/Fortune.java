// ライブラリ読み込み
import java.util.*;

public class Fortune {
    public static void main(String[] args) {
        System.out.println("ようこそ、占いの館へ");
        System.out.println("あなたの名前を入力してください");
        // スキャナ初期化
        Scanner sc = new Scanner(System.in);
        // 別の書き方
        // String name = new java.util.Scanner(System.in).nextLine();
        // 入力された文字列を受け取る
        String name = sc.next();
        System.out.println("あなたの年齢を入力してください");
        String ageString = sc.next();
        // String型をint型にキャスト,(int)の表記では式（ex:1 +2）ではないためエラーになる
        int age = Integer.parseInt(ageString);
        // 乱数ジェネレーター初期化
        Random rd = new Random();
        // 別の書き方
        // int fortune = new java.util.Random().nextInt(num);
        // ０?３の４つの数値を引数として乱数を生成
        int fortune = rd.nextInt(4);
        // インクリメントで＋１
        fortune++;
        System.out.println("占いの結果が出ました");
        System.out.println(age + "歳の" + name + "さん、あなたの気運番号は" + fortune + "です");
        System.out.println("1：大吉　2：中吉　3：吉　4：凶");
    }
}