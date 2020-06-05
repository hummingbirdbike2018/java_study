/* 
commentパッケージの前半クラスをインポート
ディレクトリ構造 enshu_06/comment/Zenhan.class
*/
import comment.Zenhan;

public class Main {
    public static void main(String[] args) throws Exception {
        // インポートしたのでパッケージ名は不要
        Zenhan.doWarusa();
        Zenhan.doTogame();
        /*
        インポートしていないのでFQDN（完全限定クラス）指定
        パッケージ名.クラス名.メソッド名
        */
        comment.Kouhan.callDeae();
        comment.Kouhan.showMondokoro();
    }
}
