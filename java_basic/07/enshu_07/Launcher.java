import java.lang.*;
import java.lang.reflect.Method;

public class Launcher {
	public static void main(String[] args) {
        String fqcn = args[0];						//第一引数、起動すべきクラスのFQCN、コマンドライン引数として受け取るためargs[]にいれる
        String sw = args[1];						//第二引数、起動方法を示す文字 I or E、うえと同じくargs[]に入れる
		showMemory();								//メモリ使用量
		// 本来の処理
        try {
            Class<?> clazz = Class.forName(fqcn);	//第一引数のクラス情報をclazzに代入
            listMethods(clazz);						//クラスのもつメソッド一覧を表示
            if(sw.equals("E")) {					//第二引数がEの場合
                lanchExternal(clazz);				//lanchExternalメソッドを実行
            } else if(sw.equals("I")) {				//第二引数がIの場合
                lanchInternal(clazz);				//lanchInternalメソッドを実行
            } else {
                throw new IllegalArgumentException(	//IとEどちらでもない引数の場合、例外を発生させる
                    "起動方法の指定が不正です"
                );
			}
			// 例外処理
            } catch(Exception e) {							
                System.out.println(e.getMessage());	//エラーメッセージを取得
                e.printStackTrace();				//スタックトレース（エラー内容）を出力
                System.exit(1);  					//異常終了する
            }
            showMemory();							//try処理後のメモリ消費量を表示
            System.exit(0);							//通常終了する
        }

		// メソッド一覧を表示するメソッド
        public static void listMethods(Class<?> clazz) {		//クラス情報を引数として
            System.out.println("メソッドの一覧を表示します");  		//メッセージ
            Method[] methods = clazz.getDeclaredMethods();		//Methodインスタンスでメソッド一覧を配列で受け取る
            for(Method m : methods) {							//拡張forで
                System.out.println(m.getName());  				//配列の内容（メソッド）を一個ずつ表示
            }
        }
		//外部プロセスメソッド
        public static void lanchExternal(Class<?> clazz) throws Exception {		//クラス情報を引数として
            ProcessBuilder pb = new ProcessBuilder("java", clazz.getName());	//プロセスビルダーでコマンドラインより、javaに引数としてクラス名を渡し実行 -> java MemoryEater 
            Process proc = pb.start();											//起動する
            proc.waitFor();														//プロセスの終了まで待つ
        }

		// リフレクションメソッド
        public static void lanchInternal(Class<?> clazz) throws Exception {		//クラス情報を引数として
            Method m =  clazz.getMethod("main", String[].class);				//(呼び出すメソッド名,引数の型(同名メソッドがある場合のみ))を取得しmに入れる
            String[] args = {};													//引数配列を用意
			m.invoke(null, (Object)args);										//invokeメソッドでmainメソッドを呼び出し各引数を渡す
			/* 第一引数：静的メソッドの第一引数はnull、
			第二引数：呼び出しメソッドに渡す引数、Object型へのキャストが必要 */
		}

		// ここのロジックのみ思いついた
		// 現在のメモリ使用量をMB表示するメソッド
        public static void showMemory() {
        long t = Runtime.getRuntime().totalMemory();							//総メモリ量
        long f = Runtime.getRuntime().freeMemory();								//空きメモリ量
        long u = (t - f) / 1024 / 1024;											//総メモリ-空きメモリ=使用メモリ量
        System.out.println("現在のメモリ使用量：" + u + "MB");  				   
		}
		
		
}
/*
コマンドライン引数の起動方法
java Launcher 動作させるクラス(第一引数) E or I(第二引数)
*/

