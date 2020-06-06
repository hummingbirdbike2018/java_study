import java.util.*;

public class StringPractice {
	public static void main(String[] args) {
        String st1 = "Java Script";
        String st2 = "　java  ";
        String st3 = "JAVA PROGRAM";
        String st4 = "";
        int i1 = 2020;

        // 同じ文字列(ケース区別)か判定 戻り値 bool
        System.out.printf("equals:%s\n", st1.equals(st2));
        // 同じ文字列か判定 戻り値 bool
        System.out.printf("equalsIgnoreCase:%s\n", st1.equalsIgnoreCase(st2));
        // 文字列の長さを比較 戻り値 int
        System.out.printf("length:%s\n", st3.length());
        // 空文字判定 戻り値 bool
        System.out.printf("isEmpty:%s\n", st4.isEmpty());  
        // 指定した文字列を含むか 戻り値 bool
        System.out.printf("contain:%s\n", st1.contains("ja"));
        // 指定した文字列で始まるか 戻り値 bool
        System.out.printf("startsWith:%s\n", st1.startsWith("j")); 
        // 指定した文字列で終わるか 戻り値 bool
        System.out.printf("endsWith:%s\n", st1.endsWith("a"));
        // カウントを始める一文字目は０となり、ケースも区別される
        // 指定した文字列が最初から数えて何番目か 戻り値 int
        System.out.printf("indexOf:%s\n", st1.indexOf("Script"));
        // 指定した文字列うが最後から数えて何番目か 戻り値 int
        System.out.printf("lastIndexOf:%s\n", st1.lastIndexOf("Script"));
        // 指定の箇所の一文字を切り出す
        System.out.printf("charAt:%s\n", st1.charAt(5));
        // 指定位置から始まる文字列を任意の長さ切り出す(先頭位置は0から始まり、終了位置?1まで)
        System.out.printf("substring:%s\n", st1.substring(1, 4));
        // 小文字変換
        System.out.printf("toLowerCase:%s\n", st1.toLowerCase());
        // 大文字変換
        System.out.printf("toUpperCase:%s\n", st1.toUpperCase());
        // 前後のスペースを削除（全角スペースは除去できない）
        System.out.printf("trim:%s\n", st2.trim());
        // 文字列を置換え
        System.out.printf("replace:%s\n", st1.replace(st1, "JavaAPI"));


        // 文字列の連結
        StringBuilder sb = new StringBuilder();
        // コレクションArrayList
        ArrayList<String> array = new ArrayList<String>();
        array.add(st1);
        array.add(st2);
        array.add(st3);
        // 配列内要素を連結して一時メモリに記録
        for(String str : array) {
        sb.append(str);
        }
        // メモリから変数へ
        String result = sb.toString();
        System.out.printf("StringBuilder:%s\n", result);


        // 正規表現
        Scanner sc = new Scanner(System.in);
        System.out.println("２?8文字以内で名前を入力してくだい。");
        String name = sc.nextLine();
        // matches
        if(name.matches("[a-zA-Z][a-zA-Z0-9]{1,7}")) {
            System.out.println("入力した名前は：" + name + "です");
        } else {
            System.out.println("２?8文字以内、先頭の数字の使用および、記号は使用不可です。");
        }

        System.out.println("Sから始まるid10桁を入力し最後にEを付けてくだい");
        String user_id = sc.nextLine();
        if(user_id.matches("^S.\\d{10}$E")) {
            System.out.println("入力したidは：" + user_id + "です");
        } else {
            System.out.println("IDの形式が不正です");
        }
        
        // 文字列句切り
        String sn = "Q87F-FGJG-9889-KGJD";
        String[] serial = sn.split("[-]");
        for(String s : serial) {
            System.out.printf("%5s", s);  
        }
        System.out.println("\n");

        // 一部置換え
        String str = "FizzBuzzFizzBuzzFizz";
        String rep = str.replaceAll("[B][a-z]{3}", "Fizz");
        System.out.println(rep);

    }  
}