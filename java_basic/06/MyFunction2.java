/* SAMインターフェースは汎用性の高いものがjava.util.functionパッケージに用意されている */
public interface MyFunction2 {                   // SAMインターフェースを定義, 名前は自由
    public abstract int call(int x);     //格納したい関数と戻り値int, 引数int２つの抽象メソッドを準備
}