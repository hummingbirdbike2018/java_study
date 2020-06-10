/* cloneインターフェース実装
Cloneableクラスにメソッドはない、複製に対応していることを表明するだけのクラス */
class Hero implements Cloneable {
    String name;
    int hp;
    Sword sword;

    Hero(String name) {
        this.name = name;
    }
    /*
    Objectのcloneはprotectedのためpublicでオーバーライド
    アクセス修飾は親クラスと同じかそれより緩いものに制約される
    新たなインスタンスをnew、フィールドを全コピーしてreturnする内容を記述
    戻り値は自身のクラス名
    */
    public Hero clone() {
        Hero result = new Hero(name);
        result.name = this.name;
        result.hp = this.hp;
        result.sword = this.sword;
        return result;
    }
    // ObjectクラスのtoStringをオーバーライド
    public String toString() {
        return "勇者(名前=" + this.name + "/HP=" + this.hp + "/装備している剣=" + this.sword.getName() +")";
    }

    // ObjectクラスのhashCodeをオーバーライド
    public int hashCode() {
        int result = 30;                            //初期値は適当
        result = result * 31 + name.hashCode();     //各フィールドの影響を与える
        result = result * 31 + hp;                  //乗数に奇数かつ素数である31を用いる
        return result;                              //結果
    }

    // Objectクラスのequalsをオーバーライド
    public boolean equals(Object o) {                               //引数はObject型
        if(o == this) return true;                                  //自身が引数の場合true
        if(o == null) return false;                                 //nullが引数はfalse
        if(!(o instanceof Hero)) return false;                   //型が異なるならばfalse
        Hero r = (Hero) o;                                    //比較できるよう同型にキャスト
        if(!this.name.trim().equals((r.name.trim()))) {   //空白を除去した名前が正しければ等価
            return false;
        }
        return true;                                                //全てパスしたらtrue
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    public Sword getSword() {
        return this.sword;
    }
}