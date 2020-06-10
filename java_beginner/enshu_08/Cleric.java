import java.util.Random;

public class Cleric {
    private String name;
    private int hp = 50;
    final static int MAX_HP = 50;
    private int mp = 10;
    final static int MAX_MP = 10;
    
    Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public void selfAid() {
        this.mp -= 5;
        this.hp += MAX_HP;
        System.out.println(this.name + "はセルフエイドを使った! MPを" + this.mp + "消費した！ HPが" + this.hp + "回復した!");
    }

    public int pray (int sec) {
        Random rd = new Random();
        // 論理上の回復量 0~2の乱数+秒
        int rec = rd.nextInt(3) + sec;
        // ！！ロジックが思いつかなかったポイント！！
        // 実際の回復量 (最大MP-現在MP,論理上の回復量)のどちらか小さい値を出力
        int acc  = Math.min(this.MAX_HP - this.mp, rec);
        // 現在MPに加算する
        this.mp += acc;
        System.out.println(this.name + "は" + sec + "秒祈った！ MPが" + acc+ "回復した!");
        return acc;
    }
}