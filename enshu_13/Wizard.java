public class Wizard {
    private int hp;//HP
    private int mp;//MP
    private String name;//名前
    private Wand wand;//装備している杖
    
    void heal(Hero h) {
        System.out.println(this.name + "は" + getWand().getName() + "を装備している");
        int basePoint = 10;                                   // 基本回復ポイント
        /*
        wand.powerではフィールドがprivateのためアクセス不可
        getWand().getPower() = セットされたwandインスタンスの(.)powerフィールドを呼び出し
        */
        int recovPoint = (int)(basePoint * getWand().getPower());  // 杖による増幅
        int cost_mp = 20; //消費MP
        System.out.println("MPを" + cost_mp + "消費した");
        int remaining_mp = (this.mp -= cost_mp);                     //残りMP
        System.out.println("残りMP：" + remaining_mp);
        h.setHp(h.getHp() + recovPoint);                      // 勇者のHPを回復する
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        if(name == null || name.length() < 3) {
            throw new IllegalArgumentException("設定値が異常です");
        }
        this.name = name;
    }

    int getHp() {
        return this.hp;
    }

    void setHp(int hp) {
        if(hp < 0) {
            this.hp = 0;
        }else{
            this.hp = hp;
        }
    }

    int getMp() {
        return this.mp;
    }

    void setMp(int mp) {
        if(mp < 0) {
            // 自ら例外を投げる
            throw new IllegalArgumentException("設定するMP値が異常です");
        }
        this.mp = mp;
    }

    Wand getWand() {
        return this.wand;
    }

    void setWand(Wand wand) {
        if(wand == null) {
            throw new IllegalArgumentException("設定する杖がnullです");
        }
        this.wand = wand;
    }
}
