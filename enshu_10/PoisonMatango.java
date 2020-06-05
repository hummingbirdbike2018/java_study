public class PoisonMatango extends Matango {

    int suffix;
    // 毒攻撃回数
    int attack_times = 5;
    // 子コンストラクタ
    PoisonMatango(char suffix) {
        // オーバーロード
        super(suffix);
    }
    // 攻撃メソッド
    public void attack(Hero h) {
        // 継承元クラスのメソッド呼び出し
        super.attack(h);
        //毒攻撃フラグ
        if(this.attack_times > 0) {
            System.out.println("さらに毒の胞子をばら撒いた");
            // 勇者のHP1/5に相当するポイント
            int damaged  = h.hp / 5;
            // 勇者のHPから引く
            h.hp -= damaged;
            System.out.println(damaged + "ポイントのダメージ！");
            // 攻撃回数1マイナス
            this.attack_times--;
        }
    }
}
