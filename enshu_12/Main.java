public class Main {
    public static void main(String[] args) {
        // インスタンスAをX型変数objと見なす
        X obj = new A(); 
        // インターフェイス：Xに定義されたa()が呼び出されるが、implements, extendsを辿り
        // 最終継承先のクラスAのメソッドが呼び出される
        obj.a();
        // シンボルが見つからず、コンパイルエラーになる。
        // obj.b();
        // obj.c();

        // インスタンスAをY型変数y1と見なす
        Y y1 = new A();
        // インスタンスBをY型変数y1と見なす
        Y y2 = new B();
        // 中身はインスタンスAのためAのメソッドが実行される、下記も同じ
        // 出力Aa
        y1.a();
        // 出力Ba
        y2.a();

        // 配列の型はクラスA、Bと共通のメソッドをもつ親クラス：Yを用いる
        Y array[] = new Y[2];
        array[0] = new A();
        array[1] = new B();
        // 拡張for(代入型 代入変数：配列名)
        for(Y y : array) {
            y.b();
        }
    }
}