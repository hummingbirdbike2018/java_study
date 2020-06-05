/*
カプセル化
インスタンスのもつフィールドを誤って書き換えてしまう事を防ぐ
基本的にフィールドはprivate(子クラス、外部クラスからアクセスできない)で設定
フィールド値の変更はゲッター、セッターメソッドを使う
*/

public class Main {
    public static void main(String[] args) {
        Wizard wz = new Wizard();
        Wand wd = new Wand();
        Hero h = new Hero();

        wz.setName("魔法使い");
        wz.setHp(100);
        wz.setMp(100);
        wd.setName("不思議な杖");
        wd.setPower(10);
        wz.setWand(wd);
        h.setName("新人勇者");
        

        System.out.println(wd.getName());
        System.out.println(wz.getName());
        wz.heal(h);

    }
    
}