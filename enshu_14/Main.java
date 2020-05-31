public class Main {
public static void main(String[] args) {
        // Object型には通常の型を除き、あらゆるクラスを格納できる
        // Object型インスタンスo 実態はAccountクラスのインスタンス
        Object o = new Account("4649", 1592);

        System.out.println(o.toString());
        System.out.println(o.equals(o));
    }
}