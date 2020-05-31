public class Thief {
    String name;
    int hp;
    int mp;
    
    // コンストラクタのオーバーロード(呼び出し=>実行)
    // 3 => 1
    Thief(String name) {
        // 仮引数を受け取れないフィールドに値を直接渡す
        this(name, 40, 5);
    }

    // 2 => 2
    Thief(String name, int hp) {
        this(name, hp, 5);
    }

    // 1 => 3
    Thief(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }


}
