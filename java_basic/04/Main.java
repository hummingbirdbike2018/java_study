import java.util.*;

/*
全てのクラスはObjectクラスのメソッドを持っている
Object型変数にはあらゆるインスタンスを入れられる
*/
public class Main {
	public static void main(String[] args) {
                Set<Hero> list = new HashSet<>();
                Hero h1 = new Hero("ミナト");
                Sword s = new Sword("鋼の剣");
                h1.setSword(s);
                System.out.println("装備：" + h1.getSword().getName());
                list.add(h1);
                System.out.println("要素数：" + list.size());
                /*
                インスタンスは変数への代入では参照されるだけでコピーはされない
                cloneメソッドはインスタンスのnewと全フィールドコピーの機能を持っている
                */
                // h1をクローン
                Hero h2 =h1.clone();
                /*
                コピー元の装備を変更
                別クラスのインスタンスフィールドを複製したい場合、そのクラスにもCloneableを実装し
                対象フィールドをresuly field = this,field.clone();のように記述する
                */
                h1.getSword().setName("ヒノキの棒");
                // コピー元の装備を表示
                System.out.println(h1.getSword().getName());
                // コピー先の装備を表示
                System.out.println(h2.getSword().getName());  

                /* 
                5つの基本操作
                *toString 文字列表現を得る
                *equals 等価判定
                *hashCode ハッシュ値を得る
                compareTo 大小関係を判定
                clone 複製
                */

                /*
                各クラスの開発者は適切な出力が得られるようObjectメソッドをオーバーライドする責務がある
                オーバーライド前 Hero@6ff3c5b5 <- これでは意味不明
                オーバーライド後 勇者(名前=鈴木/HP=100/MP100)
                */
                System.out.println(h1); //toStringの結果が出力

                /*
                等値と等価の違い
                等価(equals)：参照するアドレス異なっていても同じ内容ならtrue。別々のインスタンス内のフィールド値が同じなど
                等価判定の基準を開発者が定める（オーバーライド）必要がある。初期値は"等値"になっている
                等値(==)：参照するアドレスが同じ、完全に同一。同一インスタンス内の同じフィールド値を指しているなど
                Hash系コレクションでは大体同じか？->その中からequalsで厳密に判定する
                */
                Account num = new Account("123456 ");
                Account num2 = new Account(" 123456");
                Account num3 = num;
                System.out.println(num.equals(num2));   //オーバーライド前は等値なのでfalse
                System.out.println(num.equals(num3));    

                /*
                ハッシュ値の条件：ハッシュ値は等価インスタンスからは同じハッシュ値、そうでない場合 "なるべく" 異なるハッシュ値が得られる
                上記を満たすようhashCodeをオーバライドする必要がある
                hash値の比較は整数同士の比較なので高速。hashCode->equalsの順で実行される
                */
                h1 = new Hero("ミナト");
                list.remove(h1);        //nameフィールドが一致する要素の削除
                System.out.println("要素数：" + list.size()); 
                
                /*
                compareToメソッドは自然順序づけの法則を定義する。並び替えるといったら降順、昇順など
                インスタンス引数objと自身の大小関係を比較、obj>は負の数、obj<の場合は正の数、＝は０を返す
                Collections.sort実行時、compareToを呼び出しながらソートする
                */
                List<Integer> numbers = new ArrayList<>();
                numbers.add(1111);
                numbers.add(3333);
                numbers.add(2222);
                Collections.sort(numbers);      //定義した自然順序づけに習いソート
                for(int i : numbers) {
                        System.out.println(i);  
                }  
        }
}