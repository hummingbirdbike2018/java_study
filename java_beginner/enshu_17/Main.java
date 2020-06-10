import jdk.jfr.StackTrace;

/*
文法エラー、実行時エラー、論理エラーに対処する

Error系例外は打つ手なし
Exception系例外は必ずキャッチする(回復見込みのあるエラーのため)
RuntimeException系例外は任意
*/
public class Main {
	public static void main(String[] args) {
        try {
            // 17?1, 17-2
            // String s = null;
            // 17-3
            int i = Integer.parseInt("三");      //NumberFormatException
            // System.out.println(s.length());     //NullPointerException  
        } catch(Exception e) {                  //多態性でExceptionを一括りにする
            // JVMがどのような経緯でエラーが出たかを記録した情報、スタックトレース
            System.out.println("--スタックトレースここから--");  
            System.out.println(e);  
            System.out.println("--スタックトレースここまで--");  
        } finally {
            //例外のあるなしに関わらず、必ず行う後片付け処理。close()など
        }

        /* 
        try-with-resorce文
        finally記述なしでも自動でclose();してくれる（AutoClosableを実装したAPI限定）
        */
        try(後片付けが必要な変数の宣言) {
            // 本来の処理
        } catch(Exception e) {
            // 例外処理
        }
	}
}