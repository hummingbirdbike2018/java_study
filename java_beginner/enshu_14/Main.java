/*
オブジェクト型
Object型には通常のデータ型を除き、あらゆるクラスインスタンスを格納できる
*/

public class Main {
public static void main(String[] args) {
        // Object型インスタンスo 実態はAccountクラスのインスタンス
        Object o = new Account("4649", 1592);

        System.out.println(o.toString());
        System.out.println(o.equals(o));
    }
}