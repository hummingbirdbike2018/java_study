public class Thief {
    String name;
    int hp;
    int mp;
    
    /*
    オーバーロード ： 多重定義。引数を変えて定義することで同名メソッドを複数定義できる
    オーバーライド ： 上書き定義。継承先クラスでスーパークラスと同名メソッドを引数や実行内容を変えて定義する
    コンストラクタはオーバライドできない
    コンストラクタのオーバーロード(呼び出し=>実行)
    */
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
