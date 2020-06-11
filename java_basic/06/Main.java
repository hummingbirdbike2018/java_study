import java.util.*;
import java.util.stream.*;
import java.lang.Thread;

public class Main {
    public static void main(String[] args) {
        /*
        第１級オブジェクト
        データ：数字や文字
        データ構造：配列、リスト
        インスタンス
        関数：IPO構造を伴う処理ロジック
        */

        /*
        メソッドと関数の違い
        メソッドはクラスに属する一種の関数
        関数はメソッドを変数に代入でき、生成することができる
        インターフェース名 変数名 = 代入されるメソッドが所属するクラス::メソッド名
        */
        MyFunction func = Main::sub; // 宣言したインタフェース型に代入, 実体が生成されるのではなく参照する形
    	int a = func.call(5, 3);	// インタフェースのメソッドで呼び出し
        System.out.println("5-3は" + a);
        /*
        ラムダ式
        関数をその場で定義し、呼び出すことができる
        */
        // 「2つの引数の差を求める処理」の実体を生み出し、代入する
        // (型 引数名１, 引数名2...)-> {処理１， 処理2... return 戻り値} 
        MyFunction func2 = (int b, int c) -> {return b - c; }; // ここで関数の実体が生成される
        int d = func2.call(5, 3);	/* インタフェースのメソッドで呼び出し */
        System.out.println("5-3は" + d);
        /* 省略記法
        1.型を省略できる
        IntBinaryOperator function = (a) -> {return a * a; }; 
        2.引数が１つのみの場合())を省略できる
        IntBinaryOperator function = a -> {return a * a; }; 
        3.単一return文の場合return,{}を省略できる
        IntBinaryOperator function = a ->  a * a; 
        */
        
        /*
        外部ブロックへのアクセス
        アクセス可能な変数をラムダ式内で読み込めるが、変更はできない
        */
        int x = 10;
        MyFunction2 func3 = e -> e - x; 

        /* コレクションでよく行う処理 */
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        // 各要素を２倍にする(ラムダ式)
        /* streamインスタンスがもつforeachメソッドで
        引数１つの関数オブジェクトを受け取り、コレクションの各要素へ関数を実行する */
        list1.stream().forEach(i -> System.out.println(i * 2));
        // 並列処理版
        list1.parallelStream().forEach(i -> System.out.println(i * 2));
        // 各要素に対しsleepを呼び出す(ラムダ式)
        // list1.stream().forEach(i -> i.sleep());                      //コンパイルエラーsleepが見つからない,Thread

        // 配列に対しstream
        int[] data = {1, 2, 3};
        IntStream its = Arrays.stream(data);

    }

    public static int sub(int a, int b) {
        return a - b; 
    }
} 