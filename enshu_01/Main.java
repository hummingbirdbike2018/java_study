/* 基本データ型
    整数 byte < short < int < long
    少数 曖昧 float, 普通 double
    真偽 boolean = ture of false 
    文字 char
    文字列 String */
public class Main {
    public static void main(String[] args) {
        // データ型 変数名 ＝ 代入するデータ;
        int a = 3;
        int b = 5;
        int c = a * b;
        // '+'はメモリの消費が多いためループ処現では使わない
        System.out.println("縦幅" + a + " 横幅" + b + "の長方形の面積は、" + c);
        // 真偽値
        boolean result = true;
        // 一文字だけ、シングルクォーテーションで囲む
        char ch = '駆';
        // 少数
        double pai = 3.14;
        // 桁数の多い数値、最後のLはlong
        long l = 314159265853979L;
        // 文字列
        String message = "ミナトの攻撃！敵に15ポイントのダメージ";

        /* 後から同じ変数が宣言されると内容が上書きされる
            値の上書きを禁止する場合、定数を用いる
            定数は慣例として大文字を用いる
            final データ型  定数名 = 代入するデータ */
        final int CONST = 100;

        // 基本的に文字列はString、数値はint、少数はdoubleを使う
    }
}