public class Main {
    public static void main(String[] args) {
        // 宣言する型 変数名 ＝ hoge;
        int a = 3;
        int b = 5;
        int c = a * b;
        // '+'はメモリの消費が多いため、現場ではほとんど使わない
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

        // 基本的に文字列はString、数値はint、少数はdoubleを使う
    }
}