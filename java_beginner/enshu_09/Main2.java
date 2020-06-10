    public class Main2 {
        // healメソッド
        public static void heal(int hp) {
            hp += 10;
        }
        // healメソッドをオーバーライド
        public static void heal(Thief thief) {
            thief.hp += 10;
        }
        // mainメソッド
        public static void main(String[] args) {
        int baseHp = 25;
        /*
        インスタンス生成時にbaseHP(int 25)をHP引数としてクラス変数へ代入
        クラス型変数のため参照渡しとなり呼び出し先のアドレスが引数へコピーされる
        */
        Thief t = new Thief("アサカ", baseHp);
          // 出力結果は25:25
        System.out.println(baseHp + " : " + t.hp);
          // baseHPを引数としてhealメソッドに渡してもint型のため値渡しとなり呼び出し元の値は変化しない
        heal(baseHp);
          // クラス変数Thiefのtを引数としてheal(Thief thief)メソッドを実行、変数tのHPが10増える
        heal(t);
          // 出力結果は25：35
        System.out.println(baseHp + " : " + t.hp);
    }    
}